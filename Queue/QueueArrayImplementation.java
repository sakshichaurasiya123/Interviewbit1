class QueueFunction{
    int MAX=5;
    int front=0;
    int rear=-1;
    int size=0;
    int arr[]=new int[MAX];
   
    //Check ueue is full or not
    public boolean ifFull(){
        if(size==MAX)
            return true;
        return false;
    }

    //Insert Element in the queue
    public void insert(int val){
        if(ifFull())
        {
            System.out.println("Queue is Already full you can't insert more element ");
            return;
        }
        rear=(rear+1)%MAX;
        size++;
        arr[rear]=val;
   } 

   //Remove from front
   public int remove(){
       if(ifEmpty())
        {
            System.out.println("Queue is already empty, you don't have any item to remove");
            return 0;
        }
        size--;
        front=(front)%MAX;
        return arr[front++];
   }

   //Check queue is empty or not
   public boolean ifEmpty(){
       if(size==0)
            return true;
        return false;
   }

   //Get Size of Queue
   public int getsize(){
       return size;
   }

   //Get Front
   public int getFront(){
       if(ifEmpty())
       {
           System.out.println("Queue is empty, you don't have element in the queue to remove");
           return 0;
       }
       return arr[front];
   }

   //Get Rear
   public int getRear(){
       if(ifEmpty()){
           System.out.println("Queue is already empty, you don't have any item in the queue");
           return 0;
       }
       return arr[rear];
   }

}
public class QueueArrayImplementation{
    public static void main(String arg[]){
        QueueFunction queue =new QueueFunction();
        queue.insert(5);
        queue.insert(10);
        System.out.println("Rear Element : "+queue.getRear());
        System.out.println("Front Element : "+queue.getFront());
        queue.insert(15);
        queue.insert(20);
        System.out.println("Size of queue : "+queue.getsize());
        System.out.println("Rear Element : "+queue.getRear());
    }
}