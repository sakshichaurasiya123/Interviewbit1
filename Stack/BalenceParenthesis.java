import java.util.*;
import java.util.Stack;
public class BalenceParenthesis{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        Stack<Character>st=new Stack<Character>();
        String s=in.next();
       
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if((c=='(')|| (c=='{') ||(c=='['))
                st.push(c);
                else 
                {
                if(st.size()==0 && ((c!='(')|| (c!='{') ||(c!='[')) )
                {
                    System.out.println("Not balenced");
                    return;
                }
                else if(check(c,st.peek())==false)
                {
                    System.out.println("Not balenced");
                    return;
                }
                
                else if(check(c,st.peek())==true)
                    st.pop();
            }
        }
            if(st.size()==0)
                System.out.println("Balenced");
            else
                System.out.println("Not Balenced ");
        }

    
    static boolean check(char a,char b){
        if((a==')'&& b=='(') ||
            (a=='}' && b=='{') ||
            (a==']' && b=='[' ))
                return true;
        else
            return false;
    }
}