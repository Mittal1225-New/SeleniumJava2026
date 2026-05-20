package JavaBasics;

public class ArrayConcept {
	
	
	public static void main(String[] args) {
		
	
		/*
		 * Array - to store similar data type value in a array variable
		 * 
		 * //2 major limitations of array
		 * 
		 * 1.static array --> fixed size -- to overcome this issue we use dynamic array (ArrayList),Hashtable,
		 * 2. it stores only similar types of data -- to overcome this issue we use object array
		 * 
		 */
		

		// For array lowest index is 0
		// Highest index is length -1
		
		
		int i[] = new int[4];
		
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		//i[4]=500; //Array Index Out of bound exception
		
		
		
		System.out.println("li = " + 0);  //lowest index 0
		System.out.println(i.length); //4 - size /lenght of array
		System.out.println("hi = " + (i.length -1)); //highest index is length -1
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]); //ArrayIndexOutOfBoundsException
		
		
		int h = i.length; //4
		
		//To print all the values from array use for loop
		
		for(int m = 0; m<h ; m++) {
			System.out.println(i[m]);
		}
		
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		//for each loop
		for(Integer k : i) {
			System.out.println(k);
		}
		
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		
		//2. double array
		
		double d[] = new double[2];
		
		d[0] = 12.22;
		d[1] = 12.44;
		
		System.out.println(d.length);
		
		
		double x = d.length;
				
	    for (int a = 0; a < x; a++) {
	    	System.out.println(d[a]);
	    }
	    
	    for (double x1 : d) {
	    	System.out.println(x1);
	    }
	    
	  //char array
	    
	    char c[] = new char[3];
	    

		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
	    
	    
	   //string array
	    
	    String student[]= new String[5];
	    
	    student[0] = "TOM";
	    student[1] = "Maritn";
	    student[2] = "Mittal";
	    student[3] = "Gadhiya";
	    student[4] = "Hitesh";
	    
	    System.out.println(student.length);
	    
	    int b = student.length;
	    
	    for (int m =0; m<b; m++ ) {
	    	System.out.println(student[m]);
	    }
	    
	    for (String R : student) {
	    	System.out.println(R);
	    }
	   
	    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
	    
	    //Object static array - can store different types of data
	    //Object is a class - Super class of all the class in java
	    
	    
	    
	    Object b1[] = new Object[5];
	    
	    b1[0] = "Hitesh";
	    b1[1] = 15;
	    b1[2] = 'A';
	    b1[3] = 12.33;
	    b1[4] = true;
	    
	    System.out.println(b1[1]);
	    
	    for (int p = 0; p<b1.length ; p++) {
	    	System.out.println(b1[p]);
	    }
	    
	    
	    for (Object O : b1) {
	    	System.out.println(O);
	    }
	   
	  
	    
	    
	    
	}
	
	
	
	
	
	

}
