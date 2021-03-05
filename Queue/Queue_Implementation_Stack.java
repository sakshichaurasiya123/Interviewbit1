import java.util.*;
class QueueFunction{
    Stack<Integer>s1=new Stack<Integer>();
    Stack<Integer>s2=new Stack<Integer>();

    public void enqueue(int val){
        s1.push(val);
    }
    public int dequeue(){
        if(s2.size()!=0)
            return s2.pop();
        else if(s1.size()==0)
            return -1;
        else {
            while(s1.size()!=0)
                s2.push(s1.pop());
        }
        return s2.pop();
    }
    // Print Queue
    public void printQueue(){
        System.out.print("Element of Queue : ");
        while(s2.size()!=0)
            System.out.print(s2.pop() +"  ");
        System.out.println();
    }

}
public class Queue_Implementation_Stack{
    public static void main(String arg[]){
    QueueFunction q=new QueueFunction();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(40);
    q.enqueue(50);
    q.enqueue(70);
    System.out.println("Popped Element from Queue : "+q.dequeue());
    q.printQueue();
}
}