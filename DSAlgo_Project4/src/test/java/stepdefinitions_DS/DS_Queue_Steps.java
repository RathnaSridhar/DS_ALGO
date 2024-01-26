package stepdefinitions_DS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import driverfactory.Driverfactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DS_ArrayPage;
import pageFactory.DS_GetStartedPage;
import pageFactory.DS_QueuePage;
import pageFactory.TryEditorPage;

public class DS_Queue_Steps {
	
	WebDriver driver;
	DS_Stack_Steps StackSteps = new DS_Stack_Steps();
	DS_Array_Steps ArraySteps = new DS_Array_Steps();
	DS_LinkedList_Steps LinkList = new DS_LinkedList_Steps();
	
	@When("User clicks on the Queue Get started button and user is on the Queue page")
	public void user_clicks_on_the_queue_get_started_button_and_user_is_on_the_Queue_page() {
	   driver = Driverfactory.getdriver();
	   DS_GetStartedPage GetStarted = new DS_GetStartedPage(driver);
	   GetStarted.Click_Queue_Get_Started();
	}

	@When("User clicks on the Implementation of queue in Python and user is in that page")
	public void user_clicks_on_the_implementation_of_queue_in_python_and_user_is_in_that_page() {
	   DS_QueuePage Queue = new DS_QueuePage(driver);
	   Queue.Click_Implementation_Of_Queue_In_Python();
	   
	}
	
	@When("User clicks on the try here button")
	public void user_clicks_on_the_try_here_button() {
	   DS_QueuePage Queue = new DS_QueuePage(driver);
	   Queue.Click_Try_Here();
	}
	@Then("User inputs the valid python code in the text editor box from the xlsheet sheet {string} and rownumber {int}")
	public void user_inputs_the_valid_python_code_in_the_text_editor_box_from_the_xlsheet_sheet_and_rownumber(String sheetname, Integer rownum) throws EncryptedDocumentException, IOException {
		DS_ArrayPage Array = new DS_ArrayPage(driver);
		   Array.Enter_Python_code(sheetname, rownum);
		   TryEditorPage tryeditor = new TryEditorPage(driver);
			tryeditor.ClickRunButton();
	}

	@When("User clicks on the Implementation using collection.deque in Python and user is in that page")
	public void user_clicks_on_the_implementation_using_collection_deque_in_python_and_user_is_in_that_page() {
		DS_QueuePage Queue = new DS_QueuePage(driver);
		Queue.Click_Implementation_Using_Collection();
	}

	@When("User clicks on the Implementation using array in Python and user is in that page")
	public void user_clicks_on_the_implementation_using_array_in_python_and_user_is_in_that_page() {
		DS_QueuePage Queue = new DS_QueuePage(driver);
		Queue.Click_Implementation_Using_Array();
	}

	@When("User clicks on the Queue Operations in Python and user is in that page")
	public void user_clicks_on_the_queue_operations_in_python_and_user_is_in_that_page() {
		DS_QueuePage Queue = new DS_QueuePage(driver);
		Queue.Click_Queue_Opertaions();
	}

}
