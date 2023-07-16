package array;

import java.util.Scanner;

public class SumOfTwoArrays {
	
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	
    	int i=0,carry=0;
    	int m=arr1.length;
    	int n=arr2.length;
    	int o=output.length;
    	int s=0;
    	if(m<n) {
    		s=m;
    	}else {
    		s=n;
    	}
    	while(i<s) {
    		int sum=arr1[m-1]+arr2[n-1]+carry;
    		if(sum>9) {
    			carry=sum/10;
    			sum=sum%10;
    			output[o-1]=sum;
    		}
    		else {
    			if((sum)>9) {
    				carry=(sum)/10;
    				sum=(sum)%10;
    				output[o-1]=sum;
    			}else {
    				output[o-1]=sum;
    				carry=0;
    			}
    			
    		}
    		m--;
    		n--;
    		o--;
    		i++;
    	}
    	while(i<arr1.length) {
    		int sum=arr1[m-1]+carry;
    		if((sum)>9) {
				carry=(sum)/10;
				sum=(sum)%10;
				output[o-1]=sum;
			}else {
				output[o-1]=sum;
				carry=0;
			}
    		m--;
    		o--;
    		i++;
    		
    	}
    	while(i<arr2.length) {
    		int sum=arr2[n-1]+carry;
    		if((sum)>9) {
				carry=(sum)/10;
				sum=(sum)%10;
				output[o-1]=sum;
			}else {
				output[o-1]=sum;
				carry=0;
			}
    		n--;
    		o--;
    		i++;
    		
    	}
    	if(carry>0) {
    		output[0]=carry;
    	}
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

		int t,n,m;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) { 
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				m=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5) && 0 <= m && m <= Math.pow(10, 5)) {
					int[] arr1=takeInput(n);
					int[] arr2=takeInput(m);
					int[] output= new int[1 + Math.max(arr1.length, arr2.length)];
					sumOfTwoArrays(arr1,arr2,output);
					display(output);
				}
				i++;
			}

		}

	}

}
