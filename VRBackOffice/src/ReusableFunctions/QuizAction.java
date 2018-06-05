package ReusableFunctions;

import PageObjects.GlobalPageObj;
import PageObjects.QuizPageObj;
import TestSuiteBase.SuiteBase;
import Utility.Report;

public class QuizAction extends SuiteBase {
	public static void AddQuizAction(String preview, String show, String title, String label, String description,
			String subtitle, String points, String rank, String startdate, String file, String ques_count,
			String quizquestion, String opt_description, String brand, String category, String tag) throws Exception {
		TestfailCounter = 0;
		try {
			checkPageIsReady();
			int i = 1;
			String path = System.getProperty("user.dir");
			checkPageIsReady();
			click(QuizPageObj.add_btn(), "Add This or That");
			threadwait();
			click(QuizPageObj.preview_btn(preview), "Preview::" + preview);
			click(QuizPageObj.brand_btn(show), "Brand::" + show);
			selectDropDownbyVisibleText(QuizPageObj.quiztype_drp(), "Type", "Daily");
			sendkeys(QuizPageObj.title_txt(), "Title", title);
			sendkeys(QuizPageObj.quiz_label_txt(), "Label", label);
			sendkeys(QuizPageObj.description_txt(), "Description", description);
			sendkeys(QuizPageObj.subtitle_txt(), "Subtitle for tile", subtitle);
			sendkeys(QuizPageObj.points_txt(), "Number of Points", points);
			sendkeys(QuizPageObj.rank_txt(), "Rank", rank);
			sendkeys(QuizPageObj.start_date(), "Start Date", startdate);
			click(QuizPageObj.image_main_btn(), "Upload Image");
			String exe_path = path + "\\Images\\uploadImage.exe";
			String filepath = path + "\\Images\\" + file + ".jpg";
			System.out.println(exe_path + " " + filepath + " " + Param.getProperty("testBrowser"));
			Runtime.getRuntime().exec(exe_path + " " + filepath + " " + Param.getProperty("testBrowser"));
			threadwait();threadwait();
			while (i <= Integer.parseInt(ques_count)) {
				sendkeys(QuizPageObj.quiz_txt(i), "Quiz Question", quizquestion);
				click(QuizPageObj.addOption_btn(i), "Add Option");
				for (int j = 1; j <= 2; j++) {
					sendkeys(QuizPageObj.opt_description_txt(i, j), "Text", opt_description);
					click(QuizPageObj.optimage_btn(i, j), "Upload Option Image");
					Runtime.getRuntime().exec(exe_path + " " + filepath + " " + Param.getProperty("testBrowser"));
					threadwait();threadwait();
					selectDropDownbyPartOfText(QuizPageObj.brand_drp(i, j), "Brands", brand);
					selectDropDownbyPartOfText(QuizPageObj.category_drp(i, j), "Category", category);
					sendkeys(QuizPageObj.tags_txt(i, j), "Tags", tag);
					QuizPageObj.tags_choice().click();
				}
				i++;
				if (i <= Integer.parseInt(ques_count)) {
					click(QuizPageObj.addQues_btn(), "Add Question");
				}
			}
			click(GlobalPageObj.save_btn(), "Save Button");
			threadwait();
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
