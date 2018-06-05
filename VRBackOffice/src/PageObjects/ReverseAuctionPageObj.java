package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class ReverseAuctionPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating ADD THIS OR THAT button
	public static WebElement add_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD REVERSE AUCTION')]")));
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

	// Locating Type Dropdown
	public static WebElement challengetype_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_type']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Title Textbox
	public static WebElement title_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='reverseAuction_title']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Tile Location Dropdown
	public static WebElement tileLoc_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='reverseAuction_type']")));
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
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='reverseAuction_subTitle']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Publish Date Text Field
	public static WebElement publish_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Publish Date']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Expiry Date Text Field
	public static WebElement expiry_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Expiry Date']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating RETAIL VALUE/MAXIMUM BID Text Field
	public static WebElement bidMaxValue_txt() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='reverseAuction_bidMaxValue']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating BIDS STARTING FROM Text Field
	public static WebElement bidMinValue_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='reverseAuction_bidMinValue']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating AVG% OFF Text Field
	public static WebElement avgdiscount_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='reverseAuction_avgdiscount']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating MAX ENTRANTS Text field
	public static WebElement maxentries_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='maxentries']")));
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

	//Locating Entry Fee text field
	public static WebElement entryFees_txt() throws Exception {
		try {
			element=fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='entryFees']")));
		} catch (Exception e) {
			System.out.println(e);
			}
		return element;
	}
	
	//Locating Rank text field
	public static WebElement rank_txt() throws Exception {
		try {
			element=fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='rank']")));
		} catch (Exception e) {
			System.out.println(e);
			}
		return element;
	}
	
	// Locating Credit points Text Field
	public static WebElement creditPoints_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='creditPoints']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Brand Field
	public static WebElement brand_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='reverse_auction_brand']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Locating Restriction Button
	public static WebElement restriction_btn(String restriction) throws Exception {
		try {
			element=fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@btn-radio=\"'" + restriction + "'\"]")));
		} catch (Exception e) {
			System.out.println(e);
			}
		return element;
	}
	
	//Locating Restriction Button
	public static WebElement showTeaser_btn(String showteaser) throws Exception {
		try {
			element=fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@btn-radio=\"'" + showteaser + "'\"]")));
		} catch (Exception e) {
			System.out.println(e);
			}
		return element;
	}
	
	// Locating SmartList Filter
	public static WebElement smartList(String smartlistopt) throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@ng-model='product.smartListYesNo'][text()='" + smartlistopt + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating SmartList Status(User)
	public static WebElement smartList_user(String smartliststatus) throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@ng-model='product.smartListStatus'][text()='" + smartliststatus + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Locating SmartList Dropdown
	public static WebElement smartList_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_smartListId']")));
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
	
	// Locating Image Upload button
	public static WebElement image_main_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[contains(text(),'upload image')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Marketing Communication Toggle button
	public static WebElement marketingtoggle_btn(String marketing) throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@ ng-change='toggleMarketing()'][text()='" + marketing + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Marketing Communication Text Field
	public static WebElement marketingCommText_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@name='reverseAuction_marketingCommText']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
}
