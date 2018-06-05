package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class QuizPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating ADD THIS OR THAT button
	public static WebElement add_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD THIS OR THAT')]")));
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
	public static WebElement quiztype_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='quiz_type']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Title Textbox
	public static WebElement title_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='title']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Quiz Label Textbox
	public static WebElement quiz_label_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='quiz_label']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Description Textbox
	public static WebElement description_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='description']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Subtitle Text Field
	public static WebElement subtitle_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='subtitle']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Number of points Text Field
	public static WebElement points_txt() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='numberofpoints']")));
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

	// Locating Add Question Button
	public static WebElement addQues_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@type='button'][contains(text(),'Add Question')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Question Text Field
	public static WebElement quiz_txt(int i) throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@name='quizAddform']/div/div[1]/fieldset/div[" + (i + 6) + "]//*[@name='quiz_text']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Add Question Button
	public static WebElement addOption_btn(int i) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='quizAddform']/div/div[1]/fieldset/div[" + (i + 6)
							+ "]/div/div[2]//*[@class='glyphicon glyphicon-plus']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Description Text Field
	public static WebElement opt_description_txt(int i, int j) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='quizAddform']/div/div[1]/fieldset/div[" + (i + 6)
							+ "]/div/div[2]/div[1]/div[" + (j) + "]//*[@name='quest_description']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Option Image Button
	public static WebElement optimage_btn(int i, int j) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@name='quizAddform']/div/div[1]/fieldset/div[" + (i + 6)
							+ "]/div/div[2]/div[1]/div[" + (j) + "]//*[@type='file']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Brands Dropdown
	public static WebElement brand_drp(int i, int j) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='quizAddform']/div/div[1]/fieldset/div[" + (i + 6)
							+ "]/div/div[2]/div[1]/div[" + (j) + "]//*[@name='quiz_brand']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Category Dropdown
	public static WebElement category_drp(int i, int j) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='quizAddform']/div/div[1]/fieldset/div[" + (i + 6)
							+ "]/div/div[2]/div[1]/div[" + (j) + "]//*[@name='category']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Tags Text Field
	public static WebElement tags_txt(int i, int j) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='quizAddform']/div/div[1]/fieldset/div[" + (i + 6)
							+ "]/div/div[2]/div[1]/div[" + (j) + "]//*[@type='search']")));
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
