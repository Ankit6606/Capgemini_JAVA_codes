package LinkedHashSet_CaseStudy;

import java.util.LinkedHashSet;

public class EmployeeDriver {
	public static void main(String[] args) {
		LinkedHashSet<Employee> l = new LinkedHashSet<>();
		l.add(new Employee(1,"Ankit","Software Developer",90000.90));
		l.add(new Employee(3,"Jiya","Software Tester",80000.90));
		l.add(new Employee(9,"Chiku","HR",50000.90));
		l.add(null);
		l.add(new Employee(7,"Madhu","Senior Analyst",110000.90));
		l.add(new Employee(5,"Jiku","Project Manager",260000.90));
		l.add(null);//This null will not be added in the HashSet, only 1 null is added
		for (Employee employee : l) {
			System.out.println(employee);//Employee objects are printed according to the insertion order 
		}
		
	}
}
