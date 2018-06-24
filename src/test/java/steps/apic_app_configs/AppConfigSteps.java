package test.java.steps.apic_app_configs;

import org.testng.Reporter;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
import java.util.Arrays;
import test.java.steps.common.*;
import main.java.model.*;

public class AppConfigSteps {
	Response response;

	@Given("^I make a GET AppConfig to (.*)")
	public void api_get_call_to(String url) throws Throwable {
		APIcHostConfig config = EnvironmentConfig.getAPIcHostConfigs();
		response = RestAssured.get(config.getHost()+url);

		//System.out.println(url+ " time: " +response.getTime()+ "ms.");
		System.out.print(String.format("%1$10s", response.getTime()+ "ms "));
		System.out.println(url);
	}

	@Then("^I get a valid AppConfig response$")
	public void i_get_a_valid_response() throws Throwable {
		response.then().assertThat().statusCode(200);

		List<User> users = Arrays.asList(response.getBody().as(User[].class)); 
		// for (User user : users) {
		// 	System.out.println(user);
		// }
		//Reporter.log(user);
	}

	@When("^I make a request to appsettings/OnlineBind$")
    public void i_make_a_request_to_appsettings_onlinebind() throws Throwable {
		System.out.println("AppSettingsSteps.i_make_a_request_to_appsettings_onlinebind()");
		
		response = RestAssured.given()
				.relaxedHTTPSValidation()
				.header("x-ibm-client-id", "2894598c-8163-4187-8828-fe30534f1128")
				.header("x-ibm-client-secret", "kN4nF3fV6nH8gD0bF5mN2cB4lQ4rC7hK3vV1rH7xO7bV6jU0jU")
				.get("https://apisuat.calif.aaa.com/is/uat/appsettings/OnlineBind");

    }
}
