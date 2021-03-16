public class COnstructor{
    int k;
    COnstructor(int i){
        k=i;
    }
    void display()
    {
        System.out.println(" Value = "+k);
    }
    public static void main(String arg[]){
        COnstructor co=new COnstructor(10);
        System.out.println(co.k);

    }
}