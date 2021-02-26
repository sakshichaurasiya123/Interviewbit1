import java.util.*;
public class KnapSack01{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int wt[]=new int[n];
        int val[]=new int[n];
        int W=in.nextInt();
       for(int i=0; i<n; i++)
            wt[i]=in.nextInt();
        

        for(int i=0; i<n; i++)
            val[i]=in.nextInt();
        /*for(int i=0; i<n; i++){
            wt[i]=(int)Math.pow(2,i);
            
        }*/
 int dp[][]=new int[n+1][W+1];
    for(int i=0; i<=n; i++){
        for(int j=0; j<=W; j++)
            dp[i][j]=-1;
    }
   
        
    int res=topDown(n,wt,val,W,dp);
    System.out.println(res);
    for(int i=0; i<=n; i++){
        for(int j=0; j<=W; j++)
            System.out.print(dp[i][j]+" ");

    
    System.out.println();
    }
    }

    // Recursive Approach

   /* public static int knapsack(int n,int wt[],int val[],int W){
        if(n==0 ||W==0)
            return 0;
        if(wt[n-1]>W)
            return knapsack(n-1, wt, val, W);
        else
            return Math.max(val[n-1]+knapsack(n-1,wt,val,W-wt[n-1]),knapsack(n-1,wt,val,W));
        
    }*/


    //Memorization Approach
    /*
     public static int knapsack(int n,int wt[],int val[],int W,int dp[][]){
        if(n==0 || W==0)
            return 0;
        if(dp[n][W]!=-1)
            return dp[n][W];
        if(wt[n-1]>W)
            return dp[n][W]=knapsack(n-1, wt, val, W,dp);
        else
            return dp[n][W]=Math.max(val[n-1]+knapsack(n-1, wt, val, W-wt[n-1],dp),knapsack(n-1, wt, val, W,dp));
        

    } */
    public static int topDown(int n,int wt[],int val[],int W,int dp[][]){
        for(int i=0; i<=n; i++)
            dp[i][0]=0;
        for(int i=0; i<=W; i++)
            dp[0][i]=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                if(wt[i-1]<=j)
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-wt[i-1]]+val[i-1]);
                else    
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][W];
    }

}