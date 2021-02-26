import java.util.*;
public class SubsetSum{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int sum=in.nextInt();
        boolean dp[][]=new boolean [n+1][sum+1];
        for(int i=0; i<=n; i++)
            dp[i][0]=true;
        for(int i=1; i<=sum; i++)
            dp[0][i]=false;
        if(subset(arr,n,sum,dp))
            System.out.println("True");
        else
            System.out.println("False");
    }
   /*  Recursive
   public static boolean subset(int arr[],int n,int sum, boolean dp[][]){
        if(sum==0)
            return true;
        if(n==0)
            return false;
        if(arr[n-1]<=sum)
            return (subset(arr,n-1,sum,dp) || subset(arr,n-1,sum-arr[n-1],dp));
        else    
            return subset(arr,n-1,sum,dp);
    } */
    // Top Down Dp
    public static boolean subset(int arr[],int n,int sum, boolean dp[][]){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++)
            {
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j] || dp[i][j-arr[i-1]];
                }
                else    
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}