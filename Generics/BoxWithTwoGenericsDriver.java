package Generics;

public class BoxWithTwoGenericsDriver {
	public static void main(String[] args) {
		BoxWithTwoGenerics<Integer,String> box = new BoxWithTwoGenerics<Integer, String>(1,"Mita");
		int key = box.getKey();
		String value = box.getValue();
		
		System.out.println(key+" "+value);
	}
}
