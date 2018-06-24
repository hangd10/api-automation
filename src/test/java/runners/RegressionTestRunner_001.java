package test.java.runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
	features={"src/test/resources/features"},
	glue={"test/java/steps"},
	plugin={"com.cucumber.listener.ExtentCucumberFormatter:CucumberOutput/Extentreport.html"},
	tags = {"@regression_001"}
)

public class RegressionTestRunner_001 extends MainTestRunner {

}
