package Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsProgram {

	public static void main(String[] args) {
	
		List <Integer> s = new ArrayList<Integer>();

		s.add(100);
		s.add(2);
		s.add(3);
		
		System.out.println(s);
		
	    Collections.sort(s);
		
		System.out.println(s);
		
	}

}
