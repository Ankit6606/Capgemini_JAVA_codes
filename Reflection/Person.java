package Reflection;

public class Person {
	private String name;
	private int age;
	private Person() {
		System.out.println("No arguement constructor");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getDetails() {
		return name+"\t"+age;
	}
	private static void task(String task, int  age) {
		System.out.println("Doing the task: "+task +"\t"+ age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
