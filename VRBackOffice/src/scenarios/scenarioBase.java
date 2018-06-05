package scenarios;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import TestSuiteBase.SuiteBase;
import TestSuiteBase.SuiteUtility;
import Utility.Read_XLSX;

public class scenarioBase extends SuiteBase {
	Read_XLSX FilePath = null;
	String SheetName = null;
	String SuiteName = null;
	String ToRunColumnName = null;

	public scenarioBase() {
	}

	@BeforeSuite
	public void checkSuiteToRun() throws IOException {
		this.init();
		this.FilePath = TestSuiteListExcel;
		this.SheetName = "SuitesList";
		this.SuiteName = "VirginRed";
		this.ToRunColumnName = "SuiteToRun";
		Add_Log.info("Execution started for SuiteOneBase.");
		if (!SuiteUtility.checkToRunUtility(this.FilePath, this.SheetName, this.ToRunColumnName, this.SuiteName)) {
			Add_Log.info("SuiteToRun = N for " + this.SuiteName + " So Skipping Execution.");
			SuiteUtility.WriteResultUtility(this.FilePath, this.SheetName, "Skipped/Executed", this.SuiteName,
					"Skipped");
			throw new SkipException(
					this.SuiteName + "'s SuiteToRun Flag Is 'N' Or Blank. So Skipping Execution Of " + this.SuiteName);
		} else {
			SuiteUtility.WriteResultUtility(this.FilePath, this.SheetName, "Skipped/Executed", this.SuiteName,
					"Executed");
		}
	}

}
