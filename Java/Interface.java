

interface I1{
    public abstract void  show();
    public static final int s1=0;
    static void display(){}
}

public class Interface implements I1{
    public void show(){
        System.out.print("Hello");
    }
    public static void main(String arg[]){
        Interface i=new Interface();
        i.show();
    }
}