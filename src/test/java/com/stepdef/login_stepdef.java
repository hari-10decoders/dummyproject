package com.stepdef;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runner.ninja_runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepdef {
	
	public static WebDriver driver = ninja_runner.driver;
	
	@Given("I navigate into login page")
	public void i_navigate_into_login_page() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@When("I Enter the valid username")
	public void i_enter_the_valid_username() {
		driver.findElement(By.name("email")).sendKeys("hphari2026@gmail.com");
	}
	@When("I Enter the valid password")
	public void i_enter_the_valid_password() {
		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
	}
	@Then("I Click the Login functionality and validate it should let into sucessfully logged-In.")
	public void i_click_the_login_functionality_and_validate_it_should_let_into_sucessfully_logged_in() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String text = driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println(text);
	}
	
	@When("I Enter the Invalid password")
	public void i_enter_the_invalid_password() {
		driver.findElement(By.name("password")).sendKeys("Avengers@20288");
	}
	@When("I click the log in button and it should not allow to get logged-in instead of showing respective error message")
	public void i_click_the_log_in_button_and_it_should_not_allow_to_get_logged_in_instead_of_showing_respective_error_message() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement value = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		System.out.println(value.getText());
		System.out.println("sucessfully passed the testcases1");
	}
	
	

}
