package array_optimal;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {

    public static int findDuplicate(int[] arr){
		
    	if(arr.length>1) {
        	Arrays.sort(arr);
        	int i=0,count=0;
        	int n=arr.length;
        	
        	while(i<n-1) {
        		if(arr[i]==arr[i+1]) {
        			count++;
        		}else {
        			if(count>0) {
        				return arr[i];
        			}
        		}
        		i++;
        	}
        	
        	if(arr[i-1]==arr[i]) {
    			count++;
    		}
        	if(count>0) {
				return arr[i];
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
					System.out.println(findDuplicate(arr));
				}
				i++;
			}


		}
	}

}
