package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class MultiQuizPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating ADD THIS OR THAT button
	public static WebElement add_btn() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD QUIZ')]")));
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

	// Locating Quiz Name Textbox
	public static WebElement quiz_name() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='UserQuiz_name']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Title Textbox
	public static WebElement title_txt() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='UserQuiz_quizTitle']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Quiz Subtitle Textbox
	public static WebElement quiz_subtitle_txt() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='UserQuiz_subtitle']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Carousel Label Textbox
	public static WebElement quiz_carousel_Lable() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='USERQUIZ_CONTENTTYPELABEL']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Brand Dropdown
	public static WebElement brand_drp() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='userQuiz_brand']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Number of points Text Field
	public static WebElement points_txt() throws Exception {
		try {
			element = fwait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='userQuiz_creditPoints']")));
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
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Start Date']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating End Date Text Field
	public static WebElement end_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='End Date']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Category Dropdown
	public static WebElement category_drp() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='UserQuiz_type']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Tags Text Field
	public static WebElement tags_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='search']")));
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

	// Locating Add Question Button
	public static WebElement addQues_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@type='button'][@title='Add New Question']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Add Answer Button
	public static WebElement addAns_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@type='button'][@title='Add New Answer']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Question Text Field
	public static WebElement ques_txt(int i) throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='quiz_text" + i + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Answer Text Field
	public static WebElement ans_txt(int i, int j) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@id='collapse" + i + "']//*[@name='quiz_text" + i
							+ "']/following::div[1]//*[@name='answerForm']//*[text()='" + j + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

}
