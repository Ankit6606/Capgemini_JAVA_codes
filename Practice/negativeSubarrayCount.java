package Practice;

public class negativeSubarrayCount {
	public static void main(String[] args) {
		int[] arr = {-1,2,-3,4,-5};
		int sum = 0, count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				sum += arr[j];
				if(sum < 0)
					count++;
			}
			sum = 0;
		}
		System.out.println(count);
	}
}

