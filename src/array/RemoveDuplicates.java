package array;
import java.util.*;
public class RemoveDuplicates  {

    public static int[] removeDuplicate(int[] arr){
        for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				count++;	
				}
			}
			if(count>1) {
				arr[i]=Integer.MAX_VALUE; 
			}
		}
        int length=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=Integer.MAX_VALUE) {
        		length++;
        	}
        }
        int[] newArr=new int[length];
        int j=0;
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=Integer.MAX_VALUE) {
        		newArr[j++]=arr[i];
        	}
        }
        
        return newArr;
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
			while(i<t) {
				n=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 5)) {
					int[] arr=takeInput(n);
					int[] newArr=removeDuplicate(arr);
					display(newArr);
					
				}
				i++;
			}

         
		}
	}

}
