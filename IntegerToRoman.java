/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    String k=integerToRoman3(n);
	    System.out.println(k);
	}
	
	private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

public static final String integerToRoman3(int number) {

    StringBuilder br=new StringBuilder();
    for(int i=0; i<values.length; i++){
        while(number>=values[i]){
            number -=values[i];
            br.append(romanLiterals[i]);
        }
    }
    return br.toString();
    
}

}
