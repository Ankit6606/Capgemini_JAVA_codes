package Generics;

import java.util.LinkedList;

public class Wildcard2 {
	
//	// unbound wildcard
//	public static void print(LinkedList<?> list) { 
////		list.add(10);  // add() is not applicable here, because we dont know type of "?", if we add Integer and type in runtime is Double , it will be a problem
////		Object i; 
////		list.add(i);
//		for(Object o: list) { // we can store it in Object object, not in Number object or any other Class object, as type in runtime could be any class object
//			System.out.println(o);
//		}
//		Object i = list.get(0);// we can get it in Object object, not in Number object or any other Class object
//	}
//	
//	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(10);
//		list.add(20);
//		print(list);
//	}

	
	
	
	
//	// Upper bound wildcard
//	public static void print(LinkedList<? extends Number> list) {
////			list.add(10);  // add() is not applicable here, because we dont know type of "?", if we add Integer and type in runtime is Double , it will be a problem
////			Object i; 
////			list.add(i);
//		for (Object o : list) { // we can store it only in Object object, Number object, not in any other Class
//								// object, as type in runtime could be Number or any child of Number 
//			System.out.println(o);
//		}
//		Number n = list.get(0);// we can get it only in Object object, Number object, not in any other Class
//								// object
//	}
//
//	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();  // we can use type only child of Number or Number itself
//		list.add(10);
//		list.add(20);
//		print(list);
//	}

	
	
	
	
//	 Lower bound wildcard
	public static void print(LinkedList<? super Number> list) {
		list.add(30); // add() is applicable here, for Number object and other Wrapper class object, anything can be upcasted automatically to Number or Object object, for any type in runtime
		Number n = 40;
		list.add(n);
//		list.add("Hello"); // not applicable, as String is not related to Number class
//		Object i; 
//		list.add(i); // Object object will not be added here because what if the type is Number object in runtime, Object can't be downcasted to Number automatically
		for (Object o : list) { // we can store it only in Object object, not in Number object or any other Class object, what if type in runtime is passed Object object, then it can't be downcasted
			System.out.println(o);
		}
		Object o = list.get(0);// we can get it only in Object object, Number object, not in any other Class object
	}

	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>(); //Integer cant be used for lower bound wildcard as it will accept only Number object, Object object
//		list.add(10);
//		list.add(20);
//		print(list);
		
		LinkedList<Number> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		print(list);
	}
}
