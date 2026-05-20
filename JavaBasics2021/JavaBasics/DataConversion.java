package JavaBasics;

public class DataConversion {
	
	
public static void main(String[] args) {

		
	//Wrapper class
		//String to int:
		String x = "100";
		
		System.out.println(x+20);//10020
		
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);//120
		
		String amount =  "1000";
		
		
		/*Integer,boolean, double*/
		
		
		//String to double:
		String y = "34.55";
		System.out.println(y+20);
		double d = Double.parseDouble(y); //34.55
		System.out.println(d+20);
		
		//String to boolean
		String m = "true";
		boolean b = Boolean.parseBoolean(m);
		System.out.println(b);
		
		
		//int to String:
		int k = 100;
		System.out.println(k+20);
		
		String s = String.valueOf(k); // "100"
		System.out.println(s+20);
		
		String h = "100A";
//		int p = Integer.parseInt(h);//NumberFormatException  - for input string "100A"
//		System.out.println(p+20);
		
		
	}

}
