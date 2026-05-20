package Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLIstProgram {

	public static void main(String[] args) {
		
		
		/*List s = new ArrayList();
		
		System.out.println(s);
		
		//Create or insert Data.We use add method.
		//List will store heterogenous data ( Means diff data like int, string, char, boolean)
		
		/*
		
		s.add(1);
		s.add("Mittal");
		s.add('M');
		s.add(true)
		
		System.out.println(s);
		
		*/
		
		//Homogenous Data. 
		//Can store duplicates, null, and follow insertion order
		
		List < Integer> s = new LinkedList<Integer>();
	   
		//List < Integer> s = new ArrayList<Integer>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(3);
		s.add(null);
		
		//To update the data we use set method
		
		s.set(4, 10);
		
		s.set(3, 4);
		
		s.add(30);
		s.add(40);
		
		//we use remove method if you want to remove or delete data
		
		s.remove(0);  //removing data based on index number
		
		
		System.out.println(s.remove(2));
		
		// Purpose of contaisn method whether data is there or not in list.it will give true or false 
		//s.contains(2);
		
		System.out.println(s.contains(20));
		
		 
		//Printing the ways of List. To etrieve all the data in the list
		
		System.out.println(s);
		
		//if you want to retrive only specific data we use get method
		
		System.out.println(s.get(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
