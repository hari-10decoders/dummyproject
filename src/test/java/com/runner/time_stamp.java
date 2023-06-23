package com.runner;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class time_stamp {
	
	public static String dynamicdata() {
		
		Date d = new Date();
		return "Hari"+d.toString().replace(" ", "_").replace(":", "#")+"@gmail.com";
		
	}
	
	public static void value() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10Decoders\\eclipse-workspace\\Dummy_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys(dynamicdata());
	}
	
public static void main(String[] args) {
	value();

}
}
