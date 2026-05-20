package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNG {
	
	    WebDriver driver;
	
	   @BeforeTest
	   public void launchBrowser() {
		   
		   WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/");
		   
	   }
	   
	   @Test
	   public void countNameOfLinks() {
		 
		   List <WebElement> links = driver.findElements(By.tagName("a"));
			
			System.out.println("Total number of links are " + links.size());
			
			for(int i = 0; i <= links.size(); i++)
			
			{
			
			System.out.println(links.get(i).getText());
			
			}
		   }
	   
	   @AfterTest
	   public void closeBrowser() {
		   
		   driver.close();
		   
		   
	   }
	   
	   

}
