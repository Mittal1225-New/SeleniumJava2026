package JavaBasics;

public class Functions {
	
	public static void main(String[] args) {
		
		
		/*main method is void in nature bcz it doesnt return any value*/
	
		//in order to access non-static method you needs to create an object
		//obj is object reference name - new Functions() is object name
		//After creating the object copy of all non-static mathods will be given to this object
		
		Functions obj = new Functions();
		
		obj.add();
		obj.sum();
		obj.printName();
		
		//for return value best practice is to store value in a variable and reuse it for other purpose for reusability
		//when you hover over on a method you can see return type
		
		String s = obj.fullName();
		System.out.println("fullname is " + s);
		
		int i = obj.addNumbers();
		System.out.println(i + 100);
		
		System.out.println(obj.addNumbers());
		
		
		//value we pass for parameters in called arguments as stated below (50 ,50 )
		int m = obj.getSum(50, 50);
		System.out.println(m);
		
		int h = obj.getSum(1000, 1000);
		System.out.println(h);
		
		
		//created another object and give copy of this method
		
		Functions obj1 = new Functions();
		obj1.fullName();
		System.out.println(100 + s);
		
		int k = obj1.addNumbers();
		System.out.println(k + 500);
		
		
		System.out.println(obj1.getSum(30 , 30));
		
		int aa = obj1.getSum(10 ,10);
		System.out.println(aa);
		
		String capname = obj1.getCapitalName("USA");
		System.out.println(capname);

		capname = obj1.getCapitalName("India");
		System.out.println(capname);
		
		int marks = obj1.getMarks("Dan");
	    System.out.println(marks);
	    
	    marks = obj1.getMarks("Cathy");
	    System.out.println(marks);
	    
	    if(obj1.launchBrowser("chrome")){
	    	System.out.println("start my test execution");
	    }else {
	    	System.out.println("sorry there is no browser... ");
	  
	    	
	    }
	    
	    
	}
	/* non-static method*/
	
	//we can not create method inside method - means fn inside fn cant be created
	//1. no Input and no return
	
	public void add() {
		System.out.println("add method");
	}
	
	public void sum() {
	   int	a = 10;
	   int b = 20;
		int c = a + b;
		System.out.println(c);
		
	}
	
	public void printName() {
		System.out.println("Sharad");
	}
	
	//2. No input and returns value 
	//function can return only one value return statement
	
    public String fullName() {
    	System.out.println("Print full name of a person");
    	
    	String fname = "Mittal";
    	String lname = "Gadhiya";
    	String name = fname + lname;
    	
    	return name;	
    	
    }
    
    public int addNumbers() {
    	System.out.println("add numbers");
    	int x = 100;
    	int y = 200;
    	int z = x + y;
    	
    	return z;
    }
    
    
    //3. some Input and some returns
    // passing input data is called parameters
    // value we pass for parameters in called arguments
    
    public int getSum( int a, int b) {
       System.out.println("print sum of numbers");
    
      int  sum = a + b;
      
      return sum;
       
     }  	
    
    /*
     * WAP to get the capital name of the country
     */
  
     public String getCapitalName(String countryName) {
    	 
    	 if(countryName.equals("India")) {
    		return "NewDelhi";
    	
    	 }else if(countryName.equals("USA")) {
    		 
    		 return "DC";
    	 
    	 }else if(countryName.equals("UK")) {
    		 return "London";
    	
    	 }else
    		 System.out.println("This country is not found " + countryName);
    	   return null;
    	 
     }	 
    	 
     /*
      * WAP where I will be passing a student name and then function should return the marks of that student
      */
     
     public int getMarks(String studentName) {
    	 
    	 int marks = 0;
    	 
         System.out.println("get marks for" + studentName);
         
         
         if(studentName.equals("Juli")) {
        	 marks = 90;
        	 
       } else if(studentName.equals("Sara")) {
    	   marks = 80;
    	   
    	   
       }else if(studentName.equals("Dan")) {
    	   marks = 70;
      
       }else {
    	   System.out.println("student not found " + studentName);
         return -1;
     
     }  
         
         return marks;
     
     }  
     
      /*
       * WAP where we will pass the browsername and launch the browser and return boolean
       */
     
        public boolean launchBrowser(String browserName) {
        	System.out.println("launching browser " + browserName);
        	boolean flag = false;
        	
         switch (browserName) {
		case "chrome":
		     System.out.println("launching chrome");
			 flag = true;
			break;
		case "firefox":
			System.out.println("launching firefox");
			flag = true;
			break;
		case "safari":
			System.out.println("launching safari");
			flag = true;
			break;	
			
		default:
			System.out.println("browser is not found: " + browserName);
			break;
		}
         
        	return flag;
        	
        	
        } 	
        	
}

