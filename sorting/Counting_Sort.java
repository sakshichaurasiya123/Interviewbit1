/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		count(arr,n);
	}
	public static void count(int arr[],int n){
	    int max=Integer.MIN_VALUE;
	    for(int i=0; i<n; i++)
	        max=Math.max(arr[i],max);
	   int count[]=new int[max+1];
	   for(int i=0; i<n; i++){
	    count[arr[i]]++;   
	   }
	   int j=0;
	   for(int i=0; i<count.length; i++){
	       if(count[i]!=0){
	           while(count[i]>0 && j<n){
	               count[i]--;
	               arr[j++]=i;
	           }
	           
	       }
	   }
	   System.out.println(Arrays.toString(arr));
	}
}