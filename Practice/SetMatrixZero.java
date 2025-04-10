package Practice;

public class SetMatrixZero {
	public static int[][] setMatrixElementsZero(int[][] arr, int n, int m) {
		int col0 = 1;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(arr[i][j] == 0) {
					arr[i][0] = 0;
					if(j != 0 ) {
						arr[0][j] = 0; 
					}
					else
						col0 = 0;
				}
			}
		}
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<m; j++) {
				if(arr[i][j] != 0) {
					if(arr[i][0] == 0 || arr[0][j] == 0) {
						arr[i][j] = 0;
					}
				}
			}
		}
		if(arr[0][0] == 0) {  
			for(int i = 0; i<m; i++) {
				arr[0][i] = 0;
			}
		}
		if(col0 == 0) {
			for(int i = 0; i<n; i++) {
				arr[i][0] = 0;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int n = arr.length;
		int m = arr[0].length;
		int[][] mat = setMatrixElementsZero(arr,n,m);
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
