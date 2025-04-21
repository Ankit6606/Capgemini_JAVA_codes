package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Comparator;
import java.lang.Comparable;

public class Employees {
	static ArrayList<Employee> emp_list = new ArrayList<Employee>();
	
	public static void addEmployee(Employee emp) {
		emp_list.add(emp);
		System.out.println("Employee added succesfully......");
	}
	
	public static void printAllEmployees() {
//		for(Employee e : list_of_Emp) {
//			System.out.println(e);
//		}
		//Using iterator
		Iterator<Employee> itr = emp_list.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);
		}
		
		//Using List iterator(prints in reverse order)
//		ListIterator<Employee> list_itr = emp_list.listIterator(emp_list.size());//emp_list.size() points at the last index, so iteration will start from the end
//		while(list_itr.hasPrevious()) {
//			Employee emp = list_itr.previous();//printing from the last by iterating the previous index
//			System.out.println(emp);
//		}
	}
	
	public static boolean search(Employee e) {
		if(emp_list.contains(e))
			return true;
		return false;
	}
	
	public static boolean searchById(int id) {
		Iterator<Employee> itr = emp_list.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(id == emp.getId()) {
				return true;
			}
		}
		return false;
	}
	
	public static void remove(Employee emp) {
		emp_list.remove(emp);
		System.err.println("Deleted");
	}
	
	public static boolean removeById(int id) {
//		emp_list.remove(id);
		Iterator<Employee> itr = emp_list.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(id == emp.getId()) {
				emp_list.remove(emp);
				return true;
			}		
		}
		return false;
	}
//	private static Employee idFound(int id) {
//		for(Employee e: emp_list) {
//			if(e.getId() == id) {
//				return e;
//			}
//		}
//		return null;
//	}
	public static void updateById(int id, String name, double salary) {
		for(Employee e: emp_list) {
			if(e.getId() == id) {
				e.setName(name);
				e.setSalary(salary);
				System.out.println("Updated successfully");
				break;
			}
		}
	}
	
	
	//By ID
	public static void sort() {
		ArrayList<Employee> temp = emp_list;
		Collections.sort(temp);
		System.out.println("Employee list is sorted(default by id)");
	}
	
	
	//By salary
	static class SortBySalary implements Comparator<Employee> {
		@Override
		public int compare(Employee e1, Employee e2) {
			return Double.compare(e1.getSalary(), e2.getSalary());
		}
	}
	
	public static void sortbysalary() {
//		Collections.sort(emp_list, sid);
		emp_list.sort(new SortBySalary());
		System.out.println("Employee list sorted(by salary)");
	}
	
	
	//By name
	static class SortByName implements Comparator<Employee> {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	}
	
	public static void sortbyname() {
		Collections.sort(emp_list, new SortByName());
		System.out.println("Employee list sorted(by name)");
	}
}
