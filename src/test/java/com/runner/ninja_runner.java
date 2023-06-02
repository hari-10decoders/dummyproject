package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature",glue={"com\\stepdef"} )

public class ninja_runner {
	
	
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10Decoders\\eclipse-workspace\\Dummy_project\\driver\\chromedriver.exe");

		 driver = new ChromeDriver();
		
}
	@AfterClass
	public static void teardown() {
//		driver.close();
		
	}
}
