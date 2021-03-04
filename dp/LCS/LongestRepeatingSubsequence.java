import java.util.*;
public class LongestRepeatingSubsequence{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String s1 =s ;//Copy string to other String
        repeating(s,s1);
    }
    public static void repeating(String s1,String s2){
        int n=s1.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=0; i<=n; i++)
        {
            dp[0][i]=0;
            dp[i][0]=0;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j)
                    dp[i][j]=dp[i-1][j-1]+1;
                    
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[n][n]);
    }
}