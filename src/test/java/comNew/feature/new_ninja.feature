@tag9
Feature: Check the User Log-In functionality.

	Background: User launch browser
	
  Given I navigate the log-In page.
	When I Enter the valid E-mail address.

  @tag1
  Scenario: To Check the log-In scenario with valid data.
  When I Enter the vaild Password
  Then I click the Login button and it should let into logged-In.

  @tag2
  Scenario: Check the behaviour when invoke invalid password
  When I Enter the invalid password
  But I Enter the login button it should not logged in instead of get respective error
  

