
@tag
Feature: Check1 the User account functionality in Ninja tutorial
	
  @tag1
  Scenario: User want to check the logIn fucntionality in Ninja tutorial
    Given user will open Ninja tutorial home page
    When user navigate the login page
    And user Enter the E-mail ID
    And user Enter the password
    Then user click the login button it should navigate to logged-In page.
    
   