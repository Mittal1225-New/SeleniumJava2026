package TestNG;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hierarchy {
	
	
	
	/*
	 * invocationCount: Specifies how many times a test method should be invoked.
	 * invocationTimeOut: Specifies the maximum time (in milliseconds) allowed for
	 * all invocations of the test method to complete. Example: If a test method has
	 * invocationCount = 10 and invocationTimeOut = 900, the test will fail if all
	 * 10 invocations take longer than 900 milliseconds to complete.
	 */
	
	@BeforeSuite
	void wakeup()
	{
		System.out.println("Good morning hyderabad");
	}
	
	@Test (invocationCount = 5 ,invocationTimeOut=1)
	void testing()
	{
		System.out.println("Learning testing");
	}
	
	@Test(priority =1, invocationCount = 10,invocationTimeOut=1)
	void breakfast()
	{
		System.out.println("idli");
	}
	
	@Test(priority = 2)
	void ipl()
	{
		System.out.println("Entertainment");
	}
	
	@AfterSuite
	void slepping()
	{
	  System.out.println("Good night Hyderabad");
	}

}


