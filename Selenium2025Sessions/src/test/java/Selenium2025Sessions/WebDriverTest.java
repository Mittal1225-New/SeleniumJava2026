package Selenium2025Sessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTest {



	public static void main(String[] args) {

	
	
	WebDriverManager.chromedriver().setup();
	
	//System.setProperty("webdriver.chrome.driver","/Users/drmga/Downloads/chromedriver-mac-arm64/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.close();
	
	
	
}

	
}