package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class LoginPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating Email text field in Login Page
	public static WebElement email_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Password text field in Login Page
	public static WebElement password_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Login Button field in Login Page
	public static WebElement login_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@type='submit'][contains(text(),'LOG IN')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
}
