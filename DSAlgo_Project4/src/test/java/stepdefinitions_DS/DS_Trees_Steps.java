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
import pageFactory.DS_TreePage;
import pageFactory.TryEditorPage;

public class DS_Trees_Steps {
	DS_Array_Steps ArraySteps = new DS_Array_Steps();
	DS_LinkedList_Steps LinkList = new DS_LinkedList_Steps();
	DS_DataIntro_Steps DataIntro = new DS_DataIntro_Steps();
	DS_Stack_Steps Stack = new DS_Stack_Steps();
	
	WebDriver driver;
	
	@And("User clicks on the Tree Get started button and user is on the Tree page")
	public void user_clicks_on_the_tree_get_started_button_and_user_is_on_the_tree_page() {
		 driver = Driverfactory.getdriver();
		    DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
		    Get_Started.Click_TreesLink_Get_Started();
	}

	@When("User clicks on the Overview of Trees and user is in that page")
	public void user_clicks_on_the_overview_of_trees_and_user_is_in_that_page() {
	    DS_TreePage Trees = new DS_TreePage(driver);
	    Trees.clickOnOverviewofTrees();
	}

	@And("User click on the try here button to go to try editor")
	public void user_click_on_the_try_here_button_to_go_to_try_editor() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnTryhere();
	}
	@Then("User inputs the valid python code in the text editor box from the excel sheet sheet {string} and rownumber {int}")
	public void user_inputs_the_valid_python_code_in_the_text_editor_box_from_the_excel_sheet_sheet_and_rownumber(String sheetname, Integer rownum) throws EncryptedDocumentException, IOException {
		DS_ArrayPage Array = new DS_ArrayPage(driver);
		   Array.Enter_Python_code(sheetname, rownum);
		   TryEditorPage tryeditor = new TryEditorPage(driver);
			tryeditor.ClickRunButton();
	}
	@When("User clicks on the Terminologies link in Trees and user is in that page")
	public void user_clicks_on_the_terminologies_link_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnTerminologies();
	}

	@When("User clicks on the Types of Trees link and user is in that page")
	public void user_clicks_on_the_types_of_trees_link_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnTypesofTrees();
	}

	@When("User clicks on the TreeTraversals in Trees and user is in that page")
	public void user_clicks_on_the_tree_traversals_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnTreeTraversals();
	}

	@When("User clicks on the TraversalsIllustration in Trees and user is in that page")
	public void user_clicks_on_the_traversals_illustration_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnTraversalIllustration();
	}

	@When("User clicks on the BinaryTrees in Trees and user is in that page")
	public void user_clicks_on_the_binary_trees_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnBinaryTrees();
	}

	@When("User clicks on the TypesofBinaryTrees in Trees and user is in that page")
	public void user_clicks_on_the_typesof_binary_trees_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnTypesofBinaryTrees();
	}

	@When("User clicks on the ImplementationinPython in Trees and user is in that page")
	public void user_clicks_on_the_implementationin_python_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnImplementationinPython();
	}

	@When("User clicks on the BinaryTreeTraversals in Trees and user is in that page")
	public void user_clicks_on_the_binary_tree_traversals_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnBinaryTreeTraversals();
	}

	@When("User clicks on the ImplementationofBinaryTrees in Trees and user is in that page")
	public void user_clicks_on_the_implementationof_binary_trees_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnImplementationinBinaryTrees();
	}

	@When("User clicks on the ApplicationsofBinaryTrees in Trees and user is in that page")
	public void user_clicks_on_the_applicationsof_binary_trees_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnApplicationsofBinaryTrees();
	}

	@When("User clicks on the BinarySearchTrees in Trees and user is in that page")
	public void user_clicks_on_the_binary_search_trees_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnBinarySearchTrees();
	}

	@When("User clicks on the ImplementationofBST in Trees and user is in that page")
	public void user_clicks_on_the_implementationof_bst_in_trees_and_user_is_in_that_page() {
		DS_TreePage Trees = new DS_TreePage(driver);
		Trees.clickOnImplementationofBST();
	}



}
