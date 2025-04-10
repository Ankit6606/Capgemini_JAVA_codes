package Practice;

public class MissingNumber {
	public static int findMissingNumber(int[] arr) {
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i<arr.length; i++) {
			sum1 += arr[i];
			sum2 += i+1;
		}
		return (sum2-sum1);
	}
	public static void main(String[] args) {
		int[] arr = {9,6,4,2,3,5,7,0,1};
		System.out.println(findMissingNumber(arr));
	}
}

