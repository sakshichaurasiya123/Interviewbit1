import java.util.*;
public class Count_NoOfSubset_with_givenSum{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int sum=in.nextInt();
       System.out.println(count_subset(arr,n,sum));


    }
    /* Recursive Solution
    static int count_subset(int arr[],int n,int sum){
        if(sum==0)
            return 1;
        if(n==0)
            return 0;
        if(arr[n-1]<=sum)
            return count_subset(arr, n-1, sum)+count_subset(arr, n-1, sum-arr[n-1]);
        else
            return count_subset(arr, n-1, sum);
    }
    */
    static int count_subset(int arr[],int n, int sum){
        int dp[][]=new int[n+1][sum+1];
        for(int i=0; i<=n; i++)
            dp[i][0]=1;
        for(int i=1; i<=sum; i++ )
            dp[0][i]=0;
        for(int i=1; i<=n; i++){
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