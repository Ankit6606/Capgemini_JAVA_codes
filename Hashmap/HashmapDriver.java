package Hashmap;

public class HashmapDriver {
	public static void main(String[] args) {
		HashMap hmap = new HashMap();
		hmap.put(1, "teacher");
		hmap.put(2, "student");
		hmap.put(3, "staff");
		hmap.put(12, "professor");
		hmap.put(3, "scholar");
		hmap.display();
		System.out.println(hmap.getValue(12));
		System.out.println(hmap.containsKey(13));
		System.out.println(hmap.size());
	}
}
