package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\FeatureFiles\\productList.feature", }, glue = {
		"stepDefination" }, plugin = {"html:Reports/flipkartReport2.html"}, monochrome= true, dryRun =false, publish =true)
public class run extends AbstractTestNGCucumberTests {

}
