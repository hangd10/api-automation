Feature: Application Configurations
	APIc calls for application configurations

Scenario: Invoke API call to get 200 status
	Given I make a GET AppConfig to /users
	Then I get a valid AppConfig response

