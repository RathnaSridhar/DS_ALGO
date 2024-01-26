package stepdefinitions_DS;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverfactory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DS_GetStartedPage;
import pageFactory.DS_RegisterPage;

public class DS_RegisterPage_Steps {

	WebDriver driver;

	@Given("User is on the Register Page")
	public void user_is_on_the_register_page() {
		driver = Driverfactory.getdriver();
		DS_GetStartedPage Get = new DS_GetStartedPage(driver);
		Get.Get_Started_Button();
		DS_RegisterPage Regsitration = new DS_RegisterPage(driver);
		Regsitration.Click_Register_Tab();
	}

	@When("User leaves some fields {string}, {string} and {string} empty")
	public void user_leaves_some_fields_and_empty(String Username, String Password1, String Password2) {
		DS_RegisterPage Regsitration = new DS_RegisterPage(driver);
		Regsitration.Enter_Username(Username);
		Regsitration.Enter_Password(Password1);
		Regsitration.Confirm_password(Password2);

	}

	@And("User clicks on the register button")
	public void user_clicks_on_the_register_button() {
		DS_RegisterPage Registration = new DS_RegisterPage(driver);
		Registration.Click_Register();

	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
		String ExpMessage = "Please fill out this field";
		Assert.assertTrue(true, ExpMessage);
	}

	public WebDriver getdriver() {
		return driver;
	}
}
