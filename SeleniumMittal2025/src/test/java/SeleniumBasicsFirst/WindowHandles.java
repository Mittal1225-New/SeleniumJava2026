package SeleniumBasicsFirst;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
      public static void main(String[] args) {
	
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	

	String parentwindowid = driver.getWindowHandle();
	 System.out.println("parentwindow="+parentwindowid);
	 WebElement tabbedwindow = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
	 tabbedwindow.click();
	 Set<String> windows = driver.getWindowHandles();
	 for(String handle : windows)
	 {
		 if(!handle.equals(parentwindowid))
		 {
			 driver.switchTo().window(handle);
			 String title = driver.getTitle();
			 System.out.println(title);
			 driver.close();
			 driver.switchTo().window(parentwindowid);
			 String parenttitle = driver.getTitle();
			 System.out.println(parenttitle);
			 
			 
		 }
	

	 }

      }
      
}
