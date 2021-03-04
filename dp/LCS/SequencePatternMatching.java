import java.util.*;
public class SequencePatternMatching{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String pattern=in.next();
        String text=in.next();
        patternmatching(pattern,text);
    }
    static void patternmatching(String patt,String text){
        int n=patt.length();
        int dp[][]=new int[n+1][text.length()+1];
        for(int i=0; i<=n; i++)
            dp[i][0]=0;
        for(int j=0; j<=text.length(); j++)
            dp[0][j]=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=text.length(); j++){
                if(patt.charAt(i-1)==text.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        if(dp[n][text.length()]==n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}