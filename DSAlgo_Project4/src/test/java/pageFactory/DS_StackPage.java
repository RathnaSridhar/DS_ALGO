package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_StackPage {
	WebDriver driver;
	public DS_StackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[contains(text(),('Operations in Stack'))]")
	WebElement Operations_In_stack;
	
	@FindBy (xpath = "//a[contains(text(),('Implementation'))]")
	WebElement Implementaion_in_stack;
	
	@FindBy (xpath = "//a[contains(text(),('Applications'))]")
	WebElement Application_in_stack;
	
	@FindBy (xpath = "//a[@class= 'btn btn-info']")
	WebElement Try_her_btn;
	
	
	public void Click_Operations_In_Stack() {
		Operations_In_stack.click();
	}
	
	public void Click_Implementation_In_Stack() {
		Implementaion_in_stack.click();
	}
	
	public void Click_Application_In_stack() {
		Application_in_stack.click();
	}
	
	public void Click_Try_Here() {
		Try_her_btn.click();
	}
}
