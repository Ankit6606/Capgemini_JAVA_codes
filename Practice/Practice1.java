package Practice;

public class Practice1 {
	public static void main(String[] args) {
		int[] arr = {7,4,6,8,2,9};
		int maxi = arr[0];
		int count = 1;
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>maxi) {
				count++;
				maxi = arr[i];
			}
		}
		System.out.println(count);
	}
}
