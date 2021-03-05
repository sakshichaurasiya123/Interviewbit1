class QueueFunction {
    int MAX=5;
    int arr[]=new int [MAX];
    int numElement=0;

    //Insert Element
    public void insert(int val){

        if(isFull()){
            System.out.println("You can't insert because queue is already full");
            return;
        }        
        int i;
        if(numElement==0){
            arr[0]=val;
            numElement++;
            return;
        }
        for(i=numElement-1; i>=0;i--){
            if(val>arr[i]){
                arr[i+1]=arr[i];
            }
            else
                break;
        }
        arr[i+1]=val;
        numElement++;
    } 

    //Remove Element 
    public int remove(){
        if(numElement>0){
            return arr[--numElement];
        }
        else
            return Integer.MIN_VALUE;
    }

    //Get Peak Element
    public int getpeak(){
        return arr[numElement-1];
    }

    //Check wheather queue is full or not
    public boolean isFull(){
        if(numElement==MAX)
            return true;
        return false;
    }

    //Check wheather queue is empty or not
    public boolean isEmpty(){
        if(numElement==0)
            return true;
        return false;
    }

    //Size of Queue
    public int getsize(){
        return numElement;
    }

    // Print Queue
    public void printQueue(){
        System.out.print(" Print Queue : ");
        for(int i=0; i<numElement; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
public class PriorityQueueArray{
    public static void main(String arg[]){
        QueueFunction q=new QueueFunction();
        q.insert(12);
        q.insert(7);
        q.insert(10);
        q.insert(1);
        q.insert(8);
        q.insert(6);
        System.out.println("Size of queue : "+q.getsize());
        System.out.println("Peek of Queue : "+q.getpeak());
         System.out.println("Remove element from Queue : "+q.remove());
        q.printQueue();
    }
}