package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_QueuePage {
	WebDriver driver;
	
	
	public DS_QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[contains(text(),('Implementation of Queue in Python'))]")
	WebElement Implementation_Of_Queue_In_Python;
	
	@FindBy (xpath = "//a[contains(text(),('Implementation using collections.deque'))]")
	WebElement Implementation_Using_Collection;
	
	@FindBy (xpath = "//a[contains(text(),('Implementation using array'))]")
	WebElement Implementation_Using_Array;
	
	@FindBy (xpath = "//a[contains(text(),('Queue Operations'))]")
	WebElement Queue_Opertaions;
	
	@FindBy (xpath = "//a[@class= 'btn btn-info']")
	WebElement Try_here_btn;
	
	public void Click_Implementation_Of_Queue_In_Python() {
		Actions action = new Actions(driver);
		action.scrollToElement(Implementation_Of_Queue_In_Python).build().perform();
		Implementation_Of_Queue_In_Python.click();
	}
	
	public void Click_Implementation_Using_Collection() {
		Actions action = new Actions(driver);
		action.scrollToElement(Implementation_Using_Collection).build().perform();
		Implementation_Using_Collection.click();
	}
	
	public void Click_Implementation_Using_Array() {
		Actions action = new Actions(driver);
		action.scrollToElement(Implementation_Using_Collection).build().perform();
		Implementation_Using_Array.click();
	}
	
	public void Click_Queue_Opertaions() {
		Actions action = new Actions(driver);
		action.scrollToElement(Queue_Opertaions).build().perform();
		Queue_Opertaions.click();
	}
	
	public void Click_Try_Here() {
		Actions action = new Actions(driver);
		action.scrollToElement(Try_here_btn).build().perform();
		Try_here_btn.click();
	}
	
}
