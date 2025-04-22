package MethodReference;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,5,2,4,5,6);
//		list.forEach(s-> System.out.println(s));
		list.forEach(System.out::println);
		System.out.println();
//		Collections.sort(list, (n1, n2)-> n1.compareTo(n2));
		Collections.sort(list, Integer::compareTo);
		list.forEach(System.out::println);
		Integer[] arr = list.toArray(Integer[]::new);
		System.out.println(arr.length);
	}
}
