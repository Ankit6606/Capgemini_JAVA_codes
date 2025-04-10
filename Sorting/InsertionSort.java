package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {2, 5, 3, 1, 4, 0};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

   