import java.util.*;
public class PalindromNumber{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int reverse=0;
        while(temp!=0){
            int d=temp%10;
            reverse=reverse*10+d;
            temp /=10;
        }
        System.out.println((reverse==n)?"True":"false");
    }
}