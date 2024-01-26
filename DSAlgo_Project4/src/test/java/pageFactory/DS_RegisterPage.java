package pageFactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Load_Properties;

public class DS_RegisterPage {
	WebDriver driver;
	Properties prop;

	

	@FindBy(xpath = "//a[contains(text(),' Register')]")
	private WebElement Register;
	@FindBy(name = "username")
	private WebElement username_box;
	@FindBy(name = "password1")
	private WebElement Password_Box;
	@FindBy(name = "password2")
	private WebElement Confirm_Password_Tab;
	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement Click_on_Register;
	@FindBy(xpath = "//div[@class = 'alert alert-primary']")
	WebElement alertMessage;
	
	public DS_RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Click_Register_Tab() {
		Register.click();
	}

	public void Enter_Username(String Username) {
		username_box.sendKeys(Username);
	}

	public void Enter_Password(String Password1) {
		Password_Box.sendKeys(Password1);
	}

	public void Confirm_password(String Password2) {
		Confirm_Password_Tab.sendKeys(Password2);
	}

	public void Click_Register() {
		Click_on_Register.click();
	}

	public void Valid_Username() {
		prop = Load_Properties.Load_Property_file();
		username_box.sendKeys(prop.getProperty("Username"));
	}

	public void Valid_enter_password() {
		prop = Load_Properties.Load_Property_file();
		Password_Box.sendKeys(prop.getProperty("Password1"));
	}

	public void Valid_Confirm_Password() {
		prop = Load_Properties.Load_Property_file();
		Confirm_Password_Tab.sendKeys(prop.getProperty("Password1"));
	}

	public String Success_Message() {
		return alertMessage.getText();
	}
}
