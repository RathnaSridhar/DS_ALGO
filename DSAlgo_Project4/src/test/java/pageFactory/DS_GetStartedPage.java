package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_GetStartedPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class = 'content']//button")
	private WebElement Get_Started_btn;

	@FindBy(xpath = "//a[@class = 'navbar-brand']")
	private WebElement Nav_bar;

	@FindBy(xpath = "//div[@class = 'row row-cols-1 row-cols-md-3 g-4']//a[1][@href = \"data-structures-introduction\"]")
	WebElement Data_Intro_Get_Started_btn;

	@FindBy(xpath = "//div[2][@class = 'col']//a")
	WebElement Array_GetStarted_Button;

	@FindBy(xpath = "//div[3][@class = 'col']//a")
	WebElement LinkedList_button;

	@FindBy(xpath = "//div[4][@class = 'col']//a")
	WebElement Stack_Get_started_button;

	@FindBy(xpath = "//div[5][@class = 'col']//a")
	WebElement Queue;

	@FindBy(xpath = "//div[6][@class = 'col']//a")
	WebElement tree;
	
	@FindBy(xpath = "//div[7][@class = 'col']//a")
	WebElement graphLink;

	public DS_GetStartedPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Get_Started_Button() {
		Get_Started_btn.click();
	}

	public void Nav_Bar_isdiaplyed() {
		Nav_bar.isDisplayed();
	}

	public void Data_Intro_GetStarted() {
		Data_Intro_Get_Started_btn.click();
	}

	public void Array_Get_Started() {
		Array_GetStarted_Button.click();
	}

	public void LinkedList_Get_started() {
		LinkedList_button.click();
	}

	public void Stack_Get_started() {
		Stack_Get_started_button.click();
	}

	public void Click_Queue_Get_Started() {
		Queue.click();
	}

	public void Click_TreesLink_Get_Started() {
		tree.click();
	}
	public void Click_Graph_Link() {
		graphLink.click();
	}
}