package JavaBasicsNew;

public class DataTypes {
	
	
	//without  main method you can't execute your java code.
	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 500;
		b = 300;
		
		String x = "Hello";
		String y = "World";
		
		//String concatenation: + concatenation operator
		System.out.println(a + b);
		System.out.println(x + y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y);
		
		System.out.println("The value of a is:" + a);
		System.out.println("the addition of a and b is:" + (a + b));
		
		//println is used to print on the console in new line
		//print - is used to just print on the console
		System.out.print("Hello selenium");
        System.out.println("hello Testing");
		
		//you can store int value in double but can not store double to integer
		double c = 50; 
		double d = 12.33;
		
		
		System.out.println(a);
        System.out.println(c);  //  50.0
        
        
        //String is a class, it's not a data type
       
        String s = "Mittal";
        
        /**
         * char mean any alphabet,number or special character,
         * But it should be just single digit value and should write in single quote
         * you can take space also
         * 
         */
        
        //whenever we perform arithmetic operations on charactes it will consider it's ascii value
        char e = 'a';
        char f = 'b';
        char value = '2';
        char g = '&';
        
        System.out.println(e + f);  //195
        
        boolean flag = true;
        boolean size = false;
        
        System.out.println("XXXXXXXXXXXXXXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
	}

	
	}


