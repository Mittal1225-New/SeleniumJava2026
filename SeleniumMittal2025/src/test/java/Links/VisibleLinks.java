package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibleLinks {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.progressive.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links are" + links.size());
		
		int count = 0;
		
		for(int i = 0; i< links.size(); i++)
			
		{    
			if(links.get(i).isDisplayed());
			
			count++;
	  
		}
		
		System.out.println("Total number of visible links are " + count);
		
		System.out.println("Total number of disabled links are " + (links.size() - count) );
		
		


	}

}