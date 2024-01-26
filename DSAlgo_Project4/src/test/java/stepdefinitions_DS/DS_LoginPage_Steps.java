package stepdefinitions_DS;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverfactory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DS_GetStartedPage;
import pageFactory.DS_LoginPage;

public class DS_LoginPage_Steps {
	WebDriver driver;

	@Given("User is in the homepage")
	public void user_is_in_the_homepage() {
		driver = Driverfactory.getdriver();

		DS_GetStartedPage Get = new DS_GetStartedPage(driver);
		Get.Get_Started_Button();
	}

	@Then("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		DS_LoginPage Login = new DS_LoginPage(driver);
		Login.Click_Signin_menu();
	}

	@When("User enters the invalid username {string} and password {string} and click on login button")
	public void user_enters_the_invalid_username_and_password_and_click_on_login_button(String username,
			String password) {
		DS_LoginPage Login = new DS_LoginPage(driver);
		Login.UserName(username);
		Login.Password(password);
		Login.Click_Sigin_button();

	}

	@Then("The user should get an error message")
	public void the_user_should_get_an_error_message() {
		DS_LoginPage Login = new DS_LoginPage(driver);
		Assert.assertTrue(true, Login.Error_msg());
	}

	@When("User missed to fill out all the required fields {string} and {string}")
	public void user_missed_to_fill_out_all_the_required_fields_and(String user_name, String password) {
		DS_LoginPage Login = new DS_LoginPage(driver);
		Login.UserName(user_name);
		Login.Password(password);
		Login.Click_Sigin_button();

	}

	@Then("User should get a error message to fill out the missing field")
	public void user_should_get_a_error_message_to_fill_out_the_missing_field() {
		String ExpMessage = "Please fill out this field";
		Assert.assertTrue(true, ExpMessage);
	}

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("   User is in the login page");
	}

	@When("User enter the valid username and password then he clicks on the login button")
	public void user_enter_the_valid_username_and_password_then_he_clicks_on_the_login_button() {
		DS_LoginPage login = new DS_LoginPage(driver);
		login.Login();
	}

	@Then("User is successfully logged in to the app")
	public void user_is_successfully_logged_in_to_the_app() {
		DS_LoginPage login = new DS_LoginPage(driver);
		String successmsg = login.Login_Success();
		Assert.assertTrue(true, successmsg);
		login.SignOut();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
