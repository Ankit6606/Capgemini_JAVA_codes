package Sorting;

import java.util.Arrays;

public class QuickSort {
	public static int partition(int[] arr, int pivot, int end_index) {
		int swap = pivot;
		int index = pivot + 1;
		while(index <= end_index) {
			if(arr[index] < arr[pivot]) {
				swap++;
				int temp = arr[swap];
				arr[swap] = arr[index];
				arr[index] = temp;
			}
			index++;
		}
		int temp = arr[swap];
		arr[swap] = arr[pivot];
		arr[pivot] = temp;
		return swap;
	}
	public static void quickSort(int[] arr, int start, int end) {
		if(start>=end)return;
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
	}
	public static void main(String[] args) {
		int[] arr = {4,8,1,9,2,0};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("---Quick Sort---");
		System.out.println(Arrays.toString(arr));
	}
}
