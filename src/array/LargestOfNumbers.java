package array;

import java.util.Scanner;

public class LargestOfNumbers {
	
	public static int findLargest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;	
	}
	
	public static int[] takeInput(int n) {
		
		Scanner scanner=new Scanner(System.in);
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=takeInput(n);
		System.out.print(findLargest(arr));
		
		
	}

}
