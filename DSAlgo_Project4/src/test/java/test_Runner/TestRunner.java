package test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (tags = "",
				features = {"src/test/resources/DS_Feature"},
				glue = {"stepdefinitions_DS", "hooks"},
				plugin = {"pretty", "html:target/htmreport.html",
						"json:target/cucumber.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						})
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
