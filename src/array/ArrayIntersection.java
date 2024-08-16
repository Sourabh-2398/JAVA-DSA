package array;

import java.util.Scanner;

public class ArrayIntersection {
	
	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		mergeSort(arr1);
		mergeSort(arr2);
		int m=arr1.length;
		int n=arr2.length;
		int j=0,k=0;
		while(j<m && k<n) {
			if(arr1[j]==arr2[k]) {
				System.out.print(arr1[j]+" ");
				j++;
				k++;
			}else {
				if(arr1[j]<arr2[k]) {
					j++;
				}else if(arr1[j]>arr2[k]) {
					k++;
				}
			}
		}


	}
	

	
    public static void mergeSort(int[] arr) {
    	
    	int p,i,l,mid,h;
    	for(p=2;p<=arr.length;p=p*2) {
    		for(i=0;i+p-1<arr.length;i=i+p) {
    			l=i;
    			h=i+p-1;
    			mid=(l+h)/2;
    			merge(arr,l,mid,h);
    		}
    	}
    	
    	if(p/2<arr.length) {
    		
    		merge(arr,0,(p/2)-1,arr.length-1);
    		
    	}

    }
    
	public static void merge(int[] a,int l,int mid,int h) {		
		int x=mid-l+1;
		int y=h-mid;
		int lower = l;
		int middle = mid;
		int[] arr1=new int[x];
		int[] arr2=new int[y];
		for(int i=0;i<x;i++) {
			arr1[i]=a[lower++];
		}
		for(int i=0;i<y;i++) {
			arr2[i]=a[++middle];
		}
		int[] arr=new int[arr1.length+arr2.length];
		int m=arr1.length;
		int n=arr2.length;
		int j=0,k=0,i=0;
		while(j<m && k<n) {
			if(arr1[j]<=arr2[k]) {
				arr[i++]=arr1[j++];
			}else{
				arr[i++]=arr2[k++];
			}
		}
		while(j<m) {
			arr[i++]=arr1[j++];
		}
		while(k<n) {
			arr[i++]=arr2[k++];
		}
		int t=0;
		for(i=l;i<(h+1);i++) {
			a[i]=arr[t++];
		}
		
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

	public static void main(String[] args) {
		
		int t,n,m;

		Scanner scanner=new Scanner(System.in);	
		t=scanner.nextInt();
		if(1 <= t && t <= Math.pow(10, 2)) { 
			int i=0;
			while(i<t) {
				n=scanner.nextInt();
				m=scanner.nextInt();
				if(0 <= n && n <= Math.pow(10, 6) && 0 <= m && m <= Math.pow(10, 6)) {
					int[] arr1=takeInput(n);
					int[] arr2=takeInput(m);
					intersection(arr1,arr2);
				}
				i++;
			}

		}
      scanner.close();
      }
}
