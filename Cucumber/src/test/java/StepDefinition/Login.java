package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	
	@Given("User has to launch the application")
	public void user_has_to_launch_the_application() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
	    
	}

	@When("User has to enter {string} and {string}")
	public void user_has_to_enter_and(String uname, String pwd) {
	   
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys(uname);
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys(pwd);
		
		
		
		
		
		
		
		
		
	}

	@When("User has to click on login button")
	public void user_has_to_click_on_login_button() {
	   
		

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.click();
		
	}

	@Then("User has to see dashboard")
	public void user_has_to_see_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
