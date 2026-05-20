 package JavaBasics;

public class Loops {
	
	
	public static void main(String[] args) {
		
		
		//while loop
		//disadvantage   ; it will generate infinite loop if you dont give incremental/decremental part
		
		
		int i = 1;    //initialization
		while (i <=10) {   //conditional
			System.out.println(i); 
			
			i++; //incremental/decremental
		
		}
	
		System.out.println("XXXXXXXXXXXXXXXXXXXXX");
		
		//for loop
		
		for (i = 0; i <=20 ; i++) {   //initialization, conditional, incremental
			System.out.println(i);

		}
		
		for (int p = 1; p <=10;) {
			System.out.println(p);
			//p++;
			p=p+1;
			
		}
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXX");
		
		//print 10 to 1 
		//K-- same as K = K-1
		
		for(int k = 10; k >= 1; k--) {  ////initialization, conditional, decremental
			System.out.println(k);
		}
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXX");
		
		
		//print 10 to 0 and 0 to -10
		
		for(int k = 10; k >= - 1; k--) {
					System.out.println(k);
				}
				
		
		//interview q - Blank for loop - when you dont give any condition
		
		
		/*for (; ;) {
			System.out.println("welcome to Taz hotel"); //generate infinite loop bcz no condition is given and it will always take true
		}
		
		*/
		
		
		//even numbers - 0.2,4,6,8
				for (int m = 0; m <=10; m=m+2){
					System.out.println(m);
				}
				
		//odd numbers - 1,3,5,7
				for (int m = 1; m <=10; m=m+2){
					System.out.println(m);
				}
				
		System.out.println("XXXXXXXXXXXXXXXXXXXXX");
				
	//Print characters a to z
				
				
	    for(char c = 'a'; c < 'z'; c++) {
	    	System.out.println(c);
	    }
			
	    
	    System.out.println("XXXXXXXXXXXXXXXXXXXXX");   
	    
	    
	    for(byte b = 1; b<=5; b++) {
	    	System.out.println(b);
	    }
		
	    System.out.println("XXXXXXXXXXXXXXXXXXXXX"); 
	    
	    for(String str = "Hello"; str.equals("Hello");) {  //infinite loop
	    	System.out.println(str);
	    }
	    
	    System.out.println("XXXXXXXXXXXXXXXXXXXXX");
	    
		
	    for (int h = 1; h <= 100; h++) {
			System.out.println(h);
			if(h % 5 == 0) {
				System.out.println("hiiii");
			}
	
   }
		
					
	
	  // public static void main(String[] args) { // for(int n=1;n<=10;n++) { //
	  for(String st="hello";st.equals("hello");){ // System.out.println(n+" "+st);
	  // break; // } // } // } // }
	 
		
	  }	
		
			
	}

}
