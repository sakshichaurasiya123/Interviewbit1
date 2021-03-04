import java.util.*;
public class MinimumDeletionRequiredToMakeStringPalindrome{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        
        String s1="";
        for(int i=s.length()-1; i>=0; i--)
            s1=s1+s.charAt(i);
        
        longestpalindrome(s.length(),s1.length(),s,s1);
    }
    static void longestpalindrome(int m,int n,String s1,String s2){
        int dp[][]=new int[m+1][n+1];
        for(int i=0; i<=m; i++)
            dp[i][0]=0;
        for(int i=0; i<=n; i++)
            dp[0][i]=0;
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(m-dp[m][n]);
    }
}