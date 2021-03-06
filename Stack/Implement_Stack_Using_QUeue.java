import java.util.*;
class StackFunction{
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    public void push(int d)
    {
        q1.add(d);
    }
    public int pop(){
        if(q1.size()==0)
            return -1;
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int val=q1.remove();
        Queue<Integer>q=q1;
        q1=q2;
        q2=q;
        return val;
    }
}
public class Implement_Stack_Using_QUeue{
    public static void main(String arg[]){
        StackFunction q=new StackFunction();
        Scanner in=new Scanner(System.in);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        System.out.println("Popped Element : "+q.pop());
        System.out.println("Popped Element : "+q.pop());
        System.out.println("Popped Element : "+q.pop());
        System.out.println("Popped Element : "+q.pop());


    }
}