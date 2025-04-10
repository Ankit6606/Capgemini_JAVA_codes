package Searching;

public class EvennoofDigits {
	public static int countEvenNoofDigits(int[] arr) {
		int cnt = 0;
		for(int i : arr) {
			String str = Integer.toString(i);
			if(str.length()%2 == 0)cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] arr = {12, 345, 2, 6, 7896};
		System.out.println(countEvenNoofDigits(arr));
	}
}
 