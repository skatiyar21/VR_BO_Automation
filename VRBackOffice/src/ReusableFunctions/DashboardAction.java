package ReusableFunctions;

import PageObjects.DashboardPageObj;
import TestSuiteBase.SuiteBase;
import Utility.Report;

public class DashboardAction extends SuiteBase {
	public static void DashboardActionVerification(String dashboardTab) throws Exception {
		TestfailCounter = 0;
		try {
			checkPageIsReady();
			switch (dashboardTab) {
			case "this or that":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.quiz_tab(), "THIS OR THAT");
				break;
			case "show and tell":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.challenges_tab(),"SHOW AND TELL");
				break;
			case "vaults":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.vaults_tab(), "VAULTS");
				break;
			case "products":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.products_tab(), "PRODUCTS");
				break;
			case "revese auctions":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.rev_auct_tab(), "REVERSE AUCTIONS");
				break;
			case "prize draw":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.prize_draw_tab(), "PRIZE DRAW");
				break;
			case "quiz":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.multi_quiz_tab(), "QUIZ");
				break;
			case "code redemption":
				click(DashboardPageObj.cont_mgmt_tab(), "CONTENT MANAGEMENT");
				click(DashboardPageObj.code_redem_tab(), "CODE REDEMPTION");
				break;
			case "user details list":
				click(DashboardPageObj.user_mgmt_tab(), "USER MANAGEMENT");
				click(DashboardPageObj.userdetails_list_tab(), "User Details List");
				break;
			case "bulk award points":
				click(DashboardPageObj.user_mgmt_tab(), "USER MANAGEMENT");
				click(DashboardPageObj.bulkawardpoints_tab(), "Bulk Award Points");
				break;
			case "categories":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.categories_tab(), "Categories");
				break;
			case "code info":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.codeInfo_tab(), "Code Info");
				break;
			case "content":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.content_tab(), "Content");
				break;
			case "offline order tracking":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.off_ord_trk_tab(), "Offline Order Tracking");
				break;
			case "payment requests":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.pay_req_tab(), "Payment Requests");
				break;
			case "partners":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.partners_tab(), "Partners");
				break;
			case "tags":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.tags_tab(), "Tags");
				break;
			case "trigger":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.trigger_tab(), "Trigger");
				break;
			case "vco validation":
				click(DashboardPageObj.masterdata_tab(), "MASTER DATA");
				click(DashboardPageObj.vcoValid_tab(), "VCO Validation");
				break;
			default:
				break;
			}
			if (TestfailCounter > 0) {
				Report.writeTestStatusFail();
			} else {
				Report.writeTestStatusPass();
			}
		} catch (Exception e) {
			// TODO: handle exception
			if (TestfailCounter > 0) {
				Report.writeTestStatusFail();
			} else {
				Report.writeTestStatusPass();
			}
			System.out.println(e);
		}
	}

}
