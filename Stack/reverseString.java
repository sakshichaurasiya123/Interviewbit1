import java.util.Stack;
import java.util.*;
public class reverseString{
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        String s="Sakshi";
        Stack<Character> s1=new Stack<Character> ();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            s1.push(c);
        }
        String result="";
        while(s1.size()!=0)
            result=result+s1.pop();
        System.out.println(result);
    }
} 
/*
import java.util.Stack;

class StackImpl {
  
  public String reverseString(String s) {
    Stack<Character> st = new Stack<Character>();
    String reversedString = "";
    
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      st.push(c);
    }

    while (!st.isEmpty()) {
      reversedString = reversedString + st.pop();
    }

    return reversedString;
  }

}

public class reverseString{

  public static void main(String[] args) {
    StackImpl a = new StackImpl();
    
    String s = "Coding Simplified";
    System.out.println(a.reverseString(s));
  }

}
*/