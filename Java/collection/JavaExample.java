import java.util.*;
import java.io.*;
public class JavaExample{
	public static void main(String arg[]){
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(3);
		ar.add(4);
		System.out.print(ar.size());
		ar.add(10);
		ar.add(12);
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);
		Iterator it = ar.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next()+" ");
		}
	}
	
}