package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class ChallengePageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating ADD THIS OR THAT button
	public static WebElement add_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD SHOW AND TELL')]")));
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

	// Locating Show Mode Button
	public static WebElement brand_btn(String show) throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@btn-radio=\"'" + show + "'\"]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Quiz Type Dropdown
	public static WebElement challengetype_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='challenge_type']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Title Textbox
	public static WebElement title_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='challenge_title']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Quiz Label Textbox
	public static WebElement label_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='challenge_contentTypeLabel']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Description Textbox
	public static WebElement description_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='challenge_description']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Subtitle Text Field
	public static WebElement subtitle_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='challenge_subTitle']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Number of points Text Field
	public static WebElement points_txt() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='challenge_creditPoint']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Rank Text Field
	public static WebElement rank_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='challenge_rank']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Start Date Text Field
	public static WebElement start_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='tempStartDate']")));
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

	// Locating Brands Dropdown
	public static WebElement brand_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='challenge_brand']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Category Dropdown
	public static WebElement category_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='category']")));
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
