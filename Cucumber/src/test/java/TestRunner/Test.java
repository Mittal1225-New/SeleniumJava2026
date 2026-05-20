package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Cucumber/src/test/resources/features", 
		glue = { "StepDefinition" }, 
		dryRun = false
		//tags = "@DataTablesAndExamples", 
		//monochrome = true, 
		//plugin = { "html:report/webReport", "json:report/jsonreport.json" }
)

public class Test {
	
	

}
