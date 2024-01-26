package pageFactory;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelElement;

public class TryEditorPage {
	WebDriver driver;
	@FindBy(xpath = "//div[@class = 'CodeMirror-scroll']")
	WebElement TextEditorBox;
	@FindBy(xpath = "//button[@type = 'button']")
	WebElement run_btn;
	@FindBy(xpath = "//*[@id = 'output']")
	WebElement Output_window;
	@FindBy (xpath = "//div[@class = 'CodeMirror-lines']")
	WebElement Clear_text;

	
	public TryEditorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SendDataToEditor() throws EncryptedDocumentException, IOException {
		TextEditorBox.click();
		ExcelElement excel = new ExcelElement();
		
		String code = excel.getCodeFromExcel("Data", 0);
		System.out.println("*********Getting data**********");
		Actions actions = new Actions(driver);
		actions.sendKeys(TextEditorBox, code).build().perform();
	
	}

	public WebElement getEditorTextbox() {
		return TextEditorBox;
	}
	public void Clear_Text_Box() {
		TextEditorBox.click();
		Clear_text.clear();
	}

	public void ClickRunButton() {
		run_btn.click();
	}

	public String Output_text() {
		return Output_window.getText();
	}
}
