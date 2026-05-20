package TestNG;

import org.testng.annotations.Test;

public class TestNGBasics {
	
	@Test(priority = 3)
	public void chiranjeevi()
	{
		System.out.println("versatile hero");
	}
	@Test(priority = 2)
	public void balakrishna()
	{
		int a = 5 ;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}

}
