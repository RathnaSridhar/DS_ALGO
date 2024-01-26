package pageFactory;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelElement;

public class DS_ArrayPage {
	WebDriver driver;
	
	
	public DS_ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[contains (text(),('Arrays in Python'))]")
	WebElement Arrays_In_Python;
	@FindBy (xpath = "//a[@class = 'btn btn-info']")
	WebElement Try_Here_Button;
	@FindBy (xpath = "//a[contains (text(),('Arrays Using List'))]")
	WebElement Arrays_Using_List;
	@FindBy (xpath = "//a[contains(text(),('Basic Operations in Lists'))]")
	WebElement Basic_Operations_in_List;
	@FindBy (xpath = "//a[contains(text(),('Applications of Array'))]")
	WebElement Applications_of_Array;
	@FindBy(xpath = "//a[contains(text(),('Search the array'))]")
	WebElement Search_The_Array;
	@FindBy (xpath = "//a[contains(text(),('Questions'))]")
	WebElement Practice_Question;
	@FindBy (xpath = "//a[contains(text(),('Max Consecutive Ones'))]")
	WebElement Max_Consecutive_Ones;
	@FindBy (xpath  = "//a[contains(text(),('Find Numbers with Even Number of Digits'))]")
	WebElement Find_Numbers_with_Even_Number_of_Digits;
	@FindBy (xpath = "//a[contains(text(),('Squares of  a Sorted Array'))]")
	WebElement Squares_Of_A_Sorted_Array;
	
	public void Click_Arrays_In_Python() {
		Arrays_In_Python.click();	
	}
	public WebElement Try_here_button() {
		return Try_Here_Button;
		
	}
	public void Click_Arrays_Using_List() {
		Actions action = new Actions(driver);
		action.scrollToElement(Arrays_Using_List).build().perform();
		Arrays_Using_List.click();
	}
	public void Click_Basic_Operations_in_List() {
		Actions action = new Actions(driver);
		action.scrollToElement(Basic_Operations_in_List).build().perform();
		Basic_Operations_in_List.click();
	}
	public void Click_Applications_of_Array() {
		Actions action = new Actions(driver);
		action.scrollToElement(Applications_of_Array).build().perform();
		Applications_of_Array.click();
	}
	
	public void Enter_Python_code(String sheetname, int rowNum) throws EncryptedDocumentException, IOException {
		
		TryEditorPage Try_editor_Obj = new TryEditorPage(driver);
		ExcelElement excelelement_Obj = new ExcelElement();
		Actions action = new Actions(driver);
		String code = excelelement_Obj.getCodeFromExcel(sheetname, rowNum);
		action.sendKeys(Try_editor_Obj.getEditorTextbox(),code).build().perform();
	}
	
	public void Click_Search_The_Array() {
		Actions action = new Actions(driver);
		action.scrollToElement(Search_The_Array).build().perform();
		Search_The_Array.click();
	}
	public void Click_Practice_Question() {
		Actions action = new Actions(driver);
		action.scrollToElement(Practice_Question).build().perform();
		Practice_Question.click();
	}
	public void Click_Max_Consecutive_ones() {
		Actions action = new Actions(driver);
		action.scrollToElement(Max_Consecutive_Ones).build().perform();
		Max_Consecutive_Ones.click();
	}
	
	public void Click_Find_Numbers_with_Even_Number_of_Digits() {
		Actions action = new Actions(driver);
		action.scrollToElement(Find_Numbers_with_Even_Number_of_Digits).build().perform();
		Find_Numbers_with_Even_Number_of_Digits.click();
	}
	public void Click_Squares_Of_A_Sorted_Array() {
		Actions action = new Actions(driver);
		action.scrollToElement(Squares_Of_A_Sorted_Array).build().perform();
		Squares_Of_A_Sorted_Array.click();
	}
}
