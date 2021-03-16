/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n;i++)
	        arr[i]=in.nextInt();
	   quickSort(arr,0,n-1);
	   for(int i=0; i<n; i++)
	    System.out.print(arr[i]+" ");
	}
	public static void quickSort(int arr[],int start,int end){
	    int pivot,i,j,temp;
	    if(start<end){
	     pivot=start;
	     i=start;
	    j=end;
	  
	    while(i<j){
	        while(arr[i]<=arr[pivot] && i<end)
	            i++;
	        while(arr[j]>arr[pivot] && j>=0)
	            j--;
	       if(i<j)
	       {
	           temp=arr[i];
	           arr[i]=arr[j];
	           arr[j]=temp;
	       }
	         System.out.println("Before: "+Arrays.toString(arr));
	    }
	    temp=arr[pivot];
	    arr[pivot]=arr[j];
	    arr[j]=temp;
	    System.out.println("After : "+Arrays.toString(arr));
	    
	   quickSort(arr,start,j-1);
	   quickSort(arr,j+1,end);
	}
	}
}