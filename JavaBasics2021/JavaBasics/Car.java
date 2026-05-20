  package JavaBasics;

public class Car {
	
	
	//Object and class
	//Class or Global variable define outside of method under class. inorder to access global variable needs to create an object 
	
	
	String name;
	int wheels;
	String color;
	int model;

	public static void main(String[] args) {
		
		
		int a = 10; //local variables created inside method- it will be stored in stack memory
		
		//create an object using new keyword
		//new Car() is an object 
		//C1 ia an object reference variables
		
		
		
		Car c1 = new Car();
		c1.name = "Accura";
		c1.wheels = 4;
		c1.color = "grey";
		c1.model = 2014;
		
		System.out.println(c1.name);
		
		System.out.println(c1.name + " " + c1.wheels + " " + c1.color + " " + c1.model);
		
		Car c2 = new Car();
		c2.color = "white";
		c2.wheels = 8;
		c2.model = 2020;
		c2.name = "Honda";
		
		System.out.println(c2.name + " " + c2.wheels + " " + c2.color + " " + c2.model);
		
		Car c3 = new Car();
		c3.color = "Red";
		c3.wheels = 10;
		c3.model = 2021;
		c3.name = "Nissan";
		
		System.out.println(c3.name + " " + c3.wheels + " " + c3.color + " " + c3.model);
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		System.out.println(c1.name + " " + c1.wheels + " " + c1.color + " " + c1.model);
		System.out.println(c2.name + " " + c2.wheels + " " + c2.color + " " + c2.model);
		System.out.println(c3.name + " " + c3.wheels + " " + c3.color + " " + c3.model);
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		//Interview q -- can we change object reference - yes 
		
		c1 = c2;
		
		System.out.println(c1.name + " " + c1.wheels + " " + c1.color + " " + c1.model);
		System.out.println(c2.name + " " + c2.wheels + " " + c2.color + " " + c2.model);
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		c2 = c3;
		
		System.out.println(c2.name + " " + c2.wheels + " " + c2.color + " " + c2.model);
		System.out.println(c3.name + " " + c3.wheels + " " + c3.color + " " + c3.model);
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		c3 = c1;
		
		System.out.println(c1.name + " " + c1.wheels + " " + c1.color + " " + c1.model);
		System.out.println(c3.name + " " + c3.wheels + " " + c3.color + " " + c3.model);
		System.out.println();
		
	
		
		new Car(); //no object reference - everytime new object reference will be created inside heap memory that takes unnecessary space results in performance issue, slow down system
		
		new Car().name = "Mazda";
		new Car().color = "silver";
		
		
		/**
		 * gc will be only for heap memory. gc will come into the picture when heap memory is full
		 * 
		 */
		
		System.gc(); //will destroy objects which has no reference name as well as null object reference
		
		//null object reference
		
		Car c4 = new Car();
		c4.name = null;
		c4 = null;
		
		
		
		
	}

}
