package pageFactory;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelElement;

public class DS_DataIntro_Page {
	WebDriver driver;
	
	public DS_DataIntro_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@class = 'list-group-item']")
	WebElement Time_Complexity_tab;
	@FindBy (xpath = "//a[@class = 'btn btn-info']")
	WebElement Try_here_button;
	@FindBy (xpath = "//*[@id = 'output']")
	WebElement output;
	
	public void Time_Complexity() {
		Time_Complexity_tab.click();
	}
	public void Click_TryHere_Button() {
		Try_here_button.click();
	}
	public void EnterInvalidCode(String sheetname, int rownum) throws EncryptedDocumentException, IOException {
		ExcelElement excelelements = new ExcelElement();
		Actions action = new Actions(driver);
		TryEditorPage tryeditorpage = new TryEditorPage(driver);
		String code = excelelements.getCodeFromExcel(sheetname, rownum);
		action.sendKeys(tryeditorpage.getEditorTextbox(),code).build().perform();
	}
	
	public String getTextfromOutputfield() {
		return output.getText();
		
	}
}
