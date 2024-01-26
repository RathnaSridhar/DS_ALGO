package pageFactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Load_Properties;

public class DS_LoginPage {
	WebDriver driver;
	Properties prop;

	public DS_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[2][@class = 'navbar-nav']//a[text() = 'Sign in']")
	WebElement Sign_in_menu;
	@FindBy(id = "id_username")
	WebElement Username;
	@FindBy(id = "id_password")
	WebElement Password;
	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement Click_Login_button;
	@FindBy(xpath = "//div[@class='container']/following-sibling::div")
	WebElement Error_MSG1;
	@FindBy(xpath = "//a[@href = '/logout']")
	WebElement Signout_button;
	@FindBy(xpath = "//div[@class = 'alert alert-primary']")
	WebElement Success_msg;

	public void Click_Signin_menu() {
		Sign_in_menu.click();
	}

	public void UserName(String User_Name) {
		Username.sendKeys(User_Name);
	}

	public void Password(String password) {
		Password.sendKeys(password);
	}

	public void Click_Sigin_button() {
		Click_Login_button.click();
	}

	public String Error_msg() {
		String Error_msg = Error_MSG1.getText();
		return Error_msg;
	}

	public void Login() {
		prop = Load_Properties.Load_Property_file();
		Username.sendKeys(prop.getProperty("Username"));
		Password.sendKeys(prop.getProperty("Password1"));
		Click_Login_button.click();

	}

	public String Login_Success() {
		return Success_msg.getText();
	}

	public void SignOut() {
		Signout_button.click();
	}

}
