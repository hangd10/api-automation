package test.java.runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
	features={"src/test/resources/features"},
	glue={"test/java/steps"},
	// monochrome = true,	// uncomment for easier debugging
	plugin={"pretty", "com.cucumber.listener.ExtentCucumberFormatter:CucumberOutput/Extentreport.html"},
	tags = {"@smoke"}
)

public class SmokeTestRunner extends MainTestRunner {

}
