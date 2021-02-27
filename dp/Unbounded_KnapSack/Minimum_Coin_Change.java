import java.util.*;
public class Minimum_Coin_Change{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int sum=in.nextInt();
       System.out.println(minimum(n,arr,sum));
    }
   /* public static int minimum(int n,int arr[],int sum){
        if(n==0)
            return Integer.MAX_VALUE-1;
        if(sum==0)
            return 0;
        if(arr[n-1]>sum)
            return minimum(n-1, arr, sum);
        else
            return Math.min(minimum(n-1, arr, sum),1+minimum(n, arr, sum-arr[n-1]));
    } */
    // DP based
    public static int minimum(int n,int arr[],int sum){
        int dp[][]=new int[n+1][sum+1];
        for(int i=0; i<=sum; i++)
            dp[0][i]=Integer.MAX_VALUE-1;
        for(int i=1; i<=n; i++)
            dp[i][0]=0;
        for(int i=1; i<=sum; i++){
            if(arr[0]%i==0)
                dp[1][i]=arr[0]%i;
            else
                dp[1][i]=Integer.MAX_VALUE-1;
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j)
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-arr[i-1]]+1);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}