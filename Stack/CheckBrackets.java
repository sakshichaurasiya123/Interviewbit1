import java.util.Stack;

import java.util.*;

public class CheckBrackets{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character>st=new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            switch(ch){
                case '(':
                case '{':
                case '[':
                st.push(ch);
                break;
                case ')':
                case '}':
                case ']':
                if(st.size()!=0){
                    char c=st.pop();
                    if((ch==')' && c!='(' ) || (ch=='}' && c!='{') || (ch==']' && c!='[') )
                    {
                        System.out.println("Not Balenced");
                        return ;

                    }
                }
            }
        }
                if(st.size()!=0)
                {
                    System.out.println("Not Balenced");
                }
                else
                    System.out.println("Balenced");
                
         
    }
}