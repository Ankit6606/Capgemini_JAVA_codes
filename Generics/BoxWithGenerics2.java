package Generics;

public class BoxWithGenerics2<T> {
	T num1;
	T num2;

	BoxWithGenerics2() {

	}

	BoxWithGenerics2(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

//	public static void add(T num1, T num2) {} // will throw error

	// next two methods are method overloading
	public static <T> void add(T num1, T num2) {
	} // work fine

	public static <T extends Number> void add(T num1, T num2) {  
	} // work fine

//	public static<T super Number> void add(T num1, T num2) {} // we can't use super like this

	public void sub(T num1, T num2) {
	} // work fine here but not with static because static methods can't use the
		// class's type parameter T directly. Static methods belong to the class, not to an
		// instance. But T is defined at the instance level (via the class).
	
	

//	public void add(T num1, T num2) {
//		System.out.println(num1 + num2); // num1+num2 will throw error as compiler doesnot know the type of T, it may be any
//											// object like custom object or others except wrapper class and String
//											// object which support + operator
//	}

	public static void main(String[] args) {
		BoxWithGenerics2<Integer> box = new BoxWithGenerics2<>(10, 20);
		System.out.println(box.num1 + box.num2); // it will work fine
	}

}
