package TestNG;

import org.testng.annotations.Test;

public class TestNGStart {
	
	//Without priority TestNg test will execute in Alphabetical order
	//Priority always starts from 0. (priority = 1)
	//if you dont want to execute any method then use (enabled = false). By default it will be true
	
	//For Reports - Refresh your project and look for test-output folder, expand, emailable report and index.html report
	
	
	
	 @Test  
	  public void wakeUp() {
		  
		  System.out.println("Good Morning");
		  
		}
	
	  @Test(priority = 1, enabled = false)
	  public void breakFast() {
		  
		  System.out.println("Idli");
		  
	   }
	
	  @Test(priority = 2)
	  public void afterNoon() {
		  
		  System.out.println("Lunch");
		  
	}
	  
	  @Test(priority = 3) 
	  public void work() {
		  
		  System.out.println("SeleniumTesting");
		  
      }
	  
	  @Test
	  public void cooking() {
		  
		  System.out.println("IndianDish");
		  
		  
		}



}
