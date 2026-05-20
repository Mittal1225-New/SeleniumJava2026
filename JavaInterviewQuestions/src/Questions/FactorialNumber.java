package Questions;

public class FactorialNumber {
	
	
	/* Fact of 3 = 3 * 2 * 1 = 6
	 * 4 = 4 * 3 * 2 * 1 = 24
	 * 5 = 5 * 4 * 3 * 2 *1
	 * 10 = 
	 * 1 = 1
	 * fact(0) = 1
	 * 
	 */
	
	
	// Without Recursive - use for loop
	
	public static int factorial(int num) {
		int fact = 1;
		if(num==0)
			return 1;
		for(int i =1; i <=num; i++) {
			fact=fact*i;
		}
		
		return fact;
	}
	
	
	//with Recursive function: a function is calling itself
	
	public static int fact(int num) {
		if(num==0)
			return 1;
		
		else return (num* fact(num-1));
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		System.out.println(factorial(1));
	    System.out.println(factorial(0));
	    
	    System.out.println(fact(10));
	    System.out.println(fact(1));
	    System.out.println(fact(0));
	    
	

	}

}
