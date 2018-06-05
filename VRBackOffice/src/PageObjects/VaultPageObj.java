package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class VaultPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating ADD THIS OR THAT button
	public static WebElement add_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD VAULT')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Preview Mode Button
	public static WebElement preview_btn(String preview) throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@ng-model='props.previewMode'][text()='" + preview + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Title Textbox
	public static WebElement title_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='vault_title']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Quiz Label Textbox
	public static WebElement label_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='vault_contentTypeLabel']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Description Textbox
	public static WebElement description_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='vault_description']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Create Vault For Text Field
	public static WebElement vaultcreatefor_radiobtn(String vaultcreatefor) throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='" + vaultcreatefor + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Number of points Text Field
	public static WebElement points_txt() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='vault_creditPoints']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Rank Text Field
	public static WebElement rank_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='vault_rank']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Publish Date Text Field
	public static WebElement publish_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='vault_tempStartDate']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Image Upload button
	public static WebElement image_main_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@ng-model='quiz.backgroundUrl']//*[@type='file']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Category Dropdown
	public static WebElement vaultCategory_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='vault_contentCategory']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Tags Text Field
	public static WebElement tags_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@type='search']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Tags Choice Field
	public static WebElement tags_choice() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@class='select2-result-label ui-select-choices-row-inner']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
}
