package array;
import java.util.*;
public class SwapAlternate  {

    public static void swapAlternate(int arr[]) {
    	
    	if(arr.length%2==0) {
    		for(int i=0;i<arr.length;i=i+2) {
    			int temp=arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=temp;
    		}
    	}else {
    		for(int i=0;i<arr.length-1;i=i+2) {
    			int temp=arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=temp;
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
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int t,n,x;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) {
			int i=0;
			int[] tests=new int[t];
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5)) {
					int[] arr=takeInput(n);
					swapAlternate(arr);
					display(arr);
				}
				i++;
			}


		}
	}

}
