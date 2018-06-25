Feature: Coverage Verifier
	APIc calls for business rules for Coverage Verifier
	
@smoke	
Scenario: Invoke API call to get 200 status
	Given I make a GET CoverageVerifier to /posts/1
	Then I get a valid CoverageVerifier response	

@only
Scenario: Invoke API call to get 200 status
	Given I make a GET CoverageVerifier to /posts
	Then I get a valid CoverageVerifier response

@smoke
Scenario: Invoke PUT API call to get 200 status
	Given I make a PUT CoverageVerifier to /posts/1 using data updatedPost.txt
	Then I get a valid CoverageVerifier response	