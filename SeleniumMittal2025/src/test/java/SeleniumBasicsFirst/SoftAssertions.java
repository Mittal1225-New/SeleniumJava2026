package SeleniumBasicsFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertions {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		String expectedTitle = driver.getTitle();
		System.out.println("Expected Value: " + expectedTitle);
		String actualTitle = "oogle";
		System.out.println("Actual Value: " + actualTitle);

		String expectedUrl = driver.getCurrentUrl();
		System.out.println("Expected URL: " + expectedUrl);
		String actualUrl = "https://www.google.com/";
		System.out.println("Actual URL: " + actualUrl);

		// Verify Assertion or Soft Assertion- When we are using more multiple
		// assertions that time we use soft assertions.
		
		SoftAssert s = new SoftAssert();

		s.assertEquals(expectedTitle, actualTitle, "Not Matched");
		
		System.out.println("It Won't Stop Execution Even Assertion Fails");
		
		s.assertEquals(expectedUrl, actualUrl, "Not URL Matched");

		System.out.println("All good");

	//	s.assertAll();
		
	}
	
}
		
	