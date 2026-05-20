package JavaBasicsNew;

public class IfElseCondition {

	
	public static void main(String[] args) {

	
	int x = 10;
	int y = 20;
	
	
	System.out.println(x>y);  //false
	
	if(x>y) {
		System.out.println("x is greater");
	}else {
		System.out.println("y is greater");
	}
	
	
	//Example od Dead code - it gives you warning of dead code
	if(true) {
		System.out.println("Hi");
	}else {       //Dead code - unreachable code - it will never come to else part because if condition is always true
		System.out.println("Bye");
	}
		
	
	//Arithmetic Operators  :  + - X /
	
	//comparison operator : ==, > =, <= , !=
	
	
	int a = 100;
	int b = 200;
	
	if(a == b) {
		System.out.println("a and b both are same");
	}else {
		System.out.println("a and b both are not same");
	}
	
	String s = "Hello world";
	String s1 = "Hello Testing";
	
	if(s == s1) {
		System.out.println("both are same");
	}else {
		System.out.println("Both are not same");
	}
	
    if(s.equals(s1)) {
    	System.out.println("s equals s1");
    }else if (s.equalsIgnoreCase(s1)) {
    	System.out.println("s not equals s1");
    }else {
    	System.out.println("wrong");
    }
    
    if(s.equalsIgnoreCase(s1)) {
    	System.out.println("s equals s1");
    }else if (s.equalsIgnoreCase(s1)) {
    	System.out.println("s not equals s1");
    }else {
    	System.out.println("wrong");
    }
    
   //WAP to print highest number
    
    
    int c = 600;
    int d = 500;
    int e = 300;
    
    if(c>d && c>e) {
    	System.out.println("c is greater");
    }else if(d>e) {
    	System.out.println("d is greater");
    }else {
    	System.out.println("e is greater");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

}