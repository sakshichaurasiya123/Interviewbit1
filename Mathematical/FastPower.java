import java.util.*;
public class FastPower{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Fast Power : "+fastpower(a,b));
    }
    static int fastpower(int a,int b){
        int res=1;
        while(b>0){
            if((b&1)!=0)
                res=res*a;
            a=a*a;
            b=b>>1;
        }
        return res;
    }
}