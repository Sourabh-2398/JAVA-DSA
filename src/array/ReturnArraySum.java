package array;
import java.util.*;
public class ReturnArraySum {
	
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String args[]) {
		
		int t,n;
		
		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) {
			int[] sum=new int[t]; 
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5)) {
				int[] arr=new int[n];
				for(int j=0;j<n;j++) {
					arr[j]=scanner.nextInt();
				}
				sum[i] = sum(arr);
				}
				i++;
			}
			for(int j=0;j<sum.length;j++) {
				System.out.println(sum[j]);
			}
		}
		
		
	}
}
