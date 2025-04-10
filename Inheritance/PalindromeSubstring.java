package Inheritance;

public class PalindromeSubstring {
	static boolean isPalindrome(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i) != s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	static int countPalindrome(String s) {
		int res = 0;
		int len = s.length();
		for(int i = 0; i<len; i++) {
			for(int j = i+1; j<len; j++) {
				if(isPalindrome(s,i,j))res++;
			}
		}
		return (s.length() + res);
	}
	public static void main(String[] args) {
		String s = "abaab";
		System.out.println(countPalindrome(s));
	}
}
