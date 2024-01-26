package stepdefinitions_DS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import driverfactory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DS_ArrayPage;
import pageFactory.DS_GetStartedPage;
import pageFactory.DS_LoginPage;
import pageFactory.TryEditorPage;

public class DS_Array_Steps {

	DS_DataIntro_Steps DataSteps = new DS_DataIntro_Steps();
	
	WebDriver driver;

	@Given("User is on the DS Algo portal and click on the get started button")
	public void user_is_on_the_ds_algo_portal_and_click_on_the_get_started_button() {
		driver = Driverfactory.getdriver();
		DS_GetStartedPage get_started = new DS_GetStartedPage(driver);
		get_started.Get_Started_Button();
		get_started.Array_Get_Started();

	}

	@Then("User clicks on the sign in link")
	public void user_clicks_on_the_sign_in_link() {
		DS_LoginPage Login = new DS_LoginPage(driver);
		Login.Click_Signin_menu();
	}

	@When("User is on the login page, user enters the valid email id and password")
	public void user_is_on_the_login_page_user_enters_the_valid_email_id_and_password() {
		DS_LoginPage Login = new DS_LoginPage(driver);
		Login.Login();
	}

	@Then("In the home page user clicks the get started button of Array")
	public void in_the_home_page_user_clicks_the_get_started_button_of_array() {
		DS_GetStartedPage get_started = new DS_GetStartedPage(driver);
		get_started.Array_Get_Started();
	}

	@When("User clicks on the Arrays in Python link")
	public void user_clicks_on_the_arrays_in_python_link() {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Arrays_In_Python();
	}

	@Then("User navigates to the try editor page")
	public void user_navigates_to_the_try_editor_page() {
		Actions action = new Actions(driver);
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		action.moveToElement(Array_page.Try_here_button()).perform();
		Array_page.Try_here_button().click();
	}

	@And("User enter the valid python code in the tryeditor from sheet {string} and rownumber {int}")
	public void user_enter_the_valid_python_code_in_the_tryeditor_from_sheet_and_rownumber(String sheetname,
			Integer rownum) throws EncryptedDocumentException, IOException {
		
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Enter_Python_code(sheetname, rownum);
	}

	@And("User should get the correct output")
	public void user_should_get_the_correct_output() throws InterruptedException {
		TryEditorPage tryeditor = new TryEditorPage(driver);
		tryeditor.ClickRunButton();
		String output = tryeditor.Output_text();
		System.out.println("The output is: " + output);
	}

	@When("User clicks on the Arrays using list link")
	public void user_clicks_on_the_arrays_using_list_link() {
		DS_ArrayPage array_page = new DS_ArrayPage(driver);
		array_page.Click_Arrays_Using_List();
	}

	@And("The User enter the valid python code in the tryeditor from sheet {string} and rownumber {int}")
	public void the_user_enter_the_valid_python_code_in_the_tryeditor_from_sheet_and_rownumber(String sheetname,
			Integer rownum) throws EncryptedDocumentException, IOException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Enter_Python_code(sheetname, rownum);

	}
	

	@When("User clicks on the Basic opertaion list page")
	public void user_clicks_on_the_basic_opertaion_list_page() {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Basic_Operations_in_List();
	}

	@And("User enter the valid python code from sheet {string} and rownumber {int} in to the try editor")
	public void user_enter_the_valid_python_code_from_sheet_and_rownumber_in_to_the_try_editor(String sheetname,
			Integer rownum) throws EncryptedDocumentException, IOException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Enter_Python_code(sheetname, rownum);
	}

	@When("User clicks on the Applications of Array link")
	public void user_clicks_on_the_applications_of_array_link() throws InterruptedException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Applications_of_Array();
	}

	@And("User enters the valid python code from sheet {string} and rownumber {int} in to the try editor")
	public void user_enters_the_valid_python_code_from_sheet_and_rownumber_in_to_the_try_editor(String sheetname, Integer rownum) throws EncryptedDocumentException, IOException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Enter_Python_code(sheetname, rownum);
	}
	
	@Then("User click on the Practice question link")
	public void user_click_on_the_practice_question_link() {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Practice_Question();
	}

	@Then("User selects the search the array practice question")
	public void user_selects_the_search_the_array_practice_question() throws InterruptedException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Search_The_Array();
		Thread.sleep(2000);
		
	}

	@Then("User selects the Max consecutive ones practice question")
	public void user_selects_the_max_consecutive_ones_practice_question() throws InterruptedException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Max_Consecutive_ones();
		Thread.sleep(2000);
	}

	@Then("User selects the Find number with Even number of digits practice question")
	public void user_selects_the_find_number_with_even_number_of_digits_practice_question() throws InterruptedException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Find_Numbers_with_Even_Number_of_Digits();
		Thread.sleep(2000);
	}

	@Then("User selects the squares of the sorted array practice question")
	public void user_selects_the_squares_of_the_sorted_array_practice_question() throws InterruptedException {
		DS_ArrayPage Array_page = new DS_ArrayPage(driver);
		Array_page.Click_Squares_Of_A_Sorted_Array();
		Thread.sleep(2000);
	}

	public WebDriver getDriver() {
		return driver;
	}
}
