package JavaBasics;

public class DataTypes {
	
	public static void main(String[] args) {
		
	char c = 'a';
	char c1 = 'b';
	
	System.out.println(c+c1);  //195 
	

	System.out.println("Hello" + ('a'+'b'));  //Hello195
	
	System.out.println("Hello " + 'a'+'b');  // Hello ab
	
	
	
	
	//whenever we perform an arithmeitc operations on characters java will consider it's ascii key
	//Ascii key - is a standard value for each and every character which is already defined and used by operating system. it will be same for all the languages
	
	/** 
	 * In java String is a class that starts with upper class. It's not a data type. string is written in double quote in java
	 */
	
	/*
	 * if you want to highlight something in the form of error in the console
	  .out is a statics variable it will return println method
	  .err is also static variable available in the system class which will print something red color
	   when we handle some exception using try catch block we can user red color error for console
	 */
	
	 System.err.println ("some  error is coming");
	
	
}

	
}