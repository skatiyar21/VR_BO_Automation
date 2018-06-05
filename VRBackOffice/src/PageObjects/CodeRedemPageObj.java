package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class CodeRedemPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating ADD CODE button
	public static WebElement add_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD CODE')]")));
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

	// Locating Code Name
	public static WebElement codeName_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='Code_name']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Title Textbox
	public static WebElement title_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='Code_title']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Entry Page Header Textbox
	public static WebElement entryPageHeader_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='Code_codeHeaderTitle']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Description Textbox
	public static WebElement description_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='code_description']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Subtitle Text Field
	public static WebElement subtitle_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='Code_subTitle']")));
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
	
	// Locating End Date Text Field
	public static WebElement end_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='enddate']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Brands Dropdown
	public static WebElement brand_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='code_brand']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Carousel Label
	public static WebElement lable_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='contentTypeLabel']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Rank Text Field
	public static WebElement rank_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='rank']")));
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
	
	// Locating Image Upload button
	public static WebElement code_icon_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@name='imageUrl']//*[contains(text(),'Upload code screen icon/image')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Image Upload button
	public static WebElement image_main_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@name='backgroundImage']//*[contains(text(),'Upload Background Image')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Upload CSV button
	public static WebElement uploadCSV_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@name='csvUpload1']//*[contains(text(),'Upload Code CSV ')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
}