package Reflection;

public class Driver {
	public static void main(String[] args) throws ClassNotFoundException {
		//To create Class object
		//1st method
		Class<Person> c = Person.class;
		//2nd method
		@SuppressWarnings("unchecked")
		Class<Person> c2 = (Class<Person>) new Person("Ankit", 22).getClass();
		//3rd method
		@SuppressWarnings("unchecked")
		Class<Person> c3 = (Class<Person>) Class.forName("Reflection.Person");
	}
}
