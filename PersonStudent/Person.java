
package PersonStudent;

public class Person {
	private String name;
	private int age;
	Person(){
		System.out.println("Person class called");
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void displayParentDetails() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
