public class Stack{
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


    public static void main(String arg[]){
     Stack b=new Stack();
     insert(5);
     System.out.println(arr[0]);  
    }
}