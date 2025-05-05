package Generics;

public class CustomGenericMethodUsingSuper_Wildcard1 { // if we want to add restriction in generic by using super...

//	public static<T> void print(BoxWithGenerics<T super Number> box) { // it is syntactically wrong way
//		T value = box.getValue(); 
//		System.out.println(value);
//	}

//	public static <T super Number> void print(BoxWithGenerics<T> box) { // we can't use super with T parameter, only with wildcards
//		T value = box.getValue();
//		System.out.println(value);
//	}

	public static void print(BoxWithGenerics<? super Number> box) { // using wildcards
		System.out.println(box.getValue());
	}

	public static void main(String[] args) {// it will support Number and super class of Number(Object)
//		BoxWithGenerics<Integer> box1 = new BoxWithGenerics<>(125);
//		print(box1);
//
//		BoxWithGenerics<Double> box2 = new BoxWithGenerics<>(12.5);
//		print(box2);
//
		BoxWithGenerics<Number> box3 = new BoxWithGenerics<>(125);
		print(box3);
		
//		BoxWithGenerics<String> box4 = new BoxWithGenerics<>("Hello");
//		print(box4); // compile time error
		
		BoxWithGenerics<Object> box5 = new BoxWithGenerics<>(12.35);
		print(box5);
	}

}
