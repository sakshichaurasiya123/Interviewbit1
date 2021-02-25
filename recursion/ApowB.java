public class ApowB{
    public static void main(String arg[]){
        int a=3;
        int b=2;
        int res=pow(a,b);
        System.out.println(res);

    }
    static int pow(int a,int b){
        if(b==0)
                return 1;
        return a*pow(a,b-1);
    }
}