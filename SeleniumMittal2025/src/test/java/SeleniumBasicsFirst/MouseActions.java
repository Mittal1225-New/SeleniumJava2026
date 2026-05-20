package SeleniumBasicsFirst;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Program Files\\drivers\\chromedriver_win32\\chromedriver.exe");
				
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	
	   //DragAndDrop - https://jqueryui.com/droppable/ 
	
	   @Test (enabled = false)
		public void dragAndDrop() throws InterruptedException {
		
		Actions ac = new Actions(driver);
		driver.switchTo().frame(0);
		
	   WebElement  drag = driver.findElement(By.id("draggable"));
	   WebElement drop = driver.findElement(By.id("droppable"));
	
		
		ac.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(1000);
	}
	
	 //Alert Handling :  https://the-internet.herokuapp.com/javascript_alerts
	 // To hit ok for alert - accept()
	 // To cancel alert - dismiss()
	   
	@Test
	
	public void alertsOk() throws InterruptedException, IOException {
		
		WebElement alert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		
		alert.click();
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);	
		
		
		//To capture screenshot  
		//TakeScreenshot is an interface
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("//Users//drmga//Desktop//Bugs//google.png"));
			
		
	}
									
	//MoveToElement - It will focus or highlight on that element
	//DoubleClick - it will click on the element ( link or button)
	//ContextClick - Right click on element
	//perform() - you can write just perform method also, Bcz build() there is in perform method only
	
	@Test (enabled = false)
	public void alert() throws InterruptedException
	{
		WebElement Gmail =driver.findElement(By.xpath("//a[text()='Gmail']")); 
		Actions ac = new Actions(driver);
		ac.contextClick(Gmail).build().perform();
		Thread.sleep(3000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	}


