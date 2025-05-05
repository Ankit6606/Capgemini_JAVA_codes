package Generics;

public class Wildcard3<T> {  //----> case 1
//public class Wildcard3<T extends Number> {  //----> case 2
//public class Wildcard3<T super Number> {  //----> case 3...error, as java doesnot support this knid of declaration
	
	T value;
	T[] arr; //okay
//	T[] arr2 = new T[10]; //error, we can create generic array reference, but can't create generic array object 

	Wildcard3(T value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Wildcard3<Integer> ref = new Wildcard3<>(10);
		
//		Wildcard3<Object> ref2 = ref; // error, because Wildcard3<Integer> is not a subtype of Wildcard3<Object>, even
//		Wildcard3<Number> ref3 = ref;  though Integer is a subtype of Object
		
		Wildcard3<?> ref4 = ref; // will work fine,? can accept any type
		
		Wildcard3<? extends Object> ref5 = ref;
		Wildcard3<? extends Number> ref6 = ref;
		Wildcard3<? extends Integer> ref7 = ref;
		
		Wildcard3<? super Integer> ref8 = ref;
//		Wildcard3<? super Number> ref9 = ref; // error
		
	}
}





	