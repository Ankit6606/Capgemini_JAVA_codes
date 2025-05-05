package Generics;

public class BoxWithGenericsDriver {
	public static void main(String[] args) {
//		BoxWithGenerics<Integer> box = new BoxWithGenerics<>(100);
//		int value = box.getValue();
//		System.out.println(value);
		
		BoxWithGenerics<String> box = new BoxWithGenerics<>("Hello");
		String value = box.getValue();
//		int value2 = box.getValue(); // now it will show compile time error
		System.out.println(value);
	}
}
