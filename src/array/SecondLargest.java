package array;

import java.util.Scanner;

public class SecondLargest {
	
	
    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
    	int max=Integer.MIN_VALUE;
    	int secondMax=Integer.MIN_VALUE;
    	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				if(secondMax!=max) {
					secondMax=max;
				}
				max=arr[i];
			}
			if(arr[i]>secondMax && arr[i]<max) {
				secondMax=arr[i];
			}
		}
		
		return secondMax;
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t,n;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) { 
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5)) {
					int[] arr=takeInput(n);
					System.out.print(secondLargestElement(arr));
				}
				i++;
			}
			
		}

	}

}
