package Framework;

public class ExceptionHandling {

	public static void main(String[] args)throws Exception {
		
		try {
		
		int a = 10;
		int b = 5;
		
	
		//throw new Exception ("We cant divide by zero");
		
		
		int c = a/b;
		
		throw new Exception ("We cant divide by zero");
				
			
		
		//System.out.println("This line of statement will not execute");
		
		}
		
         catch (NullPointerException e) 
		
		{
		  System.out.println("Alternative code");
		
		}
		
		//When try block fails Then only catch will executed
		
        catch (Exception a) 
		
		{
        	 a.printStackTrace();  //Best method to print
        	
        	//System.out.println(a.toString());
        	
        	//System.out.println( a.getMessage());
        	
		  System.out.println("Ultimate Alternative code");
		
		  
		}	
		
		//Whether exception occurs or not finally will always be executed
		
		finally {
			
			System.out.println("Mandatory code : going for shopping");
			
			
		}
		
		
	}

}
