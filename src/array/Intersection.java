package array;
import java.util.*;
public class Intersection  {

    public static void intersections(int arr1[], int arr2[]) {
    	        
    	for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
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

	public static void main(String args[]) {

		int t,n,x,m;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) {
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				m=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 3) && 0 <= m && m <= Math.pow(10, 3)) {
					int[] arr1=takeInput(n);
					int[] arr2=takeInput(m);
					intersections(arr1,arr2);
				}
				i++;
			}


		}
	}

}
