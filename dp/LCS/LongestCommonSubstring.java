import java.util.*;
public class LongestCommonSubstring{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        lcs(s1.length(),s2.length(),s1,s2);

    }
    static void lcs(int m,int n,String s1,String s2){
       int  dp[][]=new int[m+1][n+1];
       for(int i=0; i<=m; i++)
            dp[i][0]=0;
       for(int i=0; i<=n; i++)
            dp[0][i]=0;
       for(int i=1; i<=m; i++){
           for(int j=1; j<=n; j++)
           {
               if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1]+1;
               else
                dp[i][j]=0;
           }
       } 
       for(int row[]:dp){
           Arrays.sort(row);
       }
       int res=0;
       for(int i=0;i<=m; i++)
        res=Math.max(dp[i][n],res);
    System.out.println(res);
    }

}