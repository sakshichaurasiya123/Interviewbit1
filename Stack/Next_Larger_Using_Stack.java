import java.util.Stack;
import java.util.*;
public class Next_Larger_Using_Stack{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        Stack<Integer>st=new Stack<Integer>();
        st.push(arr[0]);
        ArrayList<Integer>ar=new ArrayList<Integer>();
        for(int i=1; i<n; i++){
            while(st.size()!=0 && st.peek()<arr[i]){
                ar.add(arr[i]);
                st.pop();
            }
            st.push(arr[i]);
        }
        while(st.size()!=0){
            ar.add(-1);
            st.pop();
        }
        System.out.println(ar);
    }
}