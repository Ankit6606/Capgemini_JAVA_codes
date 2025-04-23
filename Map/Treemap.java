package Map;
import java.util.*;
public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "String");
		t.put(20, "Integer");
		t.put(3, "Null");
		t.put(5, "Number");
		t.put(3, "Char");//Updates the value of key-3 as "Char"
		t.put(4, "Double");
		Set<Integer> s = t.keySet();
		for(int key : s) {
			System.out.println(key+" "+t.get(key));
		}
	}
}
