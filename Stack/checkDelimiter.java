import java.util.Stack;
import java.util.*;
public class checkDelimiter{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        Stack<Character>st=new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            switch(ch){
                case'(':
                case '{':
                case '[':
                st.push(ch);
                break;
                case ')':
                case '}':
                case ']':
                char ch1=st.peek();
                if(ch==')' && ch1!='(' ||
                ch=='}' && ch1!='{'
                || ch==']' && ch1!=']')
                    {
                        System.out.println("Not Balenced");
                       return;
                    }

                   else  if(ch==')' && ch1=='(' ||
                    ch=='}' && ch1=='{'
                    || ch==']' && ch1==']')
                       st.pop();
                    break;
            }
        }
        if(st.size()==0)
            System.out.println("Balenceed");
        else
            System.out.println("Not Balenced");

    }
}