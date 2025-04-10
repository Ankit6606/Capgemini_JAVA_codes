package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[]arr , int n) {
		for(int i = 0; i<arr.length; i++) {
			if(n == arr[i])
				return i;
		}
		return -1;
	}
	public static int[] linearSearch2d (int[][] mat, int n) {
		int[] res = new int[2];
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(n == mat[i][j]) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		res[0] = -1;
		res[1] = -1; 
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {12, 345, 2, 6, 7896};
		int[][] mat = {{2, 78, 45},{1, 5, 3},{56, 78, 321}};
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		System.out.println(linearSearch(arr,n));
		System.out.println(Arrays.toString(linearSearch2d(mat,n)));
		
	}
}

 