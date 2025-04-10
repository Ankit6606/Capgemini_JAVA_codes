package Practice;

import java.util.Arrays; 
import java.util.Scanner;

public class RemoveDuplicate {
	public static String duplicate(String str){
		int[] ch = new int[123];
		String res = "";
		for(int i = 0; i<str.length(); i++) {
			if(ch[str.charAt(i)] == 0) {
				res += str.charAt(i);
				ch[str.charAt(i)]++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		String[] res = new String[n];
		for(int i = 0; i<n; i++) {
			str[i] = sc.nextLine();
		}
		for(int i = 0; i<n; i++) {
			res[i] = duplicate(str[i]);
		}
		System.out.println(Arrays.toString(res));
	}
}


