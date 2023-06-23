package com.stepdef;

import java.util.Date;

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

	@Given("I Enter the all mandatory personal details data such as firstname,lastname,Telephone.")
	public void i_enter_the_all_mandatory_personal_details_data_such_as_firstname_lastname_telephone() {
		driver.findElement(By.name("firstname")).sendKeys("ACBD");
		driver.findElement(By.name("lastname")).sendKeys("ACB");
		driver.findElement(By.name("telephone")).sendKeys("123456");
	}
	@When("I Enter the E-mail address.")
	public void i_enter_the_e_mail_address() {
//		driver.findElement(By.name("email")).sendKeys("hphari2028@gmail.com");
		driver.findElement(By.name("email")).sendKeys(dynamicdata());
	}
	@When("I Enter the all mandatory personal details data such as password and password confirm")
	public void i_enter_the_all_mandatory_personal_details_data_such_as_password_and_password_confirm() {
		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
		driver.findElement(By.name("confirm")).sendKeys("Avengers@2023");
	}
	@When("I click the radio in subscribe fields as yes and click the checkbox in privacy policy fields")
	public void i_click_the_radio_in_subscribe_fields_as_yes_and_click_the_checkbox_in_privacy_policy_fields() {
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
	}
	@Then("I Click the Continue button User Should able to create the account and get the message as account sucessfully create")
	public void i_click_the_continue_button_user_should_able_to_create_the_account_and_get_the_message_as_account_sucessfully_create() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String text = driver.findElement(By.xpath("//div[@id='content']/p")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	}

	//************************************************************

	@When("I enter the detail for create the new account with already registered E-mail address.")
	public void i_enter_the_detail_for_create_the_new_account_with_already_registered_e_mail_address() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("hphari2026@gmail.com");
//		driver.findElement(By.name("email")).sendKeys(dynamicdata());
	}
	@When("I Enter the all mandatory personal details data such as pass_word and pass_word confirm")
	public void i_enter_the_all_mandatory_personal_details_data_such_as_pass_word_and_pass_word_confirm() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
		driver.findElement(By.name("confirm")).sendKeys("Avengers@2023");
	}
	@When("I click the radio in subscribe fields as yes and click the chec_kbox in privacy policy fields1")
	public void i_click_the_radio_in_subscribe_fields_as_yes_and_click_the_chec_kbox_in_privacy_policy_fields1() throws InterruptedException {
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
	}
	@When("I Click the Continue button and User should not able to logged in insetead of showing message Warning: E-Mail Address is already registered!.")
	public void i_click_the_continue_button_and_user_should_not_able_to_logged_in_insetead_of_showing_message_warning_e_mail_address_is_already_registered() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(text);
	}

	//****************************************************************

	@When("I Enter the new E-mail address.")
	public void i_enter_the_new_e_mail_address() {
//		driver.findElement(By.name("email")).sendKeys("hphari2026@gmail.com");
		driver.findElement(By.name("email")).sendKeys(dynamicdata());
	}
	@When("I Enter the all mandatory personal details data such as pass_word1 and pass_word1 confirm.")
	public void i_enter_the_all_mandatory_personal_details_data_such_as_pass_word1_and_pass_word1_confirm() {
		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
		driver.findElement(By.name("confirm")).sendKeys("Avengers@2023");
	}
	@When("I click the radio in subscribe fields as yes and without clicking privacy checkbox.")
	public void i_click_the_radio_in_subscribe_fields_as_yes_and_without_clicking_privacy_checkbox() {
		driver.findElement(By.name("newsletter")).click();
	}
	@When("I click the continue button and user should not able to logged in instead of showing message Warning: You must agree to the Privacy Policy!.")
	public void i_click_the_continue_button_and_user_should_not_able_to_logged_in_instead_of_showing_message_warning_you_must_agree_to_the_privacy_policy() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String text = driver.findElement(By.xpath("//div[text()='Warning: You must agree to the Privacy Policy!']")).getText();
		System.out.println(text);	
	}

	//********************************************************

	@When("User enter E-mail address.")
	public void user_enter_e_mail_address() {
//		driver.findElement(By.name("email")).sendKeys("hphari2000@gmail.com");
		driver.findElement(By.name("email")).sendKeys(dynamicdata());
		
	}
	@When("User Enter different password for both password and password confirm field")
	public void user_enter_different_password_for_both_password_and_password_confirm_field() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
		driver.findElement(By.name("confirm")).sendKeys("Avengers@2024");
		Thread.sleep(3000);
	}
	@When("User click the continue button and user should not able to logged-in instead of it should showing respective Error message .")
	public void user_click_the_continue_button_and_user_should_not_able_to_logged_in_instead_of_it_should_showing_respective_error_message() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String text = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
		System.out.println(text);
	}
	
	public static String dynamicdata() {
		
		Date d = new Date();
		return "Hari"+d.toString().replace(" ", "_").replace(":", "#")+"@gmail.com";
		
	}
}

