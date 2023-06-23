package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.Runner_class;

public class StepDefinition {
	
	public static WebDriver driver = Runner_class.driver;
	@Given("user will open Ninja tutorial home page")
	public void user_will_open_ninja_tutorial_home_page() throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		Thread.sleep(3000);
	}
	@When("user navigate the login page")
	public void user_navigate_the_login_page() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	@When("user Enter the E-mail ID")
	public void user_enter_the_e_mail_id() {
		driver.findElement(By.id("input-email")).sendKeys("hphari8280@gmail.com");
	}
	@When("user Enter the password")
	public void user_enter_the_password() {
		driver.findElement(By.id("input-password")).sendKeys("Vikkram@2023");
	}
	@Then("user click the login button it should navigate to logged-In page.")
	public void user_click_the_login_button_it_should_navigate_to_logged_in_page() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("sucessfull");
	}



}