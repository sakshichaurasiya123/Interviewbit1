
class Employee{
    private int empid;
    public void setid(int empid1){
            empid=empid1;
    } 
    public int getid(){
        return empid;
    }
}
public class Encapsulation {
    public static void main(String arg[]){
    Employee emp=new Employee();
    emp.setid(1);
    int res=emp.getid();
    System.out.println(res);
    }
}