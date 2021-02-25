public class printHello{
    public static void main(String arg[]){
        int n=5;
        recursion(n);
    }
    static void recursion(int n){
        if(n==0)
            return;
        System.out.println("Hello") ;
    recursion(n-1); 
    }
}