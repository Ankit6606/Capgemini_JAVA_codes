package EmployeeManagementSystem;

import java.util.Scanner;

import EmployeeManagementSystem.Employees.SortBySalary;

public class EmpployeeManagementSysttemDriver {
	private static Employee createEmployeeObject(Scanner sc) {
		System.out.println("Enter Id, Name, Salary");
		Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		return emp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Welcome------");
		while(true) {
			System.out.println("1.Add Employee\n2.Print all Employee\n3.Search Employee\n4.Search Employee by Id\n5.Delete Employee\n6.Delete Employee by Id\n7.Update Employee by Id\n8.Sort Employee based on Id");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				Employee emp = createEmployeeObject(sc);
				Employees.addEmployee(emp);
				break;
			}
			case 2:{
				Employees.printAllEmployees();
				break;
			}
			case 3:{
				Employee emp = createEmployeeObject(sc);
				boolean result = Employees.search(emp);
				if(result)
					System.out.println("Employee is found");
				else
					System.out.println("Employee is not found");
				break;
			}
			case 4:{
				System.out.println("Enter id");
				int id = sc.nextInt();
				boolean result = Employees.searchById(id);
				if(result)
					System.out.println("Employee is found");
				else
					System.out.println("Employee is not found");
				break;
			}
			case 5:{
				Employee emp = createEmployeeObject(sc);
				Employees.remove(emp);
				break;
			}
			case 6:{
				System.out.println("Enter id");
				int id = sc.nextInt();
				boolean result = Employees.removeById(id);
				if(result) {
					System.out.println("Deleted");
				}else {
					System.out.println("Employee not found");
				}
				break;
			}
			case 7:{
				System.out.println("Enter id to update");
				int id = sc.nextInt();
				if(Employees.searchById(id)) {
					System.out.println("Enter updated name");
					String name = sc.next();
					System.out.println("Enter updated salary");
					double salary = sc.nextDouble();
					Employees.updateById(id, name, salary);
				}else {
					System.out.println("Employee not found");
				}
				break;
			}
			case 8:{
				Employees.sort();
				Employees.sortbysalary();
				Employees.sortbyname();
				Employees.printAllEmployees();
				break;
			}
			default:
				System.exit(0);
			}
		}
		
	}
}
