
@login
Feature: Check the login functionality

	Background: User luanch the browser
	Given I navigate into login page
	When I Enter the valid username

  @tag1
  Scenario: Check the login scenario with valid data
    
    When I Enter the valid password 
    Then I Click the Login functionality and validate it should let into sucessfully logged-In.
    
  @tag1
  Scenario: To Check the login scenario with Invalid data
  
  	When I Enter the Invalid password
  	But I click the log in button and it should not allow to get logged-in instead of showing respective error message
  	