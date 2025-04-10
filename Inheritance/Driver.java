package Inheritance;

public class Driver {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.a);
		Dog dog = new Dog();
		Dog.methodOfParent2();	       
		dog.methodOfParent();
		System.out.println(Dog.y);
	}
}
