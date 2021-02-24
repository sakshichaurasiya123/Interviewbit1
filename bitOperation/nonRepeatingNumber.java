import java.util.*;
public class nonRepeatingNumber{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int result=0;
        for(int i=0; i<arr.length; i++)
            result=result^arr[i];
        System.out.println(result);
    }
}