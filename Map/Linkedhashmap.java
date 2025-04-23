package Map;
import java.util.*;
public class Linkedhashmap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lh = new LinkedHashMap<>();
		lh.put(1, "Ankit");
		lh.put(2, "Jiya");
		lh.put(2, "Madhu");
		lh.put(5, null);
		lh.put(6, null);
		lh.put(7, null);
		Set<Integer> l = lh.keySet();
		for (int integer : l) {
			System.out.println(integer+" "+lh.get(integer));
		}
	}
}
