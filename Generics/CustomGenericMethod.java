package Generics;

public class CustomGenericMethod {  //generic method which accepts a custom class
	
//	static public void print(BoxWithGenerics box) { 
//		int value = (int)box.getValue(); // if we try to access value like this...it will throw ClassCastException...to avoid that we should know which datatype is initialized as generic
//		System.out.println(value);
//	}
//	public static void main(String[] args) {
//		BoxWithGenerics<Double> box = new BoxWithGenerics<>(12.5);
//		print(box);
//	}
	
	
	
//	static public void print(BoxWithGenerics<Integer> box) { //we cannot mention different datatype later
//		int value = (int)box.getValue(); 
//		System.out.println(value);
//	}
//	public static void main(String[] args) {
//		BoxWithGenerics<Double> box = new BoxWithGenerics<>(12.5);
//		print(box); //will throw compile time error
//	}
	
	
	
	public static<T> void print(BoxWithGenerics<T> box) { //this will work fine
		T value = box.getValue(); 
		System.out.println(value);
	}
	public static void main(String[] args) {
		BoxWithGenerics<Integer> box1 = new BoxWithGenerics<>(125);
		print(box1); 
		
		BoxWithGenerics<Double> box2 = new BoxWithGenerics<>(12.5);
		print(box2); 
	}

}
