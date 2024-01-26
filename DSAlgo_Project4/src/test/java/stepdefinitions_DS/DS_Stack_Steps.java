package stepdefinitions_DS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import driverfactory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DS_ArrayPage;
import pageFactory.DS_GetStartedPage;
import pageFactory.DS_StackPage;
import pageFactory.TryEditorPage;

public class DS_Stack_Steps {
	DS_Array_Steps ArraySteps = new DS_Array_Steps();
	DS_LinkedList_Steps LinkList = new DS_LinkedList_Steps();
	
	WebDriver driver;
	
	@When("User clicks on the Stack Get started button and user is on the Stack page")
	public void user_clicks_on_the_stack_get_started_button_and_user_is_on_the_stack_page() {
	    driver = Driverfactory.getdriver();
	    DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
	    Get_Started.Stack_Get_started();
	}

	@And("User clicks on the Operations in stack and user is in that page")
	public void user_clicks_on_the_operations_in_stack_and_user_is_in_that_page() {
	    DS_StackPage Stack = new DS_StackPage(driver);
	    Stack.Click_Operations_In_Stack();
	}

	@When("User click on the try here button")
	public void user_click_on_the_try_here_button() {
		DS_StackPage Stack = new DS_StackPage(driver);
	    Stack.Click_Try_Here();
	}
	
	@Then("User inputs the valid python code in the text editor box from the excelsheet sheet {string} and rownumber {int}")
	public void user_inputs_the_valid_python_code_in_the_text_editor_box_from_the_excelsheet_sheet_and_rownumber(String sheetname, Integer rownum) throws EncryptedDocumentException, IOException {
		DS_ArrayPage Array = new DS_ArrayPage(driver);
		   Array.Enter_Python_code(sheetname, rownum);
		   TryEditorPage tryeditor = new TryEditorPage(driver);
			tryeditor.ClickRunButton();
	}
	@When("User clicks on the Implementaion in stack and user is in the that page")
	public void user_clicks_on_the_implementaion_in_stack_and_user_is_in_the_that_page() {
		DS_StackPage Stack = new DS_StackPage(driver);
		Stack.Click_Implementation_In_Stack();
	}

	@And("User clicks on the Applications in stack and user is in the that in stack page")
	public void user_clicks_on_the_applications_in_stack_and_user_is_in_the_that_in_stack_page() {
		DS_StackPage Stack = new DS_StackPage(driver);
		Stack.Click_Application_In_stack();
	}
}
