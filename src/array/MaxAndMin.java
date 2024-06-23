package array;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    int n=s.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<arr.length;i++)
	    {
	    	max=Math.max(max,arr[i]);
	    	min=Math.min(min,arr[i]);
	    }
	    System.out.println("Max value of array is " + max + " Min value of array is " + min);
	    s.close();
	}

}
