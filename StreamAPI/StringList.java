package StreamAPI;

import java.util.*;

public class StringList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "kolkata", "watermelon", "mango", "airplane");
		List<String> res = list.stream().map(s->s.toUpperCase()).toList();
		System.out.println(res);
		String res1 = list.stream().filter(s->s.charAt(0) == 'a').findFirst().get();
		System.out.println(res1);
	}
}
