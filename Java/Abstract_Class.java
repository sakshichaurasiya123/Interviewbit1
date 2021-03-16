
abstract class Vehicle {
    int No_Of_Tires;
    abstract void start();
}
class  Abstract_Class extends Vehicle {
    void start(){
        System.out.println("Start with key");  
        
    }
    public static void main(String arg[]){
        Abstract_Class ac=new Abstract_Class();
        ac.start();
    }
}

