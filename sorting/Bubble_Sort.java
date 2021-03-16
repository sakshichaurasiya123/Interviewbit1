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
	    bubble_Sort(arr,n);
	   for(int i=0; i<n; i++)
	    System.out.print(arr[i]+" ");
	}
 static void bubble_Sort(int arr[], int n) 
    { 
        int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                }
                
                System.out.println(Arrays.toString(arr));
            } 
            System.out.println();
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
    } 
  
}