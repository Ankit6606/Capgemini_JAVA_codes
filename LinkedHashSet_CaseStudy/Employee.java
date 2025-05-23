package LinkedHashSet_CaseStudy;


public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
	Employee(int id, String name, String department, double salary){
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee[id: "+this.id+", name: "+this.name+", department: "+this.department+", salary: "+this.salary+"]\n";
	}

}
