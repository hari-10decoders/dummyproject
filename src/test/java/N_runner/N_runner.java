package N_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\comNew\\feature",
glue={"N_stepdef"}, tags = ("@tag1 or @tag2")
		)

public class N_runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10Decoders\\eclipse-workspace\\Dummy_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
}
	@AfterClass
	public static void teardown() {
		driver.close();
		
		
	}
}
