package PersonStudent;

public class Student extends Person {
	private int studentId;
	private String name;
	private int age;
	Student(){
		System.out.println("Student class called");
	}
	Student(int studentId, String name, int age){
		super(name, age);
		this.studentId = studentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	void displayStudentDetails() {
		super.displayParentDetails();
		System.out.println(this.studentId);
	}
}
