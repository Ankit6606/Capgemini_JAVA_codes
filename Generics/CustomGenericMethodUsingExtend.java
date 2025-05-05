package Generics;

public class CustomGenericMethodUsingExtend { // if we want to add restriction in generic by extending...
	
//	public static<T> void print(BoxWithGenerics<T extends Number> box) { // it is syntactically wrong
//		T value = box.getValue(); 
//		System.out.println(value);
//	}
	
//	public static<T extends Number> void print(BoxWithGenerics<T> box) { // we can add restriction here, like this
//		T value = box.getValue(); 
//		System.out.println(value);
//	}
	
	public static void print(BoxWithGenerics<? extends Number> box) { // or we can use wildcards
		System.out.println(box.getValue());
	}
	
	
	public static void main(String[] args) { // it will support Number and child of Number class
		BoxWithGenerics<Integer> box1 = new BoxWithGenerics<>(125);
		print(box1); 
		
		BoxWithGenerics<Double> box2 = new BoxWithGenerics<>(12.5);
		print(box2); 
		
		BoxWithGenerics<Number> box3 = new BoxWithGenerics<>(125);
		print(box3); 
		
//		BoxWithGenerics<String> box4 = new BoxWithGenerics<>("Hello");
//		print(box4);  // compile time error
		
//		BoxWithGenerics<Object> box5 = new BoxWithGenerics<>(12.35);
//		print(box5);  // compile time error
	}
	
}
