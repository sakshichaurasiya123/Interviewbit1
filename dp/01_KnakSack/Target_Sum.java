import java.util.*;
public class Target_Sum{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int s=in.nextInt();
        int total=0;
        for(int i=0; i<n; i++)
            total+=arr[i];
        int sum=(s+total)/2;
        int dp[][]=new int[n+1][sum+1];
        for(int i=0; i<=n; i++)
            dp[i][0]=1;
        for(int i=1; i<=sum; i++)
            dp[0][i]=0;
       int res= target_sum(n,arr,sum,dp);
       System.out.println(res);
    }
    static int target_sum(int n,int arr[],int sum,int dp[][]){
        for(int i=1;i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}