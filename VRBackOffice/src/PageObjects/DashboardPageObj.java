package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class DashboardPageObj extends SuiteBase {
		private static WebElement element = null;
		private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS);
		
		// Locating Logo image field in Login Page
		public static WebElement logo_img() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[@src='img/logo-white.png']")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating CONTENT MANAGEMENT Tab field in Login Page
		public static WebElement cont_mgmt_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'CONTENT MANAGEMENT')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating THIS OR THAT section in Login Page
		public static WebElement quiz_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'THIS OR THAT')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating SHOW AND TELL section in Login Page
		public static WebElement challenges_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'SHOW AND TELL')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating VAULTS section in Login Page
		public static WebElement vaults_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'VAULTS')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating PRODUCTS section in Login Page
		public static WebElement products_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'PRODUCTS')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating REVERSE AUCTIONS section in Login Page
		public static WebElement rev_auct_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'REVERSE AUCTIONS')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating PRIZE DRAW section in Login Page
		public static WebElement prize_draw_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'PRIZE DRAW')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating QUIZ section in Login Page
		public static WebElement multi_quiz_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'QUIZ')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating CODE REDEMPTION section in Login Page
		public static WebElement code_redem_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'CODE REDEMPTION')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating USER MANAGEMENT section in Login Page
		public static WebElement user_mgmt_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'USER MANAGEMENT')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating User Details List section in Login Page
		public static WebElement userdetails_list_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'User Details List')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Bulk Award Points section in Login Page
		public static WebElement bulkawardpoints_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Bulk Award Points')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating MASTER DATA section in Login Page
		public static WebElement masterdata_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'MASTER DATA')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Categories section in Login Page
		public static WebElement categories_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Categories')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Code Info section in Login Page
		public static WebElement codeInfo_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Code Info')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Content section in Login Page
		public static WebElement content_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Content')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Offline Order Tracking section in Login Page
		public static WebElement off_ord_trk_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Offline Order Tracking')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Payment Requests section in Login Page
		public static WebElement pay_req_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Payment Requests')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Partners section in Login Page
		public static WebElement partners_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Partners')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Tags section in Login Page
		public static WebElement tags_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Tags')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating Trigger section in Login Page
		public static WebElement trigger_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Trigger')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
		
		// Locating VCO Validation section in Login Page
		public static WebElement vcoValid_tab() throws Exception {
			try {
				element = fwait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[contains(text(),'VCO Validation')]")));
			} catch (Exception e) {
				System.out.println(e);
			}
			return element;
		}
}
