package JavaBasics;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		obj.sum(30 , "Mittal");
		obj.sum(null, 0);   //default value of string is null and int 0
	
	
	}
	
	//Duplicate methods - same method name with same number of arguments are not allowed
	
	//Method Overloading : when the method name is same with different input parameters within same class
	
	
	public void sum() {
		System.out.println();
	}
	
	public void sum(int i) {
		System.out.println("one parameter");
	}
	
	public int sum(int a, int b) {
		System.out.println("2 parameter");
		System.out.println(a);
		
		return a;
	}
	
	public String sum(int j, String str) {
		System.out.println();
		
		return str;
    } 
    
	public void sum(String s, int b) {
		System.out.println();
	}
	
	
	
}