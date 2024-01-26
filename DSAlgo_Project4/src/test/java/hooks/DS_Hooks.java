package hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverfactory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.LoggerLoad;

public class DS_Hooks {
	 WebDriver driver = null;;
	Driverfactory df;
	
	
	@Before
	public void setup() {
		df = new Driverfactory();
		Driverfactory.InitializeDriver("chrome");	
		Driverfactory.driver.get("https://dsportalapp.herokuapp.com/");
		LoggerLoad.Info("Logged in to the DS Algo App");
		
	}
	
	@After
	public void teardown(Scenario scenario) {
		String scenarionName = scenario.getName().replaceAll(" ", "_");
		if (scenario.isFailed()) {
			byte[] sourcescreenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcescreenshot, "img/png", scenarionName);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(sourcescreenshot));
		}
		df.closeDriver();
		LoggerLoad.Info("Qutting the driver");
	}
	public  WebDriver getDriver() {
		return driver;
	}
}