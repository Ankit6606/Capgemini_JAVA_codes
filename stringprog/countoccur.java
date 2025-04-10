

package stringprog;

import java.util.Scanner;

public class countoccur {
	public static void main(String[] args) {
	String s="messi";
	int ch='s';
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch)
				c++;
		}
		System.out.println(c);
		
	}

}

 