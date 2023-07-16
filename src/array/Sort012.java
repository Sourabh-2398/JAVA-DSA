package array;

import java.util.Scanner;

public class Sort012 {

	public static void sort012(int[] arr){
		int i=0,nz=0,nt=arr.length-1;
		while(i<nt+1) {
			if(arr[i]==2) {
				int temp=arr[nt];
				arr[nt]=arr[i];
				arr[i]=temp;
				nt--;
			}else if(arr[i]==0) {
				int temp=arr[nz];
				arr[nz]=arr[i];
				arr[i]=temp;
				nz++;
				i++;
			}else {
				i++;
			}
			
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
					sort012(arr);
					display(arr);
				}
				i++;
			}

		}

	}

}
