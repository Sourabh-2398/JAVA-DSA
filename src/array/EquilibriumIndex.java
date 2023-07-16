package array;

import java.util.Scanner;

public class EquilibriumIndex {
	
	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n=arr.length;
		int totalSum=0;
		for(int i=0;i<n;i++) {
			totalSum+=arr[i];
		}
		int ls=0,rs=totalSum;
		for(int i=0;i<n;i++) {
			if(ls==rs) {
				return --i;
			}else {
				if(i!=0) {
					ls+=arr[i-1];
				}
				rs=totalSum-ls-arr[i];
			}
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
					System.out.print(arrayEquilibriumIndex(arr));
				}
				i++;
			}
			
		}
	}

}
