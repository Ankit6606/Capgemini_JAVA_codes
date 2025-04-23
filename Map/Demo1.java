package Map;

import java.util.HashMap; 
import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "krish");
		h.put(2, "Damon");
		h.put(3, "Klaus");
//		h.put(null, null);
		h.put(8,"hi");//overriding the previous null value
		h.put(3, "Stefan");
		h.putIfAbsent(20, "dkjbnfdn");
		System.out.println(h.containsKey(null));
		System.out.println(h.containsKey(100));
		System.out.println(h.containsValue("Damon"));
		System.out.println(h.get(100));
		System.out.println(h.getOrDefault(100, "Custom Null"));//If we don't want null from the get method we use the getordefault method
		//entryset
		Set<Map.Entry<Integer, String>> entry_set = h.entrySet();
		for(Map.Entry<Integer, String> e:entry_set) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
//		//keyset
		Set<Integer> key_set = h.keySet();
		for(int key : key_set) {
			System.out.println(key + " " + h.get(key));
		}
		System.out.println(h.values());
		
	}
}
