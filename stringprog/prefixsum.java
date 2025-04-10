
package stringprog;

public class prefixsum {
	public static void presum(int []a) {
		for(int i=0;i<a.length-1;i++) {
			a[i+1]=a[i]+a[i+1];
		}
	}
	public static void main(String[] args) {
	
		int a[]= {1,2,3,4};
		presum(a);
		System.out.println(a);
		
	}

}
 