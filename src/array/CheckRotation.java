package array;

import java.util.Scanner;

public class CheckRotation {
	
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
    	int k=0;
    	boolean inc=false,dcr=false;
    	int size=arr.length;
    	for(int i=0;i<size-1;i++) {
			if(arr[i]>arr[i+1]) {
				dcr=true;
			}
			if(arr[i]>arr[i+1]) {
				inc=true;
			}
			if(inc==true && dcr==true) {
				k=i;
				break;
			}
		}
    	if(k!=0) {
    		k++;
    	}
    	return k;
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
					System.out.print(arrayRotateCheck(arr));
				}
				i++;
			}
			
		}

	}

}
