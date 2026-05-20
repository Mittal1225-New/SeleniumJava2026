package Framework;

public class ThrowsException {

	
		
	    public static void main(String[] args) {
            try{
            validate(20);
            } catch(Exception e){
                e.printStackTrace();
                System.out.println("Exception occur ");
            }
            }
        
        
        public static void validate(int age) throws Exception{
            if(age < 18){
                throw new Exception("Mittal is not eligible for vote");
            }
            else{
                System.out.println("Eligible");
            }
        }
	}


