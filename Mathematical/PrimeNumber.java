import java.util.*;
public class PrimeNumber{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean arr[]=prime(n);
        for(int i=0; i<arr.length; i++)
            System.out.println(i +" "+arr[i]);
    }
    public static boolean[]prime(int n){
        boolean isprime[]=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j+=i){
                isprime[j]=false;
            }
        }
        return isprime;

    }
}