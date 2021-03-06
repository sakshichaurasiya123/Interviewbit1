public class StackArray{
    static int max=5;
    static int top=0;
   static int arr[]=new int[max];
   
   //Insert Operation 
   static void insert(int data){
        if(top==max)
        {
            System.out.println("Stack is full");
            return ;
        }
        arr[top++]=data;

    }
    
    //CHeck stack is full or not
    private static boolean isFull(){
        if(top==max)
            return true ;
        return false;
    }

    //Check stack is empty or not
    private static boolean isEmpty(){
        if(top==0)
            return true;
        return false;
    }
    public static int remove(){
        if(top==0){
            System.out.println("In stack doesn't have items");
            return Integer.MIN_VALUE;
        }
        return arr[--top];
    }
    public static int top(){
        if(arr.length==0){
            System.out.println("In stack doean't have items");
            return Integer.MIN_VALUE;
        }
        return arr[top-1];
    }


    public static void main(String arg[]){
     insert(5);
     insert(10);
     insert(4);
     insert(7);
     insert(19);
     System.out.println("Top Element of Stack : "+top());
     System.out.println("Removed Element : "+remove());
     System.out.println("Removed Element : "+remove());
     System.out.println("Removed Element : "+remove());
     System.out.println("Removed Element : "+remove());
     System.out.println("Removed Element :  "+remove());
    }
}