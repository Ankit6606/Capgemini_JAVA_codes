package Student_Hashset;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> h = new HashSet<Student>();
		h.add(new Student(100,"Ankit", 78.32));
		h.add(new Student(101,"Ankan", 98.32));
		h.add(new Student(107,"Ankita", 88.32));
		h.add(null);
		h.add(null);//Only 1 null is added to a hashset, no duplicates are allowed but the insertion order is maintained
		System.out.println(h);
	}
}
