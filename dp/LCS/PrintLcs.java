import java.util.*;
public class PrintLcs{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        printlcs(s1.length(),s2.length(),s1,s2);
    }
    static void printlcs(int m,int n,String s1,String s2){
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
        /*for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }*/
        StringBuffer br=new StringBuffer();
        int i=m,j=n;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                br.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i][j-1]>dp[i-1][j])
                    j--;
                else
                    i--;
            }
        }
        br.reverse();
        System.out.println(br);
    }

}