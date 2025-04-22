package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Arraylist {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(6);
		list.add(8);
		list.add(8);
		list.add(11);
		list.forEach(s->System.out.println(s));
		
		List<String> str = Arrays.asList("apple","banana","cherry","arm","city","mango","guava","grapes");
		
		List<Integer> l = new ArrayList<Integer>();
		list.forEach(s -> {if(s%2==0)l.add(s);});
		
		System.out.println(l.toString());
		List<Integer> res = list.stream().filter(i -> i%2==0).toList();
		System.out.println(res);
		
		List<Integer> res2 = list.stream().skip(2).toList();
		System.out.println(res2);
		
		List<Integer> res3 = list.stream().limit(2).toList();
		System.out.println(res3);
		
		List<Integer> res4 = list.stream().sorted().toList();
		System.out.println(res4);
		
		List<Integer> res5 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(res5);
		
		List<String> res6 = str.stream().filter(s -> s.length()>3).toList();
		System.out.println(res6);
		
		List<Integer> res7 = list.stream().map(n -> n*2).toList();
		System.out.println(res7);
		
		System.out.println(str.stream().findFirst().get());//Returns the 1st element of the list
		
		//Minimum element of the array
		int min = list.stream().min((n1, n2)-> n1.compareTo(n2)).get();
		System.out.println(min);
		
		//maximum element of the array
		int max = list.stream().max(Integer :: compare).get();//Above logic using compare is same, here we used method referencing
		System.out.println(max);
		
		//Group the elements of the string list based on their length
		Map<Integer, List<String>> map = str.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		//Group the elements of the string based on their starting character
		Map<Object, Long> map1 = str.stream().collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
		System.out.println(map1);
	}
}
