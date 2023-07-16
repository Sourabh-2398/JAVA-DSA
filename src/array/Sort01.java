package array;
import java.util.*;
public class  Sort01 {


    public static void sortZeroesAndOne(int[] arr) {
    	int zeros=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==0) {
    			zeros++;
    		}
		}
    	
		for(int i=0;i<zeros;i++) {
			arr[i]=0;
		}
		for(int i=zeros;i<arr.length;i++) {
			arr[i]=1;
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
					 sortZeroesAndOne(arr);
					 display(arr);
				}
				i++;
			}
			
		}
		
	}
}