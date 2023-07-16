package array;
import java.util.*;
public class ArrangeNumbers {

    public static void arrange(int[] arr, int n) {
    	if(n>0) {
        	int inr=1,dcr,i;
        	for(i=0;i<=n/2;i++) {
    			arr[i]=inr;
    			inr+=2;
    		}
        	dcr=arr[n/2]-1;
        	if(n%2==0) {
            	for(int j=n/2;j<n;j++) {
        			arr[j]=dcr;
        			dcr-=2;
        		}
        	}else {
            	for(int j=n/2+1;j<n;j++) {
        			arr[j]=dcr;
        			dcr-=2;
        		}
        	}


    	}

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
			int[] nums=new int[t];
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 4)) {
				nums[i]=n;
				}
				i++;
			}
			
			for(int j=0;j<nums.length;j++) {
				int arr[] = new int[nums[j]];
				arrange(arr,nums[j]);
				display(arr);
			}
		}
		

		
	}
}