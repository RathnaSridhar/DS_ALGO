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
import pageFactory.DS_GraphPage;
import pageFactory.TryEditorPage;

public class DS_Graph_Steps {
	DS_Array_Steps ArraySteps = new DS_Array_Steps();
	DS_LinkedList_Steps LinkList = new DS_LinkedList_Steps();
	DS_DataIntro_Steps DataIntro = new DS_DataIntro_Steps();
	DS_Stack_Steps Stack = new DS_Stack_Steps();
	DS_Trees_Steps trees = new DS_Trees_Steps();
	WebDriver driver;
	
	@And("User clicks on the Graph Get started button and user is on the Graph page")
	public void user_clicks_on_the_graph_get_started_button_and_user_can_view_the_graph_page() {
		driver = Driverfactory.getdriver();
	    DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
	    Get_Started.Click_Graph_Link();
	}

	@When("User clicks on the Graph and user is in that page")
	public void user_clicks_on_the_graph_and_user_is_in_that_page() {
	    DS_GraphPage Graph = new DS_GraphPage(driver);
	    Graph.clickOnGraphelement();
	}
	
	@When("User click on the try here button to go to try")
	public void user_click_on_the_try_here_button_to_go_to_try() {
	 DS_GraphPage graph =  new DS_GraphPage(driver);
	 graph.clickOnTryhere();
	}

	@Then("User inputs the valid python code in the text editor box from the Excel sheet sheet {string} and rownumber {int}")
	public void user_inputs_the_valid_python_code_in_the_text_editor_box_from_the_excel_sheet_sheet_and_rownumber(String sheetname, Integer rownum) throws EncryptedDocumentException, IOException {
		DS_ArrayPage Array = new DS_ArrayPage(driver);
		   Array.Enter_Python_code(sheetname, rownum);
		   TryEditorPage tryeditor = new TryEditorPage(driver);
			tryeditor.ClickRunButton();
	}

	@When("User clicks on the GraphRepresentations and user is in that page")
	public void user_clicks_on_the_graph_representations_and_user_is_in_that_page() {
		DS_GraphPage Graph = new DS_GraphPage(driver);
		Graph.clickOnGraphRepresentations();
	}



}
