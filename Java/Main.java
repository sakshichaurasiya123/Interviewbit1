import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import com.oracle.webservices.internal.api.databinding.WSDLResolver;
public class Main {
    public static void main(String arg[]){
        /*InputStreamReader reader=new InputStreamReader(System.in,StanderdCharsets);
        BufferedReader in=new BufferedReader(reader);
        String line;
        while((line=in.readLine))
        */
        Scanner in=new Scanner(System.in);
        Map <String,Float>map=new LinkedHashMap<String,Float>();
        map.put('PENNY',.01);
        map.put('NICKEL',.05);
        map.put('DIME',.10);
        map.put("QUARTER",.25);
        float pp=in.nextFloat();
        float ch=in.nextFloat();
        if(ch<pp)
            System.out.print("ERROR");
        if(ch==pp)
            System.out.println("ZERO");



    }

}