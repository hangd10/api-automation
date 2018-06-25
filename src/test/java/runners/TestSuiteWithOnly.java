package test.java.runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
	features={"src/test/resources/features"},
	glue={"test/java/steps"},
	monochrome = true,
	plugin={"pretty", "com.cucumber.listener.ExtentCucumberFormatter:CucumberOutput/Extentreport.html"},
	tags = {"@only"}
)

public class TestSuiteWithOnly extends MainTestRunner {

}
