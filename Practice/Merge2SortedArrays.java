package Practice;

import java.util.Arrays;

public class Merge2SortedArrays {
	public static void merge(int[] arr, int start, int end, int mid) {
		int left = start;
		int right = mid+1;
		int i = 0;
		int[] temp = new int[end-start+1];
		while(left<=mid && right<=end) {
			if(arr[left] <= arr[right]) {
				temp[i] = arr[left];
				left++;
			}else {
				temp[i] = arr[right];
				right++;
			}
			i++;
		}
		while(left<=mid) {
			temp[i] = arr[left];
			i++;
			left++;
		}
		while(right<=end) {
			temp[i] = arr[right];
			right++;
			i++;
		}
		for(int k = start; k<=end; k++) {
			arr[k] = temp[k-start];
		}
	}
	public static void mergeSort(int[] arr, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, end, mid);
		}
	}
	public static void main(String[] args) {
		int[] arr = {3,6,2,9,6,1,2};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
