package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class GlobalPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating Admin Button
	public static WebElement admin_btn() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Admin')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Logout Link
	public static WebElement logout_link() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Logout')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Change Password Link
	public static WebElement changepwd_link() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Change Password')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Back office Users Link
	public static WebElement backofficeusers_link() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Back office Users')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating View Button
	public static WebElement view_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'View')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Edit Button
	public static WebElement edit_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Edit')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Publish Button
	public static WebElement publish_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Publish')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating UnPublish Button
	public static WebElement unpublish_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Unpublish')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Copy Button
	public static WebElement copy_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Copy']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Delete Button
	public static WebElement delete_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Delete']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Next Button
	public static WebElement next_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Next')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Previous Button
	public static WebElement prev_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-switch-when='prev']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Last Page Button
	public static WebElement last_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-switch-when='last']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Save Button
	public static WebElement save_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='SAVE']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Cancel Button
	public static WebElement cancel_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'CANCEL')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
}
