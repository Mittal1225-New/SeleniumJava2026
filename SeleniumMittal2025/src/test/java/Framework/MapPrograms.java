package Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrograms {

	public static void main(String[] args) {
		
		
		Map<String,Integer> s = new TreeMap<String,Integer>();
		
		s.put("AMittal", 123);
		s.put("Rishi", 456);
		s.put("Venkatesh", 7890);
		s.put("Hari", 7890);
		s.put("ABV", null);
		
		System.out.println(s);
		System.out.println(s.keySet());
		System.out.println(s.values());
		System.out.println(s.containsKey("Hari"));
		System.out.println(s.containsValue(456));
		System.out.println(s.get("Venkatesh"));

		for( Map.Entry<String,Integer> b : s.entrySet())
		{
			System.out.print(b.getKey() + " " + b.getValue() +", ");
		}
		
		
		
	}

}
