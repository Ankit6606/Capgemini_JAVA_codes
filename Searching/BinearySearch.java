package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinearySearch {
	public static int binarySearch(int[] arr, int n) {
		int left = 0; 
		int right = arr.length-1;
		while(left<=right) {
			int mid = left +(right-left)/2;
			if(arr[mid] == n)return mid;
			else if(n>arr[mid])left = mid +1;
			else right = mid-1;
		}
		return -1;
	}
	public static int[] findTarget(int[] arr, int n) {
		int res[] = new int[2];
		int start = binarySearch(arr, n);
		if(start == -1) {
			res[0] = -1;
			res[1] = -1;
			return res;
		}
		int left = start;
	    while (left - 1 >= 0 && arr[left - 1] == n) {
	        left--; 
	    }

	    int right = start;
	    while (right + 1 < arr.length && arr[right + 1] == n) {
	        right++; 
	    }
		res[0] = left;
		res[1] = right;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {5, 7, 7, 8, 8, 10};
		System.out.println("Enter the number:");
		int n = sc.nextInt();
//		System.out.println(binarySearch(arr, n));
		System.out.println(Arrays.toString(findTarget(arr, n)));
	}
}

