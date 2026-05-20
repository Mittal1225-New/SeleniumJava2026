package SeleniumBasicsFirst;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
         WebDriver driver;

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(5000);
		
		WebElement dropdown = driver.findElement(By.xpath("//button[text()='Dropdown']"));

		dropdown.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
		
		WebElement fblink = driver.findElement(By.xpath("//a[text()='Facebook']"));

		fblink.click();
		
		// click on the compose button as soon as the "compose" button is visible
		//driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		}
	}


