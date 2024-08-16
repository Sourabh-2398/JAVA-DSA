package array;
import java.util.*;
public class FindUnique  {

    public static int findUnique(int[] arr){
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				count++;	
				}
			}
			if(count==1) {
				return arr[i]; 
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
		scanner.close();
		return arr;
	}

	public static void main(String args[]) {

		int t,n;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) {
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5)) {
					int[] arr=takeInput(n);
					System.out.println(findUnique(arr));
				}
				i++;
			}
		}
		scanner.close();
	}

}
