package Employeemanagementsystem_streamapi;
import java.util.*;
import java.util.stream.Collectors;
public class Driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		//Prints all the employees
		empList.forEach(System.out::println);
		//Employees grouped according to city
		System.out.println("Grouping by City:");
		Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		for (String city : map.keySet()) {
			System.out.println(city+"\n"+map.get(city));
		}
		//Employees grouped according to their age
		System.out.println("Grouping by Age:");
		Map<Integer, List<Employee>> mapAge =  empList.stream().collect(Collectors.groupingBy(Employee::getAge));
		for (int age : mapAge.keySet()) {
			System.out.println(age+"\n"+mapAge.get(age));
		}
		//Prints the number of Departments
		List<String> resDept = empList.stream().map(Employee::getDeptName).distinct().toList();
		System.out.println(resDept);
		//Prints the employees whose age is greater than 28
		List<Employee> resAge = empList.stream().filter(e->e.getAge()>28).toList();
		System.out.println(resAge);
		//Prints the employee with highest age
		Employee maxAge = empList.stream().max((e1, e2)->e1.getAge()-e2.getAge()).get();
		System.out.println(maxAge);
		//Prints the youngest female employee
		Employee femaleyoungest = empList.stream().filter(e->e.getGender()=="F").min((e1, e2)->e1.getAge()-e2.getAge()).get();
		System.out.println(femaleyoungest);
		//Find the employees whose age is greater than 25 and less than 30
		System.out.println(empList.stream().filter(e->e.getAge()>25&&e.getAge()<30).toList());
		//Find all employees from HR department
		System.out.println(empList.stream().filter(e->e.getDeptName().equals("HR")).toList());
		//Find all the employees who lives in Bangalore city, sort them by their name and print their names
		System.out.println(empList.stream().filter(e->e.getCity().equals("Blore")).sorted((e1,e2)->e1.getName().compareTo(e2.getName())).toList());
		//Total no of employees in the organization
		System.out.println(empList.size());
		//Sort employees based on age
		System.out.println(empList.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).toList());
		//Find the most experienced employee in the organization
		System.out.println(empList.stream().min((e1, e2)->e1.getYearOfJoining()-e2.getYearOfJoining()).get());
		//find the highest salary in the organization
		System.out.println(empList.stream().max((e1,e2)->Long.compare(e1.getSalary(), e2.getSalary())).get());
	}
}
