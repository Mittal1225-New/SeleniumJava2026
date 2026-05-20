package SeleniumBasicsFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownValueSelect {

	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.mercurytravels.co.in");
	       
	       Thread.sleep(7000);
	       
	       WebElement holiday = driver.findElement(By.id("themes"));
	       
	       //if I want to select value in dropdown 3 methods are there - All 3 methods are in select class
	       
	     //  select is inbuilt class 
	       
	       //SelectbyVisibleText
	       //SelectbyIndex
	       //SelectbyValue -
	    
	       Select st = new Select(holiday);
	       
	      // st.selectByIndex(4)  ;
	       
	      // st.selectByVisibleText("Nature");
	       
	       st.selectByValue("16");
	       
	       
	      // driver.close();


	}

}
