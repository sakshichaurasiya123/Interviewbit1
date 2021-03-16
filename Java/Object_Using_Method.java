public class Object_Using_Method{
    int age;
    String name;
    void ObjeInit(int a,String n){
        age=a;
        name=n;
    }
    void display(){
        System.out.println(name+" "+age);
    }
 
    public static void main(String arg[]){
        Object_Using_Method m=new Object_Using_Method();
        m.ObjeInit(10,"Muskan");
        m.display();
    }
}