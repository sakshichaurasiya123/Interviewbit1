import java.util.Stack;
import java.util.*;
class StackFunction{
    Stack<Integer>s1=new Stack<Integer>();
    Stack<Integer>s2=new Stack<Integer>();

    //Push Element Into the Stack
    public void push(int d){
        s1.push(d);
        if(s2.size()==0)
            s2.push(d);
        if(s2.peek()>d)
            s2.push(d);
    }

    //Pop Element from Stack
    public int pop(){
        int val=s1.pop();
        if(val==s2.peek())
            s2.pop();
        return val;
    }

    //Get Minimum Element from Stack
    public int getMin(){
    if(s2.size()!=0)
        return s2.peek();
    else
        return -1;
    }
}
public class get_Minimum_Element_Using_Stack{
    public static void main(String arg[]){
        StackFunction s1=new StackFunction();
        Scanner in=new Scanner(System.in);
        //int n=in.nextInt();
       s1.push(7);
       s1.push(8);
       s1.push(3);
       s1.push(1);
       s1.push(8);
       System.out.println("Minimum Element : "+s1.getMin());
     
    }
}