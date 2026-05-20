package Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrograms {

	public static void main(String[] args) {
		
		Set <Integer> s = new TreeSet<Integer>();
		
		System.out.println(s.isEmpty());
		
		s.add(1);
		s.add(100);
		s.add(2);
		s.add(44);
		s.add(4);
		s.add(5);
		s.add(50);
		s.add(25);
		s.add(2);
		//s.add(null);
		
		s.remove(44);
		
		
		System.out.println(s);
		
		for(Integer a: s) {
		
		System.out.println(a);
		
		
		
		
		
	}
		
	}
	
	
}


