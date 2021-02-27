import java.util.*;
public class Coin_Change_No_of_Ways{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int sum=in.nextInt();
        int dp[][]=new int[n+1][sum+1];
        for(int i=0; i<=sum; i++)
            dp[0][i]=0;
        for(int i=1; i<=n; i++)
            dp[i][0]=1;
        
        System.out.println(ways(n,arr,sum,dp));
    }

    /* Recursive
    public static int ways(int n,int arr[],int sum){
        if(n==0)
            return 0;
        if(sum==0)
            return 1;
        if(arr[n-1]>sum)
            return ways(n-1,arr,sum);
        else
            return ways(n-1,arr,sum)+ways(n,arr,sum-arr[n-1]);
    } */

    // Dp solution
    public static int ways(int n, int arr[],int sum,int dp[][]){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-arr[i-1]];
            }
        }
        return dp[n][sum];
    }
}