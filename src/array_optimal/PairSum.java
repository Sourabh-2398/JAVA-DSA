package array_optimal;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
	
	//NOT SOLVED YET
    public static int pairSum(int arr[], int x) {
    	Arrays.sort(arr);
        int count = 0;
        if(arr.length != 0){
            int i = 0, iFound = 0;
            int j = arr.length-1;
            while(i != j){
                if(arr[i] + arr[j] < x){
                    i++;
                } else if (arr[i] + arr[j] > x){
                    if(iFound > 0){
                        i = i - iFound;
                        iFound = 0;
                    }
                    j--;
                } else {
                    count++;
                    iFound++;
                    i++;
                }
                if(i == j && iFound > 0){
                    i = i - iFound;
                    iFound = 0;
                    j--;
                }
            }
            return count;
        }
        return count;
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
			int[] count=new int[t]; 
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 3)) {
					int[] arr=takeInput(n);
					x=scanner.nextInt();
					if(0 <= x && x <= Math.pow(10, 9)) {
						count[i] = pairSum(arr,x);
					}
				}
				i++;
			}
			display(count);
		}
		
	}
}
