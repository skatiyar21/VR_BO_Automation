package scenarios;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.GlobalPageObj;
import ReusableFunctions.DashboardAction;
import ReusableFunctions.LoginAction;
import ReusableFunctions.QuizAction;
import TestSuiteBase.SuiteBase;
import TestSuiteBase.SuiteUtility;
import Utility.Read_XLSX;
import Utility.Report;

public class login extends SuiteBase {
	Read_XLSX FilePath = null;
	String SheetName = null;
	String TestCaseName = null;
	String ToRunColumnNameTestCase = null;
	String ToRunColumnNameTestData = null;
	String TestDataToRun[] = null;
	static boolean TestCasePass = true;
	static int DataSet = -1;
	static boolean Testskip = false;
	static boolean Testfail = false;
	SoftAssert s_assert = null;

	@BeforeTest
	public void checkCaseToRun() throws Exception {
		// Called init() function from SuiteBase class to Initialize .xls Files
		init();
		// To set TestCaseListHealthCare.xls file's path In FilePath Variable.
		FilePath = TestCaseListVR;
		TestCaseName = this.getClass().getSimpleName();

		// SheetName to check CaseToRun flag against test case.
		SheetName = "TestCasesList";
		// Name of column In TestCasesList Excel sheet.
		ToRunColumnNameTestCase = "CaseToRun";
		// Name of column In Test Case Data sheets.
		ToRunColumnNameTestData = "DataToRun";

		// To check test case's CaseToRun = Y or N In related excel sheet.
		// If CaseToRun = N or blank, Test case will skip execution. Else It will be
		// executed.
		if (!SuiteUtility.checkToRunUtility(FilePath, SheetName, ToRunColumnNameTestCase, TestCaseName)) {
			// To report result as skip for test cases In TestCasesList sheet.
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "SKIP");
			// To throw skip exception for this test case.
			throw new SkipException(
					TestCaseName + "'s CaseToRun Flag Is 'N' Or Blank. So Skipping Execution Of " + TestCaseName);
		}
		// To retrieve DataToRun flags of all data set lines from related test data
		// sheet.
		TestDataToRun = SuiteUtility.checkToRunUtilityOfData(FilePath, TestCaseName, ToRunColumnNameTestData);

		htmlReport("Virgin Red");
		Report.start("~Virgin RED :: Back Office App~");
		reporter.write("<html>");

		// To Initialize browser.
		loadWebBrowser();
		Add_Log.info("WebBrowser is instantiated");
		driver.get(Param.getProperty("ApplicationURL"));
		Add_Log.info("WebBrowser is Launched");
		driver.manage().deleteAllCookies();
	}

	// Accepts 4 column's String data In every Iteration.
	@Test(dataProvider = "VerginRed")
	public void SuiteOneCaseTwoTest(String username, String password, String dashboardTab, String preview, String show,
			String title, String label, String description, String subtitle, String points, String rank,
			String startdate, String file, String ques_count, String quizquestion, String opt_description, String brand,
			String category, String tag, String login_flag, String logout_flag, String ScreenShotLink)
			throws Exception {

		DataSet++;

		// Created object of testng SoftAssert class.
		s_assert = new SoftAssert();

		// If found DataToRun = "N" for data set then execution will be skipped for that
		// data set.
		if (!TestDataToRun[DataSet].equalsIgnoreCase("Y")) {
			// If DataToRun = "N", Set Testskip=true.
			Testskip = true;
			throw new SkipException(
					"DataToRun for row number " + DataSet + " Is No Or Blank. So Skipping Its Execution.");
		}

		// If found DataToRun = "Y" for data set then bellow given lines will be
		// executed.
		try {
			// Login Method
			Report.testCase("===Login Screen=== - Test Data - " + (DataSet + 1), (DataSet + 1));
			if (login_flag.equalsIgnoreCase("y")) {
				LoginAction.LoginActionVerification(username, password);
			}
			threadwait();
			// Dashboard Method
			Report.testCase("===Dashboard Screen=== - Test Data - " + (DataSet + 1), (DataSet + 1));
			DashboardAction.DashboardActionVerification(dashboardTab);
			threadwait();
			Report.testCase("===Dashboard Screen=== - Test Data - " + (DataSet + 1), (DataSet + 1));
			QuizAction.AddQuizAction(preview, show, title, label, description, subtitle, points, rank, startdate, file,
					ques_count, quizquestion, opt_description, brand, category, tag);
			threadwait();
			// Logout Method
			if (logout_flag.equalsIgnoreCase("y")) {
				Report.testCase("===Logout Screen=== - Test Data - " + (DataSet + 1), (DataSet + 1));
				click(GlobalPageObj.admin_btn(), "Admin");
				click(GlobalPageObj.logout_link(), "Logout");
			}
			Thread.sleep(5000);

			String passScreenshotPath = passscreenshot(TestCaseName, DataSet + 1);
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "ScreenShotLink", DataSet + 1, passScreenshotPath);

			if (Testfail) {
				// At last, test data assertion failure will be reported In testNG reports and
				// It will mark your test data, test case and test suite as fail.
				s_assert.assertAll();
			}

			Report.stop(Param.getProperty("ApplicationURL"), TestCaseName);
			TestfailCounter = 0;
		}

		catch (Exception e) {
			String failScreenshotPath = failScreenshot(TestCaseName, DataSet + 1);
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "ScreenShotLink", DataSet + 1, failScreenshotPath);
			Testfail = true;
			Report.stop(Param.getProperty("ApplicationURL"), TestCaseName);
			TestfailCounter = 0;
			// Logout.Logout().click();
			Add_Log.error(e);
		}
		if (Testfail) {
			// At last, test data assertion failure will be reported In testNG reports and
			// It will mark your test data, test case and test suite as fail.
			s_assert.assertAll();
		}
	}

	// @AfterMethod method will be executed after execution of @Test method every
	// time.
	@AfterMethod
	public void reporterDataResults() {
		if (Testskip) {
			// If found Testskip = true, Result will be reported as SKIP against data set
			// line In excel sheet.
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "SKIP");
		} else if (Testfail) {
			System.out.println("Fail");
			// To make object reference null after reporting In report.
			s_assert = null;
			// Set TestCasePass = false to report test case as fail In excel sheet.
			TestCasePass = false;
			// If found Testfail = true, Result will be reported as FAIL against data set
			// line In excel sheet.
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "FAIL");
		} else {
			System.out.println("Pass");

			// If found Testskip = false and Testfail = false, Result will be reported as
			// PASS against data set line In excel sheet.
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "PASS");
		}
		// At last make both flags as false for next data set.
		Testskip = false;
		Testfail = false;
	}

	// This data provider method will return 4 column's data one by one In every
	// Iteration.
	@DataProvider
	public Object[][] VerginRed() {
		// To retrieve data from Data 1 Column,Data 2 Column,Data 3 Column and Expected
		// Result column of SuiteOneCaseTwo data Sheet.
		// Last two columns (DataToRun and Pass/Fail/Skip) are Ignored programatically
		// when reading test data.
		return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);
	}

	// To report result as pass or fail for test cases In TestCasesList sheet.
	@AfterTest
	public void closeBrowser() {
		// To Close the web browser at the end of test.
		closeWebBrowser();
		if (TestCasePass) {
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "PASS");
		} else {
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "FAIL");

		}
		reporter.write("\n</html>");
		reporter.close();
	}
}
