
package JavaBasics;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
	   //whenever we run any program in java it's JVM responsibility to execute the code
	   //whenever we say JVM to execute any class it will check whether main method is there or not. it will not execute without main method.
		
		//diff between compiling code and running code.
		
		double c = 12.33;
		double d = 23.33;
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Testing";
		
		System.out.println(a+b);
		System.out.println(c+d);
		
		System.out.println(x+y);
		
		//JVM will always start to execute from left to right
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);//HelloTesting100200
		
		System.out.println(x+y+(a+b)); // HelloTesting300
		
		System.out.println(x+y+c+d+a+b);
		
		System.out.println("the value of a is: " +a);
		System.out.println("the value of b is: " +b);
		System.out.println("the sum of a and b is: " + (a+b));
		
		System.out.println(c+d+(x+y)+a+b);
		System.out.println(c+d+x+y+(a+b));


		int i = 4/2;
		System.out.println(i); //2
		System.out.println(4/2); //2 - you can write either way 
		System.out.println(5/2);//2.5 --> 2 - this will give integer bcz there in integer value is given
		System.out.println(5.0/2);//2.5
		System.out.println(5/2.0);//2.5
		System.out.println(5.0/2.0);//2.5
		
		//float k =  (float) (9/2.0);
		
		//int k1 = 9/2.0;   - Type mismatch bcz it will return double and define as int variable
		
		//float m = (9/2.0)f; - Type mismatch
		
		float k4 = (float) (9/2.0);
		
		float k3 = 9/2.0f; //4.5
		
		double k2 = 9/2.0;
		System.out.println(k2);
		
      	int p = 9/0; //java.lang.ArithmeticException: / by zero  - in java there is no infinite whereas in jS it will give infinity
     	System.out.println(p);
     	
     	int h = 0/0; //java.lang.ArithmeticException: / by zero  
     	System.out.println(p);
     	
		
		int m = 0/100;   
		System.out.println(m); //0
		

	
		
		
		
	}

}
