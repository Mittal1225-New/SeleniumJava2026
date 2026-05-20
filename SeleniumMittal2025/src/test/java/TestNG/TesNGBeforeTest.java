package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TesNGBeforeTest {
	
    //@BeforeTest Pre-condition code. It will execute only once time before Test Methods
	//@AfterTest is post-condition. It will execute once after all the test methods are executed
	
	//@BeforeMethod - will execute before every test
	//@AfterMethod - will execute after every test
	
	
	   @BeforeMethod
	   public void wakeUp() {
		   
		   System.out.println("Good Morning");
	   }
	   
	  @Test
       public void  getReady() {
		   
		   System.out.println("Get ready for work");
	   }
	   
	   @Test(priority =1)
       public void breakFast() {
		   
		   System.out.println("Snack-Dosa");
	   } 
	
       @Test(priority =2)
	   public void movie() {
		   
		   System.out.println("Indian Movies");
	   }
	
       @AfterMethod
       public void Sleep() {
		   
		   System.out.println("Good Night");
	   }
	

}
