package SeleniumBasicsFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");

		// To Maximize the window:
		driver.manage().window().maximize();

		String expectedValue = driver.getTitle();
		System.out.println("Expected Value: " + expectedValue);
		String actualValue = "Google";
		System.out.println("Actual Value: " + actualValue);
		// Assert Assertion or Hard Assertion
		
		Assert.assertEquals(expectedValue, actualValue, "URL Not Matched");
		
		System.out.println("All good");
		
		//close browser:
		driver.close();

	}

}
