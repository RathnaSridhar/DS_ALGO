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
import pageFactory.DS_LinkedListPage;
import pageFactory.TryEditorPage;

public class DS_LinkedList_Steps {
	
	DS_Array_Steps Array_steps = new DS_Array_Steps();
	WebDriver driver;
	
	@And("User clicks on the Linked List Get started page to open the linked list page")
	public void user_clicks_on_the_linked_list_Get_started_page_to_open_the_linked_list_page() {
	    driver = Driverfactory.getdriver();
	    DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
	    Get_Started.LinkedList_Get_started();
	}

	@When("User clicks on the Introductions link and clicks on the try here button")
	public void user_clicks_on_the_introductions_link_and_clicks_on_the_try_here_button() {
	   DS_LinkedListPage Linked_List = new DS_LinkedListPage(driver);
	   Linked_List.Click_LinkedList_Introduction();
	   Linked_List.Click_Try_here();
	}

	@Then("User inputs the valid python code in the text editor box from the excel sheet {string} and rownumber {int}")
	public void user_inputs_the_valid_python_code_in_the_text_editor_box_from_the_excel_sheet_and_rownumber(String sheetname, Integer rownum) throws EncryptedDocumentException, IOException {
	   DS_ArrayPage Array = new DS_ArrayPage(driver);
	   Array.Enter_Python_code(sheetname, rownum);
	   TryEditorPage tryeditor = new TryEditorPage(driver);
		tryeditor.ClickRunButton();
	}

	@When("User clicks on the Creating linked list link and clicks on the try here button")
	public void user_clicks_on_the_creating_linked_list_link_and_clicks_on_the_try_here_button() {
		DS_LinkedListPage Linked_List = new DS_LinkedListPage(driver);
		Linked_List.Click_Creating_Linked_List();
		Linked_List.Click_Try_here();
	}

	@When("User clicks on the Types of Linked list link and clicks on the try here button")
	public void user_clicks_on_the_types_of_linked_list_link_and_clicks_on_the_try_here_button() {
		DS_LinkedListPage Linked_List = new DS_LinkedListPage(driver);
		Linked_List.Click_Types_of_Linked_List();
		Linked_List.Click_Try_here();
	}

	@When("User clicks on the Implemented Linked list in python  link and clicks on the try here button")
	public void user_clicks_on_the_implemented_linked_list_in_python_link_and_clicks_on_the_try_here_button() {
		DS_LinkedListPage Linked_List = new DS_LinkedListPage(driver);
		Linked_List.Click_Implement_Linked_List_In_Python();
		Linked_List.Click_Try_here();
	}

	@When("User clicks on the Traversal link and clicks on the try here button")
	public void user_clicks_on_the_traversal_link_and_clicks_on_the_try_here_button() {
		DS_LinkedListPage Linked_List = new DS_LinkedListPage(driver);
		Linked_List.Click_Traversal_Linked_List();
		Linked_List.Click_Try_here();
	}

	@When("User clicks on the Insertion link and clicks on the try here button")
	public void user_clicks_on_the_insertion_link_and_clicks_on_the_try_here_button() {
		DS_LinkedListPage Linked_List = new DS_LinkedListPage(driver);
		Linked_List.Click_Insertion_Linked_List();
		Linked_List.Click_Try_here();
	}

	@When("User clicks on the Deletion link and clicks on the try here button")
	public void user_clicks_on_the_deletion_link_and_clicks_on_the_try_here_button() {
		DS_LinkedListPage Linked_List = new DS_LinkedListPage(driver);
		Linked_List.Click_Deletion_Linked_List();
		Linked_List.Click_Try_here();
	}
}
