class Node{
    int data;
    Node next;
}
class StackFunction{
    Node front;
    public Node newNode(int x){
        Node d=new Node();
        d.data=x;
        d.next=null;
        return d;
    }

    //Insert Element Into Stack
    public void insert(int d){
        if(front==null)
        {
            front=newNode(d);
            return;
        }
        Node t=newNode(d);
        t.next=front;
        front=t;
    }

    //Remove Element from stack
    public int remove(){
        if(front==null){
            System.out.println("Stack is already empty");
            return Integer.MIN_VALUE;
        }
        int k=front.data;
        front=front.next;
        return k;
    }

    //Fetch top element from Stack
    public int top(){
        if(front==null){
                return -1;
        }
        return front.data;
    }

    //Print Stack
    public void print(){
        System.out.print("Stack Element : ");
        while(front!=null){
            System.out.print(front.data+" ");
            front=front.next;
        }
    }
}

//Driver Code
public class StackLinkedList{
    public static void main(String arg[]){
        StackFunction s=new StackFunction();
        s.insert(10);
        s.insert(15);
        s.insert(20);
        System.out.println("Removed Element : "+s.remove());
        System.out.println("Top Element : "+s.top());
        s.insert(20);
        s.insert(25);
        s.insert(30);
        s.print(); 
    
    }
}