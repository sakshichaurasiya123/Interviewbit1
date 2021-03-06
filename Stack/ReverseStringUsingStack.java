import java.util.*;
import java.util.Stack;
public class ReverseStringUsingStack{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        reverse(s);
    }
    public static void reverse(String s){
        Stack<Character>st=new Stack<>();
        String reverseString="";
        for(int i=0; i<s.length(); i++)
            st.push(s.charAt(i));

        while(st.size()!=0)
            reverseString =reverseString+st.pop();
        System.out.println("Reverse String : "+reverseString);
        }
}