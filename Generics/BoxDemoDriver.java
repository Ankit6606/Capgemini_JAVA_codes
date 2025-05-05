package Generics;

public class BoxDemoDriver {
	public static void main(String[] args) {
		BoxDemo box = new BoxDemo(10); //auto boxing
//		int value = box.getvalue();
		int value = (int)box.getValue();  //down casting... Object-->Integer
//		String value2 = (String)box.getValue(); // it will throw ClassCastException not compile time error,because we are downcasting wrongly. 
		//Thatswhy we use generics
		
		
		System.out.println(value);
	}
}



