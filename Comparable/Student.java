
package Comparable;
import java.lang.*;
public class Student implements Comparable<Student> {
	int rollno;
	String name;
	double percentage;
	
	public Student(int rollno, String name, double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return rollno+"\t"+name+"\t"+percentage;
	}
	@Override
	public int compareTo(Student s) {
//		Student s = (Student)o;
		return Double.compare(s.percentage, this.percentage);
	}
}
 