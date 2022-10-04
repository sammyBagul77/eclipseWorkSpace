package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/actiTime.feature" }, glue = {
		"cucumberFramework" }, plugin = { "html:Reports/reports1.html " }, monochrome = true, publish = true)

public class run extends AbstractTestNGCucumberTests {

}
