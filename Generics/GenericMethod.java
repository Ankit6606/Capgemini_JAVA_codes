package Generics;

public class GenericMethod {
//	static public void printArray(int[] array) { //when we know the array contains integer 
//		for(int i: array) {
//			System.out.println(i);
//		}
//	}
	
	static public<T> void printArray(T[] array) { //when we don't know the datatype of array
		for(T i: array) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
//		double[] array = {1.8,2.5,3.0};
//		printArray(array);  //it will not work for printArray(int[] array)
		
		Double[] array = {1.8,2.5,3.0};
		printArray(array);
		
		System.out.println();
		
		Long[] array2 = {100L,250L,30L};
		printArray(array2);
	}

}
