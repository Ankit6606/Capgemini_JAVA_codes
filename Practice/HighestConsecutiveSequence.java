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
//	      ArrayList<Integer> ar = new ArrayList<>();
//	      for(int i = 0; i<arr.length; i++){
//	        if(!ar.contains(arr[i]))ar.add(arr[i]);
//	      }
//	      int[] res = new int[1];
//	      for(int i = 0; i<ar.size()-1; i++){
//	        if(ar.get(i)+1 == ar.get(i+1))
//	        count++;
//	      }
//	      res[0] = count;
	      
	       int maxi = 0;
	       
	       for(int i = 0; i<n-1; i++){
	         if(arr[i+1]-arr[i]==1)count++;
	         else if(arr[i] == arr[i+1])continue;
	         else{
	             count = 1;
	         }
	         maxi = Math.max(maxi, count);
	         
	       }
	       int[] res = {maxi};
	       if(n==1&&arr[0]==0) {
	    	  int[] res1 = {1};
	    	  System.out.println(Arrays.toString(res1));
	       }
	       else
	    	   System.out.println(Arrays.toString(res));

	}
}
