class Override1{
     void show(){
        System.out.println("Parent class Show method");
    }
}
class Overriding extends Override1{
    public void show(){
        System.out.println("Child Class Show Method");
        super.show();
    }
    public static void main(String arg[])
    {
        Overriding  o=new Overriding();
        o.show();
      //  Override1 i=new Override1();
        //i.show();
    }
}