package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import TestSuiteBase.SuiteBase;

public class ProductsPageObj extends SuiteBase {
	private static WebElement element = null;
	private static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(1, TimeUnit.SECONDS);

	// Locating ADD THIS OR THAT button
	public static WebElement add_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD PRODUCT')]")));
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
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_type']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Offer Id Textbox
	public static WebElement offerId_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='offer_id']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Title Textbox
	public static WebElement title_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_title']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Tile Location Dropdown
	public static WebElement tileLoc_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_tileLocation']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Description Textbox
	public static WebElement description_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_description']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Subtitle Text Field
	public static WebElement subtitle_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_subTitle']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Number of points Text Field
	public static WebElement points_txt() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_creditPoints']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Rank Text Field
	public static WebElement rank_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='product_rank']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Publish Date Text Field
	public static WebElement publish_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Start Date']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Expiry Date Text Field
	public static WebElement expiry_date() throws Exception {
		try {
			element = fwait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='End Date']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating User Cap Text Field
	public static WebElement userCap_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='product_maxPurchaseLimit']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Brands Dropdown
	public static WebElement brand_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='product_brand']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Category Dropdown
	public static WebElement category_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@name='product_contentCategory']")));
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
					.presenceOfElementLocated(By.xpath("//*[@id='productForm']//*[contains(text(),'Upload image')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Image poster Upload button
	public static WebElement image_poster_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@id='productForm']//*[contains(text(),'Upload poster image')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Video Upload button
	public static WebElement video_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@id='productForm']//*[contains(text(),'Upload video')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Payment Section Fields
	// Locating Payment mechanism Dropdown
	public static WebElement payment_mechanism_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_paymentMechanism']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Price Field
	public static WebElement price_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_originalPrice']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Open In App Button
	public static WebElement openInApp_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@ng-model='product.isWebViewEnable'][text()='Yes']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	// Locating Is affiliate window button
	public static WebElement affiliate_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@ng-model='product.fulfillmentInfo.affiliate'][text()='Yes']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Is affiliate window button
	public static WebElement paymentUrl_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_paymentUrl']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}	
	
	// Locating Android DeepLink Url
	public static WebElement androidDeepLinkUrl_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_androidDeepLinkUrl']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Android App ID
	public static WebElement androidAppId_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_androidAppId']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating iOS DeepLink Url
	public static WebElement iosDeepLinkUrl_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_iosDeepLinkUrl']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating iOS App ID
	public static WebElement iosAppId_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_iosAppId']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Store Locator URL
	public static WebElement storeLocatorUrl_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_storeLocatorUrl']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Phone number
	public static WebElement phoneNumber_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_phoneNumber']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Product Type
	public static WebElement productType_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_productType']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Product Name
	public static WebElement productName_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_productName']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Maximum Quantity
	public static WebElement orderCap_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_orderCap']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Booking Fee
	public static WebElement bookingFee_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_bookingFee']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Booking Increments
	public static WebElement bookingIncrement_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_bookingIncrement']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Expected Delivery Days 
	public static WebElement deliveryDays_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_deliveryDays']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Delivery Charge
	public static WebElement deliveryCharge_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_deliveryCharge']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Delivery Increments
	public static WebElement increment_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_increment']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Display Expiry section field
		// Locating Display Expiry time
	//Days
	public static WebElement expirydays_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_expirydays ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Hours
	public static WebElement expiryhours_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_expiryhours ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Minutes
	public static WebElement expiryminutes_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_expiryminutes ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Redemption Section Fields
	// Locating Redemption Time
	//Days
	public static WebElement redemDays_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_days ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Hours
	public static WebElement redemHours_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_hours ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Minutes
	public static WebElement redemMinutes_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_minutes ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Voucher Type Dropdown
	public static WebElement voucherType_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_voucherType ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Voucher Code
	public static WebElement voucherCode_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_voucher_voucherCode ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Original quantity
	public static WebElement originalQty_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_originalQty ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Show Quantity
	public static WebElement showQty_txt(String showQty) throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@ng-model='props.previewMode'][text()='" + showQty + "']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Upload Redemption Codes File button
	public static WebElement uploadRedemCodes_btn() throws Exception {
		try {
			element = fwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//*[@id='productForm']//*[contains(text(),'Upload Redemption Codes File')]")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	//Step instructions for the user Section Fields
	// Locating Step 1
	public static WebElement step1Inst_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_instructions ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Step 2
	public static WebElement step2Inst_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_orderInstructions2 ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Step 3
	public static WebElement step3Inst_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_orderInstructions3 ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Expired Voucher Message
	public static WebElement voucherExpiryMessage_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_voucherExpiryMessage ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	// Locating Voucher Code Display
	public static WebElement codeType_drp() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='code_type ']")));
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}
	
	//Order Section Fields
	//Order Instructions
	public static WebElement orderInstructions_txt() throws Exception {
		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@name='product_fulfillmentInfo_orderInstructions ']")));
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
}
