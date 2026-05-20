package JavaBasics;

public class ConditionalOperatorsIFElse {
	
	
	public static void main(String[] args) {
			
		int a = 10;
		int b = 20;
		
		if (a  > b) {
			System.out.println("a is greater than b");

		} else {
			
			System.out.println("a is less than b");
		}
		
		/*We use the usual mathematical operators to evaluate a condition:

			Less than - a < b
			Less than or equal to - a <= b
			Greater than - a > b
			Greater than or equal to - a >= b
			Equal to - a == b
			Not Equal to - a != b
			
			We can either use one condition or multiple conditions, but the result should always be a boolean.

			When using multiple conditions, we use the logical AND && and logical OR || operators.
		*/
		
	
		
		//Dead code means - unreachable code in java. It will be never executed. it's not an error but it givens you a warning
		//When you deliberately write true or false it's called dead code bcz it will never go to next line
		
		//Note: The condition inside the parentheses must be a boolean expression. That is, the result of the expression must either evaluate to true or false.
		
		if (true) {
			System.out.println("This is Hitesh");
		} else {
		System.out.println("This is not Hitesh");
		}

	
		int total = 100;  // = is an assignment operator.whenever you use = operstor memory allocation will happen in java
		int fee = 200; {
		
		if ( total == fee) {  // == is a comparison oparator. it's use to compare primitive data types, not to compare strings ( int, double, byte, short)
			System.out.println("both are same");
		}else {
			System.out.println("Both are not same");
		}

		
		//in ordeer to compare string operator need to use below methods
		
	String s = "Hello";
	String s1 = "Hello";
	
	
	if (s.equals(s1)) {
		System.out.println("both are equal");
	}else {
		System.out.println("both are not equal");
	}

			
		String m = "Hello";
		String m1 = "hello";
		
		
		if (m.equalsIgnoreCase(m1)) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}

				
			
		//Arithmetic operators >  <  >=  <= == != 
	
	int balance = 100; 
	
	if (balance != 100 ) {
		System.out.println("bal is not correct");
	}else {
		System.out.println("FAIL");
	}
	
	
	int c = 2000;
	int d = 2000;
	
	if ( c >= d) {
			System.out.println("PASS");
		}
	}
		
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	
	//Boundary value analysis
	
	int marks = 201; 
	
	if (marks >= 199) {
		if ( marks <= 200) {
			System.out.println("PASS");
		
		}else {
			System.out.println("FAIL");
		
		
		}
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");	
		
	int points = 201; 
		
    if (points >= 199) {
			if ( points <= 200) {
				System.out.println("PASS");
			
			}else {
				System.out.println("Wrong marks");
			}
         }  else {
				System.out.println("FAIL");
			}
			
			}	
		
	
	//WAP to print the highest where three different numbers are given
		
		int x= 600;
		int y = 1000;
		int z = 700;
		
		//&& - AND operator --> called short circuit operator
		// OR - ||
		
		if (x>y && y>z) {
			System.out.println("X is greater");
		
		}else if (y>z) {
			System.out.println("y is greater");
			
		}else {
			System.out.println("z is greater");
		}
		
		//** if else statements**
		
		/* 1. Only if else*/
		
		
		//WAP to check the browser value and then launch the respective browser
		
		
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if(browser.equals("IE")) {
			System.out.println("launch IE");
		
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		
		}else {
			System.out.println("Please pass the correct browser name");
		}
		
		
		
		/*2  ***if-elseif-else*******/
		
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
			
		}else if(browser.equals("IE")) {
			System.out.println("launch IE");
			
		}else if(browser.equals("Firefox")) {
			System.out.println("launch Firefox");
		
		}else if(browser.equals("safari")) {
			System.out.println("launch safari");
		
		}	else {
			System.out.println("please pass the correct browser name");
		
		
		}
		
		
		/*3. switch case*/
		
		//switch  - ctrl + space enter
	    //break can be used only with switch and loop. Break can not be used with if elsecatch(Exception e){
		
		System.out.println("Try next time");
		
		
	
		
	
		
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome browser");
			break;
		case "Firefox":
			System.out.println("launch firefox");
            break;
		case "IE":
			System.out.println("launch IE");
		case "safari":
			System.out.println("launch safari");	
		default:
			System.out.println("Please pass correct browser name");
			break;
		}

		
	
}
	


}

