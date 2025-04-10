
package Comparable;

import java.util.*;
public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student(88,"Ankit",56.67);
		Student s2 = new Student(84,"Ankita",86.67);
		Student s3 = new Student(45,"Ankan",96.67);
		Student[] students = {s1, s2, s3};
		Arrays.sort(students);
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
 