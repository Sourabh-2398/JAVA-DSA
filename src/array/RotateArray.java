package array;

import java.util.Scanner;

public class RotateArray {
	
    public static void rotate(int[] arr, int d) {
    	int k=arr.length;
    	int[] temp=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=0;i<arr.length-d;i++) {
			arr[i]=arr[i+d];
		}
		for(int i=0;i<d;i++) {
			arr[k-d]=temp[i];
			k++;
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
	
	

	public static void main(String[] args) {
		
		int t,n,d;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) { 
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5)) {
					int[] arr=takeInput(n);
					d=scanner.nextInt();
					if(0 <= d && d <= n) {
						rotate(arr,d);
						display(arr);
					}
					
				}
				i++;
			}
			
		}
	}

}
