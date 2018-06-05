package ReusableFunctions;

import PageObjects.LoginPageObj;
import TestSuiteBase.SuiteBase;
import Utility.Report;

public class LoginAction extends SuiteBase {
	public static void LoginActionVerification(String username, String password) throws Exception {
		TestfailCounter = 0;
		try {
			checkPageIsReady();
			sendkeys(LoginPageObj.email_txt(), "Email Id", username);
			sendkeys(LoginPageObj.password_txt(), "Password", password);
			clickJSE(LoginPageObj.login_btn(), "Log In");
			if (TestfailCounter > 0) {
				Report.writeTestStatusFail();
			} else {
				Report.writeTestStatusPass();
			}
		} catch (Exception e) {
			// TODO: handle exception
			if (TestfailCounter > 0) {
				Report.writeTestStatusFail();
			} else {
				Report.writeTestStatusPass();
			}
			System.out.println(e);
		}
	}
}
