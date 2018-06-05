
package Utility;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import TestSuiteBase.SuiteBase;

// To generate the customized report of the test
public class Report extends SuiteBase {
	public Report() throws IOException {

	}

	static int sNo = 0;
	static int iteration = 0;
	static int noOfPass = 0;
	static int noOfFail = 0;
	static int TestDataCounter = 0;

	static String testScenarioName = "";
	// static PrintWriter reporter = null;
	static String startTime = null;
	static String endTime = null;

	// To Start the reporting such Report name and column headers.
	public static void start(String Project_Name) throws Exception {

		// Get current Date
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String CurrentDate = sdf.format(date);
		startTime = reportTime();
		// File LogsDir = (new File(System.getProperty("user.dir") + "/TestResults"+"-"
		// +System.currentTimeMillis()));
		// LogsDir.mkdirs();
		// reporter = new
		// PrintWriter(System.getProperty("user.dir").concat("/TestResults/Test_Result.html"));

		reporter.write("\n<table  width='100%' cellspacing='0' cellpadding='0' height='50'>\n"
				+ "<tr>\n<td width='100%' colspan='4' height='28'><p align='center'><b><font face='Arial Rounded MT Bold' size='5' color='#000080'>~Test Script Execution Result~</font></b></td>\n</tr>"
				+ "<tr>\n<td width='100%' colspan='4' height='28'><p align='center'><b><font face='Trebuchet MS' size='3' color='#3bbe6c'>"
				+ Project_Name + "</font></b></td>\n</tr>"
				+ "<tr>\n<td width='100%' colspan='4' height='28'><p align='center'><b><font face='Trebuchet MS' size='3' color='#cc79b2'>~Date: "
				+ CurrentDate + "~</font></b></td>\n</tr>\n</table>");
	}

	// To print the Test Case name
	public static void testCase(String Scenario_name, int testDataNumber) {
		sNo = 0;
		testScenarioName = Scenario_name + iteration;

		if (iteration != 0) {
			reporter.append("</div>");
		}
		if (!(testDataNumber == TestDataCounter)) {
			reporter.append(
					"\n<table border='1' width='100%' bordercolordark='#C0C0C0' cellspacing='0' cellpadding='0' bordercolorlight='#C0C0C0' bordercolor='#C0C0C0' height='50'>"
							+ "\n<head>\n<script language='Javascript' src='jqmin.js'></script>"
							+ "\n<script language='JavaScript'>" + "\n $('.collapseMerge').click(function () {"
							+ "\n $header = $('.collapseMerge');" + "\n $content = $('.content');"
							+ "\n $content.slideToggle(500, function () {" + "\n $header.text(function () {"
							+ "\n return $content.is(':visible') ? 'Collapse' : 'Expand';" + " }); \n });\n });"
							+ "\n</script>\n</head>"
							+ "\n<body>\n<tr>\n<td width='8%' align='center' bgcolor='#000099' height='35'><b>"
							+ "<font face='Verdana' size='2' color='#FFFFFF'>Test Case</font></b></td>"
							+ "\n<td width='41%' align='center' bgcolor='#000099' height='35'><b>"
							+ "<font face='Verdana' size='2' color='#FFFFFF'>Test Step Description</font></b></td>"
							+ "\n<td width='8%' align='center' bgcolor='#000099' height='35'><b>"
							+ "<font face='Verdana' size='2' color='#FFFFFF'>Mandatory/Editable/Non-Editable</font></b></td>"
							+ "\n<td width='12%' bgcolor='#000099' height='35' align='center'><b>"
							+ "<font face='Verdana' size='2' color='#FFFFFF'>Status</font></b></td>\n</tr> \n");
			TestDataCounter = testDataNumber;
		}

		reporter.append(
				"\n<div class='collapseMerge'>\n <tr>\n<td colspan= '3' width='12%' height='25' align='left'><p style='margin-left: 5'><b><font face='Verdana' size='2' color='#000099'>"
						+ Scenario_name + "</font></b></td>"+ "\n<td id='" + testScenarioName
						+ "' align = 'center'><p style='margin-left: 5'><b><font face='Verdana' size='2' color='blue'></b></font></td>"
						+ "\n</tr>\n</div>" + "\n<div class='content'>\n");
		iteration++;
	}

	// reporter.append("<script type='text/javascript'
	// src='file:///F:\\Workspace\\automation\\TestResults\\jquery-1.7.2.js'>"
	// + "alert('mn');$('.collapseMerge').click(function(){"
	// + "$(this).nextUntil(tr.collapseMerge).slideToggle(200)});"
	// + "</script>");

	// To write pass against the Test Case
	public static void writeTestStatusPass() {

		reporter.append("\n<script> \n document.getElementById('" + testScenarioName + "').innerHTML = 'Pass'.bold();"
				+ "\n document.getElementById('" + testScenarioName + "').style.color = 'green';" + "\n </script>");
	}

	// To write fail against the Test Case
	public static void writeTestStatusFail() {

		reporter.append("\n <script>\n document.getElementById('" + testScenarioName + "').innerHTML = 'Fail'.bold();"
				+ "\n document.getElementById('" + testScenarioName + "').style.color = 'red';" + "\n</script>\n");
	}

	// To write pass for a step in a Test Case
	public static void pass(String Scenario_Name) {
		sNo++;
		noOfPass++;
		reporter.append(
				"\n<tr>\n<td width='12%' height='25' align='left'><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
						+ "Step - " + sNo + "</font></td>"
						+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
						+ Scenario_Name + "</font></td>"
						+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'> - "
						+ "</font></td>"
						+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><b><font face='Verdana' size='2' color='green'>"
						+ "Pass</font></b></td>" + "\n </tr>\n");
	}

	// To write fail for a step in a Test Case
	public static void fail(String Scenario_Name, String ssPath) {
		sNo++;
		noOfFail++;
		reporter.write(
				"\n<tr>\n<td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
						+ "Step - " + sNo + "</font></td>"
						+ "\n<td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
						+ Scenario_Name + "</font></td>"
						+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'> - "
						+ "</font></td>"
						+ "\n<td width='12%' height='25' align='left' ><p style='margin-left: 5'><b><font face='Verdana' size='2' color='red'>"
						+ "<a href='" + ssPath + "' STYLE='color:red;font-weight: bold' target='_blank'>"
						+ "Fail</a></font></b></td>" + "\n</tr>\n");
	}

	// To write pass for a step in a Test Case
	public static void editpass(String Scenario_Name, String value) {
		sNo++;
		noOfPass++;
		if (value == "Editable") {
			reporter.append(
					"\n<tr>\n<td width='12%' height='25' align='left'><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
							+ "Step - " + sNo + "</font></td>"
							+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
							+ Scenario_Name + "</font></td>"
							+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='voilet'>"
							+ value + "</font></td>"
							+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><b><font face='Verdana' size='2' color='green'>"
							+ "Pass</font></b></td>" + "\n </tr>\n");
		} else if (value == "Non-Editable") {
			reporter.append(
					"\n<tr>\n<td width='12%' height='25' align='left'><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
							+ "Step - " + sNo + "</font></td>"
							+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
							+ Scenario_Name + "</font></td>"
							+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='voilet'>"
							+ value + "</font></td>"
							+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><b><font face='Verdana' size='2' color='green'>"
							+ "Pass</font></b></td>" + "\n </tr>\n");
		}
	}

	// To write pass for a step in a Test Case
		public static void mandtpass(String Scenario_Name, String value) {
			sNo++;
			noOfPass++;
			if (value == "Mandatory") {
				reporter.append(
						"\n<tr>\n<td width='12%' height='25' align='left'><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
								+ "Step - " + sNo + "</font></td>"
								+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>"
								+ Scenario_Name + "</font></td>"
								+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='voilet'>"
								+ value + "</font></td>"
								+ "\n <td width='12%' height='25' align='left' ><p style='margin-left: 5'><b><font face='Verdana' size='2' color='green'>"
								+ "Pass</font></b></td>" + "\n </tr>\n");
			}
		}


	// Reusable method to capture the timing operations in test
	public static String reportTime() {
		SimpleDateFormat NewDateformat = new SimpleDateFormat("HH:mm:ss:SSS");
		Date now = new Date();
		String Date = NewDateformat.format(now);
		return Date;
	}

	// To add Information Row
	public static void addInformationRow(String information) {

		reporter.write("<tr>\n" + "<td colspan='3' align='left'><font face='Arial' size='2' color='FF8C00'>"// 008B8B
																											// //B8860B
				+ information + "</font></td>\n" + "</tr>\n");
	}

	// To add Information Row with link
	public static void addInformationRowWithLink(String information) {

		reporter.write("<tr>\n"
				+ "<td width='12%' height='25' align='left' ><p style='margin-left: 5'><font face='Verdana' size='2' color='#000000'>Uploaded File</font></td>\n"
				+ "<td colspan='3' align='left'><font face='Arial' size='2' color='FF8C00'>"
				+ "<a target='_blank' href='file:///" + information + "'>" + information + "</a></font></td>\n"
				+ "</tr>\n");
	}

	// To close the report and generate summary of the test
	public static void stop(String environment, String TestCaseName)
			throws Exception {
		reporter.write("\n</div>\n</body>\n</table>\n");
		reporter.write("<br/><br/>");
		reporter.println();
		reporter.println();

		endTime = reportTime();

		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss:SSS");

		Date date1 = format.parse(startTime);
		Date date2 = format.parse(endTime);
		long difference = (date2.getTime() - date1.getTime()) / 1000;

		int hour = (int) (difference / (60 * 60));
		int minutes = (int) (difference - (hour * 60 * 60)) / 60;
		int seconds = (int) (difference - (hour * 60 * 60) - (minutes * 60));

		System.out.println(hour + "h " + minutes + "m " + seconds + "s");

		reporter.write(
				"\n <table align='center' border='1' width='52%' bordercolorlight='#C0C0C0' cellspacing='0' cellpadding='0' bordercolordark='#C0C0C0' bordercolor='#C0C0C0' height='88'>"
						+ "\n <tr>\n<td width='53%' colspan='2' height='28' bgcolor='#C0C0C0'><p align='center'><b><font face='Verdana' size='4' color='#000080'>Test Script Execution Summary"
						+ "</font></b></td>\n</tr>"
						+ "\n<tr>\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>Environment</font></b></td>"
						+ "<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2' color='#5259f3'>"
						+ "<blink>" + environment + "</blink></font></b></td>\n</tr>"
						+ "\n<tr>\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>TestCaseName</font></b></td>"
						+ "<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2' color='#16a62c'>"
						+ "<blink>" + TestCaseName + "</blink></font></b></td>\n</tr>"

						+ "\n<tr>\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>Total Pass steps Count</font></b></td>"
						+ "<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>"
						+ noOfPass + "</font></b></td>\n</tr>"
						+ "\n<tr>\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>Total Fail steps Count</font></b></td>"
						+ "\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>"
						+ noOfFail + "</font></b></td>\n</tr>"
						+ "\n<tr>\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>Start Time</font></b></td>"
						+ "\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>"
						+ startTime + "</font></b></td>\n</tr>"
						+ "\n<tr>\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>End Time</font></b></td>"
						+ "\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>"
						+ endTime + "</font></b></td>\n</tr>"
						+ "\n<tr>\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>Total-Time</font></b></td>"
						+ "\n<td width='17%' height='25'><p style='margin-left: 5'><b><font face='Verdana' size='2'>"
						+ hour + ":" + minutes + ":" + seconds
						+ " seconds</font></b></td>\n</tr>\n</body>\n</table>\n<br/><hr color='#50D12A'/><br/>");

	}
}
