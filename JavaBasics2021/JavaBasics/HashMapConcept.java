package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	
	
	public static void main(String[]args) {
		
		
		//collection - dynamic 
		//stores the values : key - value pair
		//can have only one null key
		//can have any number of null values
		
		
		//import Map and Hashmap from java.util
		
		Map<String,String> EmpMap = new HashMap<String, String>();
		
		EmpMap.put("name", "Tom");
		EmpMap.put("ID", "101");
		EmpMap.put("city", "Columbus");
		EmpMap.put("Country", "USA");
		EmpMap.put(null, "1000");
		EmpMap.put(null, "2000");
		EmpMap.put("age", null);
		EmpMap.put("phone", null);
		
		EmpMap.remove("age");
		
		
		System.out.println(EmpMap.get("name"));
		System.out.println(EmpMap.get("city"));
		
		System.out.println(EmpMap.get("salary"));  //null bcz salary key and value is not given
		
		System.out.println(EmpMap.get(null)); //2000 - for null values it will get latest value
		
		System.out.println(EmpMap.get("age"));
		
	
		
		
		//entrySet: to fetch all keys-values
		
		for(Map.Entry<String, String> entry : EmpMap.entrySet()){
			System.out.println("key = " + entry.getKey() + "value = " + entry.getValue());
		}
		
		System.out.println("++++++++++++++++++");
		
		//keySet(): for getting the keys:
				
		for(String s : EmpMap.keySet()) {
					
		System.out.println("key = " + s);
				}
				
		System.out.println("----");

				
		 //values(): for getting the values:
		
		 for(String v : EmpMap.values()) {
		 System.out.println("value = " + v);
				}
		System.out.println("----");

				
		 //Lambda:
		 EmpMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
				
				
				
			}
		
		
	}


