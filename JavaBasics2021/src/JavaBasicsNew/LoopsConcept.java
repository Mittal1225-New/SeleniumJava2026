package JavaBasicsNew;

public class LoopsConcept {
	
	
	public static void main(String[] args) {
		
		
		int i[] = new int[5];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		
		System.out.println(i.length);  //5
		
		int h = i.length;
		
		for( int wheels = 0; wheels < h; wheels++) {
			System.out.println(i[wheels]);
		}
		
		for(int m : i) {
			System.out.println(m);
		}
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		//object array - can store various types of data
		
		Object ob[] = new Object[5];
		
		ob[0] = "Mittal";
		ob[1] = 30;
		ob[2] = 'F';
		ob[3] = 2.33;
		ob[4] = 50;
		
		
		for(Object a  :  ob) {
			System.out.println(a);
		}
	
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			

	}

}
