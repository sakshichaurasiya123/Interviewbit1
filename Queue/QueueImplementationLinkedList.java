class Node{
    int data;
    Node next;
}
class QueueList{
    Node first;
    Node last;
    int size;

    //Create new Node
    public Node getNewNode (int x){
        Node a=new Node();
        a.data=x;
        a.next=null;
        return a;
    }
    //Insert Element in the queue
    public void insert(int val){
        if(last==null)
        {
            first=last=getNewNode(val);
            size++;
            return;
        }
        size++;
        last.next=getNewNode(val);
        last=last.next;
    }

    //Get Size of queue
    public int getSize(){
        return size;
    }

    //Remove first element from queue
    public int remove(){
        if(ifEmpty())
        {
            System.out.println("Queue is empty, nothing is here to remove");
            return 0;
        }
        size--;
        int t=first.data;
        first=first.next;
        if(first==null){
            last=null;
        }
        return t;
    }

    // Get Front
    public int getfront(){
        if(ifEmpty()){
            System.out.println("Nothing is here, Queue is empty");
            return 0;
        }
        return first.data;
    }
    // Get Rear
    public int getrear(){
        if(ifEmpty()){
            System.out.println("Queue is empty, Nothing is here");
            return 0;
        }
        return last.data;
    }



    //Check is there queue is empty or not
    public boolean ifEmpty(){
        if(last==null)
            return true;
        return false;
    }
}

public class QueueImplementationLinkedList{
    public static void main(String arg[]){
    QueueList queue=new QueueList();
    queue.insert(10);
    queue.insert(15);
    queue.insert(20);
    queue.insert(25);
    queue.insert(30);
    System.out.println("Size of Queue : "+queue.getSize());
    System.out.println("Remove element from front : "+queue.remove());
    System.out.println("Updated Size of Queue : "+queue.getSize());
    System.out.println("Rear : "+queue.getrear());
    System.out.println("Front : "+queue.getfront());
    queue.insert(50);
    System.out.println("Remove element from front : "+queue.remove());
    System.out.println("Remove element from front : "+queue.remove());
    System.out.println("Remove element from front : "+queue.remove());
    System.out.println("Remove element from front : "+queue.remove());
    System.out.println("Remove element from front : "+queue.remove());
    System.out.println("Remove element from front : "+queue.remove());

    }
}