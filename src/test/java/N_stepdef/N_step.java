package N_stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import N_runner.N_runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class N_step {
	
	public static WebDriver driver = N_runner.driver;
	
	@Given("I navigate the log-In page.")
	public void i_navigate_the_log_in_page() throws InterruptedException {
		driver.navigate().refresh();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@When("I Enter the valid E-mail address.")
	public void i_enter_the_valid_e_mail_address() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("hphari2026@gmail.com");
	}
	@When("I Enter the vaild Password")
	public void i_enter_the_vaild_password() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Avengers@2023");
	}
	@Then("I click the Login button and it should let into logged-In.")
	public void i_click_the_login_button_and_it_should_let_into_logged_in() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String text = driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println(text);
	}
	@When("I Enter the invalid password")
	public void i_enter_the_invalid_password() {
		driver.findElement(By.name("password")).sendKeys("Avengers@20288");
	}
	@When("I Enter the login button it should not logged in instead of get respective error")
	public void i_enter_the_login_button_it_should_not_logged_in_instead_of_get_respective_error() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement value = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		System.out.println(value);
	}





}
