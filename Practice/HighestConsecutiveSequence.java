package Practice;
import java.util.*;
public class HighestConsecutiveSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int[] arr = new int[n];
	      for(int i = 0; i<n; i++){
	        arr[i] = sc.nextInt();
	      }
	      Arrays.sort(arr);
	      int count = 1;
	      int maxi = 0;
	       
	      for(int i = 0; i<n-1; i++){
	        if(arr[i+1]-arr[i]==1)count++;
	        else if(arr[i] == arr[i+1])continue;
	        else{
	            count = 1;
	        }
	        maxi = Math.max(maxi, count);
	         
	      }
	      if(n==1) {
	    	 int[] res = {1};
	    	 System.out.println(Arrays.toString(res));
	      }
	      else {
	    	  int[] res = {maxi};
	    	  System.out.println(Arrays.toString(res));
	      }
	    	 

	}
}
