package array;
import java.util.*;
public class  TripletSum {


	public static int findTriplet(int arr[], int x) {
		int count=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
				}
			}
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
		if(1 <= t && t <= 50) {
			int[] count=new int[t]; 
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 2)) {
					int[] arr=takeInput(n);
					x=scanner.nextInt();
					if(0 <= x && x <= Math.pow(10, 9)) {
						count[i] = findTriplet(arr,x);
					}
				}
				i++;
			}
			display(count);
		}

	}
}