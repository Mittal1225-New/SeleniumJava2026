package SeleniumBasicsFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links are " + links.size());
		
		for(int i = 0; i <= links.size(); i++)
		
		{
		
		System.out.println(links.get(i).getText());
		
		}
		
		driver.close();
		
		
		
		

	}

}
