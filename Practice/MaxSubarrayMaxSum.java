package Practice;

public class MaxSubarrayMaxSum {
	static int maxSubarraySum(int[] nums) {
		int sum = 0, maxi = Integer.MIN_VALUE;
		for(int i = 0; i<nums.length; i++) {
			sum += nums[i];
			if(maxi<sum)maxi = sum;
			if(sum<0)sum = 0;
		}
		return maxi;
	}
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, -4};
		System.out.println(maxSubarraySum(nums));
	}
}
