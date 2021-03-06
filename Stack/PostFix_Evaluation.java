/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.Stack;
public class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<String>s=new ArrayList<>();
		for(int i=0; i<n; i++)
		    s.add(in.next());
		Solution so=new Solution();
		int res=so.evalRPN(s);
		System.out.println(res);
	}
}
class Solution{
  public int evalRPN(ArrayList<String> A){
     Stack <Integer >s=new Stack<>();
     for(int i=0; i<A.size(); i++){
        if(A.get(i).equals("+")){
            int op1=s.pop();
            int op2=s.pop();
            s.push(op2+op1);
        }
        else if(A.get(i).equals("-")){
            int op1=s.pop();
            int op2=s.pop();
            s.push(op2-op1);
        }
        else if(A.get(i).equals("*")){
            int op1=s.pop();
            int op2=s.pop();
            s.push(op2*op1);
        }
        else if(A.get(i).equals("/")){
            int op1=s.pop();
            int op2=s.pop();
            s.push(op2/op1);
        }
        else
            s.push(Integer.parseInt(A.get(i)));
     }
     return s.peek();
  }
}