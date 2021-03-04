import java.util.*;
public class LCS{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int row []:dp){
            Arrays.fill(row,-1);
        }
        for(int i=0; i<=m; i++)
            dp[i][0]=0;
        for(int i=0; i<=n; i++)
            dp[0][i]=0;
        /* For Recursion
        int res=lcs(s1.length(),s2.length(),s1,s2);
        */
        int res=lcs(m,n,s1,s2,dp);

        System.out.println(res);
    }

    //Using Recursion
    /*static int lcs(int m,int n,String s1,String s2){
        if(m==0 ||n==0)
            return 0;
        else if(s1.charAt(m-1)==s2.charAt(n-1))
            return 1+lcs(m-1,n-1,s1,s2);
        return Math.max(lcs(m-1,n,s1,s2),lcs(m,n-1,s1,s2));
    }*/
    //Memorization
    /*
    static int lcs(int m,int n,String s1,String s2,int dp[][]){
        if(m==0 ||n==0)
            return 0;
        if(dp[m][n]!=-1)
            return dp[m][n];
        else{
         if(s1.charAt(m-1)==s2.charAt(n-1))
         return dp[m][n] =  1+lcs(m-1,n-1,s1,s2,dp);
        return dp[m][n]= Math.max(lcs(m-1,n,s1,s2,dp),lcs(m,n-1,s1,s2,dp));
        }
    }*/

    //Using Tabulation
    static int lcs(int m,int n,String s1,String s2,int dp[][]){
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
}
