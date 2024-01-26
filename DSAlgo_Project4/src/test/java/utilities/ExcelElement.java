package utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverfactory.Driverfactory;

public class ExcelElement {
	WebDriver driver = Driverfactory.getdriver();
	static String ExcelPath = "D:\\Rathna\\ExcelData.xlsx";
	static String code;
		
	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
	}
	public String getCodeFromExcel(String sheetname, int rownumber) throws EncryptedDocumentException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(ExcelPath, sheetname);
		code = testdata.get(rownumber).get("Pythoncode");
		return code;
	}
}
