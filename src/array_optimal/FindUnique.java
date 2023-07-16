package array_optimal;
import java.util.*;
public class FindUnique  {

    public static int findUnique(int[] arr){
    	if(arr.length>1) {
        	Arrays.sort(arr);
        	int i=0,j=0,count=0;
        	int n=arr.length;
        	
        	while(i<n-1) {
        		if(arr[i]==arr[i+1]) {
        			count++;
        		}else {
        			if(count==0) {
        				return arr[i];
        			}
        			count=0;
        		}
        		i++;
        	}
        	if(arr[i-1]==arr[i]) {
    			count++;
    		}else {
    			if(count==0) {
    				return arr[i];
    			}
    			count=0;
    		}
    	}else if(arr.length==1) {
    		return arr[0];
    	}
    	
    	return -1;

    }

	public static int[] takeInput(int n) {

		Scanner scanner=new Scanner(System.in);
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	
	public static void display(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

	public static void main(String args[]) {

		int t,n,x;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) {
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5)) {
					int[] arr=takeInput(n);
					System.out.println(findUnique(arr));
				}
				i++;
			}


		}
	}

}
