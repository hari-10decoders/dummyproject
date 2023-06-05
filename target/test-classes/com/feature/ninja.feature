		@tags1
		Feature: To User Acount fucntionality
		
 		Background: User open the registration page
    Given user open the account registration page
    And I Enter the all mandatory personal details data such as firstname,lastname,Telephone.
       	
    @Reg1
    Scenario: Check the registration functionality

   	When  I Enter the E-mail address.
   	And 	I Enter the all mandatory personal details data such as password and password confirm
   	And 	I click the radio in subscribe fields as yes and click the checkbox in privacy policy fields
   	Then 	I Click the Continue button User Should able to create the account and get the message as account sucessfully create

    @reg2
   	Scenario: Check the registration functionality with Existing email ID

 		When 	I enter the detail for create the new account with already registered E-mail address.
 		And 	I Enter the all mandatory personal details data such as pass_word and pass_word confirm
 		And 	I click the radio in subscribe fields as yes and click the chec_kbox in privacy policy fields1
 		But 	I Click the Continue button and User should not able to logged in insetead of showing message Warning: E-Mail Address is already registered!.
    
    @reg3
  	Scenario: Check the registration functionality without acknowlege privacy policy checkbox
  	
  	When I Enter the new E-mail address.
 		And  I Enter the all mandatory personal details data such as pass_word1 and pass_word1 confirm.
    And  I click the radio in subscribe fields as yes and without clicking privacy checkbox.
    But  I click the continue button and user should not able to logged in instead of showing message Warning: You must agree to the Privacy Policy!.

		
		@reg4
		Scenario: Check the registration functionality With different password
		
		When User enter E-mail address.
		And  User Enter different password for both password and password confirm field
		But  User click the continue button and user should not able to logged-in instead of it should showing respective Error message .

	
	