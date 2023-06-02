package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.runner.ninja_runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ninja_stepdef {
	
	public static WebDriver driver = ninja_runner.driver;
	
	@Given("user open the account registration page")
	public void user_open_the_account_registration_page() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
//	@Given("I will open the browser")
//	public void i_will_open_the_browser() {
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
//		driver.navigate().refresh();
//	}
//	@When("I will launch the account registration page")
//	public void i_will_launch_the_account_registration_page() {
//		driver.findElement(By.name("firstname")).sendKeys("ACBD");
//	}
//	@When("I Enter the all mandatory personal details data such as firstname,lastname,E-mail,Telephone.")
//	public void i_enter_the_all_mandatory_personal_details_data_such_as_firstname_lastname_e_mail_telephone() {
//		
//		driver.findElement(By.name("lastname")).sendKeys("ACB");
//		driver.findElement(By.name("email")).sendKeys("hphari2023@gmail.com");
//		driver.findElement(By.name("telephone")).sendKeys("123456");
//	}
//	@When("I Enter the all mandatory personal details data such as password and password confirm")
//	public void i_enter_the_all_mandatory_personal_details_data_such_as_password_and_password_confirm() {
//		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
//		driver.findElement(By.name("confirm")).sendKeys("Avengers@2023");	
//	}
//	@When("I click the radio in subscribe fields as yes and click the checkbox in privacy policy fields")
//	public void i_click_the_radio_in_subscribe_fields_as_yes_and_click_the_checkbox_in_privacy_policy_fields() {
//		driver.findElement(By.name("agree")).click();
//		
//	}
//	@Then("I Click the Continue button User Should able to create the account and get the message as account sucessfully create")
//	public void i_click_the_continue_button_user_should_able_to_create_the_account_and_get_the_message_as_account_sucessfully_create() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		String text = driver.findElement(By.xpath("//div[@id='content']/p")).getText();
//		System.out.println(text);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
//		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
//		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
//		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
//		Thread.sleep(3000);
//	}

//************************************************************
//	@When("I enter the detail for create the new account with already registered E-mail address.")
//	public void i_enter_the_detail_for_create_the_new_account_with_already_registered_e_mail_address() {
//		driver.findElement(By.name("email")).sendKeys("hphari2023@gmail.com");
//	}
//	@When("I Enter the all mandatory personal details data such as password and password confirm")
//	public void i_enter_the_all_mandatory_personal_details_data_such_as_password_and_password_confirm() {
//		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
//		driver.findElement(By.name("confirm")).sendKeys("Avengers@2023");
//	}
//	@When("I click the radio in subscribe fields as yes and click the checkbox in privacy policy fields")
//	public void i_click_the_radio_in_subscribe_fields_as_yes_and_click_the_checkbox_in_privacy_policy_fields() {
//		driver.findElement(By.name("agree")).click();
//	}
//	@When("I Click the Continue button and User should not able to logged in insetead of showing message {string}.")
//	public void i_click_the_continue_button_and_user_should_not_able_to_logged_in_insetead_of_showing_message(String string) {
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//		System.out.println(text);	
//	}

//************************************************************
	

	@When("I Enter the all mandatory personal details data such as firstname,lastname,E-mail address and Telephone.")
	public void i_enter_the_all_mandatory_personal_details_data_such_as_firstname_lastname_e_mail_address_and_telephone() {
		driver.findElement(By.name("firstname")).sendKeys("ACBD");
		driver.findElement(By.name("lastname")).sendKeys("ACB");
		driver.findElement(By.name("email")).sendKeys("hphari2023@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("123456");
	}
	@When("I Enter password and password_confirm.")
	public void i_enter_password_and_password_confirm() {
		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
		driver.findElement(By.name("confirm")).sendKeys("Avengers@2023");
	}
	@When("I click the radio in subscribe fields as yes and without clicking privacy checkbox.")
	public void i_click_the_radio_in_subscribe_fields_as_yes_and_without_clicking_privacy_checkbox() {
		driver.findElement(By.name("newsletter")).click();
	}
	@When("I click the continue button and user should not able to logged in instead of showing message {string}")
	public void i_click_the_continue_button_and_user_should_not_able_to_logged_in_instead_of_showing_message(String string) {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String text = driver.findElement(By.xpath("//div[text()='Warning: You must agree to the Privacy Policy!']")).getText();
		System.out.println(text);	
	}

//********************************************************
	
		
//	@Given("the user open the ninja tutorial register account page.")
//	public void the_user_open_the_ninja_tutorial_register_account_page() {
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
//	}
//	
//	@When("User enter the detail for create the new account.")
//	public void user_enter_the_detail_for_create_the_new_account() {
//		
//		driver.findElement(By.name("firstname")).sendKeys("ACBD");
//		driver.findElement(By.name("lastname")).sendKeys("ACB");
//		driver.findElement(By.name("email")).sendKeys("hphari8494@gmail.com");
//		driver.findElement(By.name("telephone")).sendKeys("123456");
//		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
//		driver.findElement(By.name("confirm")).sendKeys("Avengers@203");
//		driver.findElement(By.name("agree")).click();
//	}
//	@When("User Enter different password for both password and password confirm field")
//	public void user_enter_different_password_for_both_password_and_password_confirm_field() {
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//	}
//	@When("User should able to not login and it should showing respective Error message .")
//	public void user_should_able_to_not_login_and_it_should_showing_respective_error_message() {
//		String text = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
//		System.out.println(text);
//		
//	}

//	@Given("User open the log-In page")
//	public void user_open_the_log_in_page() {
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//	}
//	@When("Enter the valid username and valid password detail for log-In account")
//	public void enter_the_valid_username_and_valid_password_detail_for_log_in_account() {
//		driver.findElement(By.name("email")).sendKeys("hphari1994@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
//	}
//	@Then("User click the log-in button and logged sucessfully.")
//	public void user_click_the_log_in_button_and_logged_sucessfully() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(3000);
//	}
//
//	
//	@When("the enter the valid username and Invalid password detail for log-In account.")
//	public void the_enter_the_valid_username_and_invalid_password_detail_for_log_in_account() {
//		driver.findElement(By.name("email")).sendKeys("hphari1994@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Avengers@202");
//	}
//		
//	@When("Userclick the log-in button.")
//	public void userclick_the_log_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(3000);
//		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//		System.out.println(text);
//	}
//	@When("User should not able to login and get into the home page instead of showing respective error message .")
//	public void user_should_not_able_to_login_and_get_into_the_home_page_instead_of_showing_respective_error_message() {
//		
//	}
	}
	
