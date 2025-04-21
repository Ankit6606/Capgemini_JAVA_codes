package Demo_ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.*;

public class ArrayListDriver {
	public static void main(String[] args) {
//		List<Integer> arr = Arrays.asList(1,2,3,4,5);//no modifications can be done here
//		Collections.sort(arr, (n1, n2)-> n2-n1);
//		arr.forEach(t -> System.out.println(t));
		
//		List<String> str = Arrays.asList("Apple",
//				"Cherry",
//				"Banana",
//				"Berry");
//		Collections.sort(str, (s1, s2)-> s2.compareTo(s1));//Decreasing order of alphabetical comparison
//		Collections.sort(str, (s1,s2)->s1.length()-s2.length());//Increasing order of length of string
//		str.forEach(s -> System.out.println(s));
		
		
		List<Double> list = Arrays.asList(2.45, 65.0, 8.45,43.7,34.12);
		Collections.sort(list, (n1, n2)->Double.compare(n1,n2));
		list.forEach(l->System.out.println(l));
		
		
	}
}
