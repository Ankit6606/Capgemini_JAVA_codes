package Annotation;
@MyAnnotation(value = 10, value2 = "hi")
public class Driver {
	@MyAnnotation(value = 20, value2 = "hello")
	int age;
	
	@MyAnnotation
	String name;
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
