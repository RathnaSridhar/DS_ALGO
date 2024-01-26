package stepdefinitions_DS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverfactory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DS_DataIntro_Page;
import pageFactory.DS_GetStartedPage;
import pageFactory.DS_LoginPage;
import pageFactory.TryEditorPage;

public class DS_DataIntro_Steps {

	DS_LoginPage_Steps loginsteps = new DS_LoginPage_Steps();
	WebDriver driver = loginsteps.getDriver();

	@Given("The user is already logged in and is on the homepage")
	public void the_user_is_already_logged_in_and_is_on_the_homepage() {
		driver = Driverfactory.getdriver();
		DS_GetStartedPage Get_started = new DS_GetStartedPage(driver);
		Get_started.Get_Started_Button();
		DS_LoginPage Get = new DS_LoginPage(driver);
		Get.Click_Signin_menu();
		Get.Login();
	}

	@When("User clicks the get started button")
	public void user_clicks_the_get_started_button() {
		DS_GetStartedPage Get = new DS_GetStartedPage(driver);
		Get.Data_Intro_GetStarted();
	}

	@And("Clicks on the times complexity button")
	public void clicks_on_the_times_complexity_button() {
		DS_DataIntro_Page Get = new DS_DataIntro_Page(driver);
		Get.Time_Complexity();
	}

	@When("User click the Try here button, user is taken to the coding page")
	public void user_click_the_try_here_button_user_is_taken_to_the_coding_page() throws InterruptedException {
		DS_DataIntro_Page Get = new DS_DataIntro_Page(driver);
		Get.Click_TryHere_Button();
		TryEditorPage editor = new TryEditorPage(driver);
		editor.getEditorTextbox().click();

	}

	@When("User enters the Python code from xlsheet")
	public void user_enters_the_python_code_from_xlsheet() throws EncryptedDocumentException, IOException {

		TryEditorPage editor = new TryEditorPage(driver);
		editor.SendDataToEditor();

	}

	@When("User clicks on the run button")
	public void user_clicks_on_the_run_button() throws InterruptedException {
		TryEditorPage editor = new TryEditorPage(driver);
		editor.ClickRunButton();

	}

	@Then("User can see the the output printed")
	public void user_can_see_the_the_output_printed() {
		TryEditorPage editor = new TryEditorPage(driver);
		String output = editor.Output_text();
		System.out.println("The output of the python code is" + output);
	}

	@When("User enters the invalid Python code from xlsheet {string} and rownum {int}")
	public void user_enters_the_invalid_python_code_from_xlsheet_and_rownum(String sheetname, Integer rownumber)
			throws EncryptedDocumentException, IOException {
		DS_DataIntro_Page obj = new DS_DataIntro_Page(driver);
		obj.EnterInvalidCode(sheetname, rownumber);
	}

	@Then("Output should be blank")
	public void output_should_be_blank() {
		DS_DataIntro_Page obj = new DS_DataIntro_Page(driver);
		String actualmessage = obj.getTextfromOutputfield();
		Assert.assertEquals(actualmessage, "");
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
