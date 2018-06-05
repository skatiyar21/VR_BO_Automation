//Author : Shailendra Katiyar :- Sr. Quality Analyst
package TestSuiteBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import Utility.Read_XLSX;
import Utility.Report;

public class SuiteBase {
	public static Read_XLSX TestSuiteListExcel = null;
	public static Read_XLSX TestCaseListVR = null;
	public static Logger Add_Log = null;
	public boolean BrowseralreadyLoaded = false;
	public static Properties Param = null;

	public static WebDriver driver = null;
	public static WebDriver ExistingchromeBrowser;
	public static WebDriver ExistingmozillaBrowser;
	public static WebDriver ExistingIEBrowser;
	protected static PrintWriter reporter = null;
	static String screenShotPath = "";
	public static int TestfailCounter = 0;

	public void init() throws IOException {
		// To Initialize logger service.
		String log4jConfigFile = System.getProperty("user.dir") + "//log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Add_Log = Logger.getLogger("rootLogger");

		// Please change file's path strings bellow If you have stored them at location
		// other than bellow.
		// Initializing Test Suite List(TestSuiteList.xls) File Path Using Constructor
		// Of Read_XLS Utility Class.
		TestSuiteListExcel = new Read_XLSX(System.getProperty("user.dir") + "\\ExcelFiles\\TestSuiteList.xlsx");
		// Initializing IRS Test Suite (IRS.xls) File Path Using Constructor Of Read_XLS
		// Utility Class.
		TestCaseListVR = new Read_XLSX(System.getProperty("user.dir") + "\\ExcelFiles\\VirginRed.xlsx");
		// Bellow given syntax will Insert log In applog.log file.
		Add_Log.info("All Excel Files Initialised successfully.");

		// Initialize Param.properties file.
		Param = new Properties();
		FileInputStream fip = new FileInputStream(
				System.getProperty("user.dir") + "//PropertiesFiles//Param.properties");
		Param.load(fip);
		Add_Log.info("Param.properties file loaded successfully.");
	}

	// Edited Time format used while saving screen shots
	public static String Time() {
		SimpleDateFormat NewDateformat = new SimpleDateFormat("dd-MM-yy HH:mm:ss:SSS");
		Date now = new Date();
		String Date = NewDateformat.format(now);
		return Date.replace(":", "-");
	}

	// For Taking screen shot
	public static String takeScreenShot() {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			screenShotPath = System.getProperty("user.dir").concat("/ScreenShots/") + Time().concat(".jpg");
			FileUtils.copyFile(source, new File(screenShotPath));
		} catch (FileNotFoundException fnfe) {
			Add_Log.info("In takeScreenShot " + fnfe.getMessage());
			System.out.print("File not found" + fnfe);
		} catch (IOException e) {
			Add_Log.info("In takeScreenShot " + e.getMessage());
		} catch (Exception e) {
			Add_Log.info("In takeScreenShot " + e.getMessage());
		}
		return screenShotPath;
	}

	@SuppressWarnings("deprecation")
	public void loadWebBrowser() {
		// Check If any previous webdriver browser Instance Is exist then run new test
		// In that existing webdriver browser Instance.
		if (Param.getProperty("testBrowser").equalsIgnoreCase("Mozilla") && ExistingmozillaBrowser != null) {
			driver = ExistingmozillaBrowser;
			return;
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("chrome") && ExistingchromeBrowser != null) {
			driver = ExistingchromeBrowser;
			return;
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("IE") && ExistingIEBrowser != null) {
			driver = ExistingIEBrowser;
			return;
		}

		if (Param.getProperty("testBrowser").equalsIgnoreCase("Mozilla")) {
			// To Load Firefox driver Instance.
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//BrowserDrivers//geckodriver.exe");
			driver = new FirefoxDriver();
			ExistingmozillaBrowser = driver;
			Add_Log.info("Firefox Driver Instance loaded successfully.");
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("Chrome")) {
			// To Load Chrome driver Instance.
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//BrowserDrivers//chromedriver.exe");
			driver = new ChromeDriver();
			ExistingchromeBrowser = driver;
			Add_Log.info("Chrome Driver Instance loaded successfully.");
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("IE")) {
			// To Load IE driver Instance.
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			capabilities.setCapability("requireWindowFocus", true);
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "//BrowserDrivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
			ExistingIEBrowser = driver;
			Add_Log.info("IE Driver Instance loaded successfully.");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void closeWebBrowser() {
		driver.close();
		driver.quit();
		// null browser Instance when close.
		ExistingchromeBrowser = null;
		ExistingmozillaBrowser = null;
		ExistingIEBrowser = null;
	}

	// Method to check Complete Page To Load
	public static void checkPageIsReady() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long wt = Long.parseLong(Param.getProperty("checkpagereadytime"));
		for (int i = 0; i < 30; i++) {
			try {
				Thread.sleep(wt);
				System.out.println("*******************-" + i);
			} catch (InterruptedException e) {
			}

			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	// Method to check Complete Page To Load
	public static void threadwait() throws InterruptedException {
		long th_time = Long.parseLong(Param.getProperty("threadwaittime"));
		Thread.sleep(th_time);
	}

	// This method is to take screenshot for Success
	public static String passscreenshot(String TCName, int dataset) throws Exception {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyyh-mm-ss");
		String CurrentDate = sdf.format(date);

		File file = new File(System.getProperty("user.dir") + "\\ScreenShots\\Success\\" + TCName);
		file.mkdirs();
		String PathName = System.getProperty("user.dir") + "\\ScreenShots\\Success\\" + TCName + "\\";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile,
				new File(PathName + TCName + "-" + "DataSet-" + dataset + "-" + CurrentDate + ".png"));
		String passScreenshotPath = PathName + TCName + "-" + "DataSet-" + dataset + "-" + CurrentDate + ".png";
		passScreenshotPath = passScreenshotPath.replace("\\", "/");
		return passScreenshotPath;
	}

	// This method is to take screenshot for Failure
	public String failScreenshot(String TCName, int dataset) throws Exception {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyyh-mm-ss");
		String CurrentDate = sdf.format(date);

		File file = new File(System.getProperty("user.dir") + "\\ScreenShots\\Failures\\" + TCName);
		file.mkdirs();
		String PathName = System.getProperty("user.dir") + "\\ScreenShots\\Failures\\" + TCName + "\\";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile,
				new File(PathName + TCName + "-" + "dataset-" + dataset + "-" + CurrentDate + ".png"));
		String failScreenShotPath = PathName + TCName + "-" + "dataset-" + dataset + "-" + CurrentDate + ".png";
		failScreenShotPath = failScreenShotPath.replace("\\", "/");
		return failScreenShotPath;
	}

	// HTML Custom Report File
	public void htmlReport(String Status) throws FileNotFoundException {
		Date date = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String CurrentDate2 = sdf2.format(date);

		// Creating Folder for HTML Report
		File LogsDir = (new File(System.getProperty("user.dir") + "/TestResults"));
		LogsDir.mkdirs();
		reporter = new PrintWriter(
				System.getProperty("user.dir").concat("/TestResults/" + Status + "-" + CurrentDate2 + ".html"));
	}

	// For sendKeys Operation
	public static void sendkeys(WebElement element, String objectName, String objectValue) {
		try {

			highlightElement(element);
			element.click();
			element.clear();
			element.sendKeys(objectValue);
			// element.sendKeys(Keys.TAB);
			Report.pass("Element : " + objectName + " :: Value Entered= " + objectValue);
			Add_Log.info(objectName + "  Value Entered");
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to enter value to  " + objectName, takeScreenShot());
			Add_Log.info("Failed to enter value to  " + objectName + e.getMessage());
			throw (e);
		}
	}

	// For click of a web element
	public static void click(WebElement element, String objectName) {
		try {

			highlightElement(element);
			element.click();
			Report.pass("Clicked on " + objectName);
			Add_Log.info("Clicked on " + objectName);
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to click on " + objectName, takeScreenShot());
			Add_Log.info("In click " + e.getMessage());
			throw (e);
		}
	}

	// For click of a web element using JavascriptExecutor
	public static void clickJSE(WebElement element, String objectName) {
		try {

			highlightElement(element);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			Report.pass("Clicked on " + objectName + " Element");
			Add_Log.info("Clicked on " + objectName + " Element");
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to click on " + objectName + " Element", takeScreenShot());
			Add_Log.info("Failed to click on " + objectName + e.getMessage());
			throw (e);
		}
	}

	// For click of a web element By Actions Class
	public static void clickByActionsClass(WebElement element, String objectName) {
		try {

			highlightElement(element);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			Report.pass("Clicked on " + objectName);
			Add_Log.info("Clicked on " + objectName);
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to click on " + objectName, takeScreenShot());
			Add_Log.info("In click " + e.getMessage());
			throw (e);
		}
	}

	// For click of a web element By Actions Class
	public static void scroll(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			Add_Log.info("In click " + e.getMessage());
			throw (e);
		}
	}

	// For selecting an option from the drop down.
	public static void selectDropDownValue(WebElement dropdownOptions, String dropDownName, String dropdownValue) {
		try {
			highlightElement(dropdownOptions);
			Select option = new Select(dropdownOptions);
			option.selectByValue(dropdownValue);
			Report.pass("Dropdown : " + dropDownName + " :: Value Selected= " + dropdownValue);
			Add_Log.info(dropDownName + " Value " + dropdownValue + " Selected Sucessfully");
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to select value from  " + dropDownName, takeScreenShot());
			Add_Log.info("Not able to Select " + dropDownName + " Value " + dropdownValue + e);
			throw (e);
		}
	}

	// For selecting an option from the drop down.
	public static void selectDropDownbyVisibleText(WebElement dropdownOptions, String dropDownName,
			String dropdownValue) {
		try {
			highlightElement(dropdownOptions);
			Select option = new Select(dropdownOptions);
			option.selectByVisibleText(dropdownValue);
			Report.pass("Dropdown : " + dropDownName + " :: Value Selected= " + dropdownValue);
			Add_Log.info(dropDownName + " Value " + dropdownValue + " Selected Sucessfully");
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to select value from  " + dropDownName, takeScreenShot());
			Add_Log.info("Not able to Select " + dropDownName + " Value " + dropdownValue + e);
			throw (e);
		}
	}

	// For selecting an option from the drop down.
	public static void selectDropDownbyPartOfText(WebElement dropdownOptions, String dropDownName,
			String dropdownValue) {
		try {
			highlightElement(dropdownOptions);
			List<WebElement> options = dropdownOptions.findElements(By.tagName("option"));
			for (int i = 0; i < options.size(); i++) {
				if (options.get(i).getText().contains(dropdownValue)) {
					options.get(i).click();
					break;
				}
			}
			Report.pass("Dropdown : " + dropDownName + " :: Value Selected= " + dropdownValue);
			Add_Log.info(dropDownName + " Value " + dropdownValue + " Selected Sucessfully");
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to select value from  " + dropDownName, takeScreenShot());
			Add_Log.info("Not able to Select " + dropDownName + " Value " + dropdownValue + e);
			throw (e);
		}
	}

	// For checking the editable or non editable
	public static void edit_nonedit(WebElement element, String elementName, String elementValue) {
		try {
			highlightElement(element);
			if ((element.getAttribute(elementValue)) == null) {
				Report.editpass("Field : " + elementName, "Editable");
				Add_Log.info(elementName + " field is Editable");
			} else if ((element.getAttribute(elementValue)) != null) {
				Report.editpass("Field : " + elementName, "Non-Editable");
				Add_Log.info(elementName + " field is Non-Editable");
			}
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to check field  " + elementName, takeScreenShot());
			Add_Log.info("Not able to check " + elementName + " field is Editable or Non-Editable" + e);
			throw (e);
		}
	}

	// For checking the editable or non editable
	public static void mandt(WebElement element, String elementName, String elementValue) {
		try {
			highlightElement(element);
			if (element.getText().equalsIgnoreCase(elementValue)) {
				Report.mandtpass("Field : " + elementName, "Mandatory");
				Add_Log.info(elementName + " field is Mandatory");
			}
		} catch (Exception e) {
			TestfailCounter++;
			Report.fail("Failed to check field  " + elementName, takeScreenShot());
			Add_Log.info("Not able to check " + elementName + " field is Mandatory" + e);
			throw (e);
		}
	}

	// Highlighting the Element
	public static void highlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: black; border: 2px solid green;");
	}

}
