#
#@tag
Feature: To User Acount fucntionality

  Background: User open the registration page
    Given user open the account registration page
    #@reg1
    #Scenario: Check the registration functionality
    #*********************************************
    #Given I will open the browser
    #When 	I will launch the account registration page
    #	When 	I Enter the all mandatory personal details data such as firstname,lastname,E-mail,Telephone.
    #		And 	I Enter the all mandatory personal details data such as password and password confirm
    #		And 	I click the radio in subscribe fields as yes and click the checkbox in privacy policy fields
    #		Then 	I Click the Continue button User Should able to create the account and get the message as account sucessfully create
    #		 @reg2
    #		Scenario: Check the registration functionality with Existing email ID
    #		 /*********************************************
    #		When 	I Enter the all mandatory personal details data such as firstname,lastname,Telephone .
    #		And 	I enter the detail for create the new account with already registered E-mail address.
    #		And 	I Enter the all mandatory personal details data such as password and password confirm
    #		And 	I click the radio in subscribe fields as yes and click the checkbox in privacy policy fields
    #		But 	I Click the Continue button and User should not able to logged in insetead of showing message "Warning: E-Mail Address is already registered!".
    #
    		Scenario: Check the registration functionality without acknowlege privacy policy checkbox
    #		 /*********************************************
    #		@reg3
    When I Enter the all mandatory personal details data such as firstname,lastname,E-mail address and Telephone.
    And I Enter password and password_confirm.
    And I click the radio in subscribe fields as yes and without clicking privacy checkbox.
    But I click the continue button and user should not able to logged in instead of showing message "Warning: You must agree to the Privacy Policy!"
#		When the enter the all mandatory detail for create the new account without click the privacy checkbox.
#		But User should not able to get into login instead of it shows "Warning: You must agree to the Privacy Policy!".
#		@reg4
#		Scenario: Check the registration functionality With different password
#		Given the user open the ninja tutorial register account page.
#		When User enter the detail for create the new account.
#		And User Enter different password for both password and password confirm field
#		But User should able to not login and it should showing respective Error message .
#
#@login1
#	Background: User open the Log-In page
#		Given User open the log-In page 
#	
#	Scenario: Check the Log-In functionality with valid data
#	When Enter the valid username and valid password detail for log-In account
#	Then User click the log-in button and logged sucessfully.
#	
#@login2
#Scenario: Check the Log-In functionality with Invalid data
#	When the enter the valid username and Invalid password detail for log-In account.
#	And Userclick the log-in button.
#	But User should not able to login and get into the home page instead of showing respective error message .
#	
#	
