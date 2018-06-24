package test.java.steps.apic_coverage_verifier;

import org.testng.Reporter;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;
import java.util.Arrays;
import test.java.steps.common.*;
import main.java.model.*;

public class CoverageVerifierSteps {
	Response response;

	@Given("^I make a GET CoverageVerifier to (.*)")
	public void api_get_call_to(String url) throws Throwable {
		APIcHostConfig config = EnvironmentConfig.getAPIcHostConfigs();
		response = RestAssured.get(config.getHost()+url);

		//System.out.println(url+ " time: " +response.getTime()+ "ms.");
		System.out.print(String.format("%1$10s", response.getTime()+ "ms "));
		System.out.println(url);
	}

	@Given("^I make a PUT CoverageVerifier to (.*) using data (.*)")
	public void api_put_call_to(String url, String dataFile) throws Throwable {
		APIcHostConfig config = EnvironmentConfig.getAPIcHostConfigs();

		String json = new String(Files.readAllBytes(Paths.get("src/test/resources/mockData/" +dataFile))); 
		response = RestAssured.given().body(json).put(config.getHost()+url);

		//System.out.println(url+ " time: " +response.getTime()+ "ms.");
		System.out.print(String.format("%1$10s", response.getTime()+ "ms "));
		System.out.println(url);
	}


	@Then("^I get a valid CoverageVerifier response$")
	public void i_get_a_valid_response() throws Throwable {
		response.then().assertThat().statusCode(200);
		//Reporter.log(user);
	}

}
