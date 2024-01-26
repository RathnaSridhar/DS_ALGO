package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_LinkedListPage {
	WebDriver driver;
	
	public DS_LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[contains(text(),('Introduction'))]")
	WebElement Linked_List_Intro;
	
	@FindBy (xpath = "//a[@class = 'btn btn-info']")
	WebElement TryHere_btn;
	
	@FindBy (xpath = "//a[contains(text(),('Creating Linked LIst'))]")
	WebElement Creating_Linked_List;
	
	@FindBy (xpath = "//a[contains(text(),('Types of Linked List'))]")
	WebElement Types_Of_Linked_List;
	
	@FindBy (xpath = "//a[contains(text(),('Implement Linked List in Python'))]")
	WebElement Implement_Linked_List_In_Python;
	
	@FindBy(xpath = "//a[contains(text(),('Traversal'))]")
	WebElement Traversal_LinkedList;
	
	@FindBy (xpath = "//a[contains(text(),('Insertion'))]")
	WebElement Insertion_Linked_List;
	
	@FindBy (xpath = "//a[contains(text(),('Deletion'))]")
	WebElement Deletion_Linked_List;
	
	public void Click_LinkedList_Introduction() {
		Actions action = new Actions(driver);
		action.scrollToElement(Linked_List_Intro).build().perform();
		Linked_List_Intro.click();
	}
	public void Click_Try_here() {
		Actions action = new Actions(driver);
		action.scrollToElement(TryHere_btn).build().perform();
		TryHere_btn.click();
	}
	public void Click_Creating_Linked_List() {
		Actions action = new Actions(driver);
		action.scrollToElement(Creating_Linked_List).build().perform();
		Creating_Linked_List.click();
	}
	
	public void Click_Types_of_Linked_List() {
		Actions action = new Actions(driver);
		action.scrollToElement(Types_Of_Linked_List).build().perform();
		Types_Of_Linked_List.click();
	}
	public void Click_Implement_Linked_List_In_Python() {
		Actions action = new Actions(driver);
		action.scrollToElement(Implement_Linked_List_In_Python).build().perform();
		Implement_Linked_List_In_Python.click();
	}
	
	public void Click_Traversal_Linked_List() {
		Actions action = new Actions(driver);
		action.scrollToElement(Traversal_LinkedList).build().perform();
		Traversal_LinkedList.click();
	}
	
	public void Click_Insertion_Linked_List() {
		Actions action = new Actions(driver);
		action.scrollToElement(Insertion_Linked_List).build().perform();
		Insertion_Linked_List.click();
	}
	public void Click_Deletion_Linked_List() {
		Actions action = new Actions(driver);
		action.scrollToElement(Deletion_Linked_List).build().perform();
		Deletion_Linked_List.click();
	}
	
}
