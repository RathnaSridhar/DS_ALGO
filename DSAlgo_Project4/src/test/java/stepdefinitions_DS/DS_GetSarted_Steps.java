package stepdefinitions_DS;

import org.openqa.selenium.WebDriver;

import driverfactory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DS_GetStartedPage;

public class DS_GetSarted_Steps {
	 WebDriver driver;

	
	public WebDriver get_Driver_GetStarted() {
		return driver;
	}
	
	@Given("User is opens the DS-Algo app")
	public void user_is_opens_the_ds_algo_app() {
		driver = Driverfactory.getdriver();
	    System.out.println("DS-Algo app opened");
	}

	@When("User clicks on the Get Started button")
	public void user_clicks_on_the_get_started_button() {
		DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
	   Get_Started.Get_Started_Button();
	}

	@Then("User is able to view the home page")
	public void user_is_able_to_view_the_home_page() {
		DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
	    Get_Started.Nav_Bar_isdiaplyed();
	}

	@When("User clicks on the Data Intorduction get started button then the customer is able to see the Data Introduction pgae")
	public void user_clicks_on_the_data_intorduction_get_started_button_then_the_customer_is_able_to_see_the_data_introduction_pgae() {
	    DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
	    Get_Started.Data_Intro_GetStarted();
	}
	@Then("User click the Array get started button use can see the Array page")
	public void user_click_the_array_get_started_button_use_can_see_the_array_page() {
	    DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
	    Get_Started.Array_Get_Started();
	}
	@Then("User clicks on the Linked list get started buttom and user can see the Linked list page")
	public void user_clicks_on_the_linked_list_get_started_buttom_and_user_can_see_the_linked_list_page() {
	    DS_GetStartedPage Get_started = new DS_GetStartedPage(driver);
	    Get_started.LinkedList_Get_started();
	}
	@And("User Clicks on the Queue get started button and user can view the Queue page")
	public void user_clicks_on_the_queue_get_started_button_and_user_can_view_the_queue_page() {
		DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
		Get_Started.Click_Queue_Get_Started();
	}
	
	@And("User Clicks on the Trees get started button and user can view the Trees page")
	public void user_clicks_on_the_Trees_get_started_button_and_user_can_view_the_queue_page() {
		DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
		Get_Started.Click_TreesLink_Get_Started();
	}
	
	@And("User clicks on the Graph link get started button and user can view the graph page")
	public void user_clicks_on_the_graph_link_get_started_button_and_user_can_view_the_graph_page() {
		DS_GetStartedPage Get_Started = new DS_GetStartedPage(driver);
		Get_Started.Click_Graph_Link();
	}
}
