package SeleniumBasicsFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollDown {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");

		
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,10000)", "");
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));

        // Scrolling down the page till the element is found		
        jse.executeScript("arguments[0].scrollIntoView();", Element);
    
	}

}
