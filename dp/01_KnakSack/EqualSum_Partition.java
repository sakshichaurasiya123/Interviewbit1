import java.util.*;
public class EqualSum_Partition{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int sum=0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
        }
        if(sum%2!=0){
            System.out.println("Partition not possible");
            return;
        }
        int ans=sum/2;
        boolean dp[][]=new boolean [n+1][ans+1];
        for(int i=0; i<=n; i++)
            dp[i][0]=true;
        for(int j=1; j<=ans; j++)
            dp[0][j]=false;

        if(equal_partition(arr,n,ans,dp)){
            System.out.println("Partition exist");
        }
        else    
            System.out.println("Partition doesn't exist");
    }
    /* Recursive Solution
    public static boolean equal_partition(int arr[],int n,int sum){
        if(sum==0)
            return true;
        if(n==0)
            return false;
        if(arr[n-1]<=sum)
            return equal_partition(arr,n-1,sum-arr[n-1]) ||equal_partition(arr,n-1,sum);
        else
            return equal_partition(arr,n-1,sum);
    } */

    // Top down Approach
    public static boolean equal_partition(int arr[],int n,int ans,boolean dp[][]){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=ans; j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j]||dp[i][j-arr[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][ans];
    }
}