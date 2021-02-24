import java.util.*;
public class bit_operation{
public static  int addition(int a,int b){
    /* int res=a|b;
    return res; */
    int carry;
    while(b!=0){
        carry=a&b;
        a=a^b;
        b=carry<<1;
    }
    return a;
}
// Substruction
public static int substruction(int a,int b){
    int borrow;
    while(b!=0){
        borrow=(~a)&b;
       // borrow=a&b;
        a=a^b;
        b=borrow<<1;
    }
    return a;
}

//static int findithsetbit
static int checkithbit(int a,int i){
    return a&(1<<i);
}

// clear ith bit
static int clearithbit(int a,int i){
    int res=~(1<<i);
    //res=(~res);
    return a&res;

}

//Set ith bit
static int setithbit(int a,int i){
    return a|(1<<i);
}

// Convert A to B
static int findbitconvertatob(int a,int b){
    int res=a^b;
    int count=0;
    while(res!=0){
        count++;
        res=res&(res-1);

    }
    return count;
}

public static void main(String arg[]){
    Scanner in=new Scanner(System.in);
    //int a=in.nextInt();
   // int b=in.nextInt();
    System.out.println("Addition : "+addition(12,4));
    System.out.println("Substruction : "+substruction(12,3));
    System.out.println("Check ith bit : "+checkithbit(12,0));
    System.out.println("Clear ith bit : "+clearithbit(12, 3));
    System.out.println("Set ith bit : "+setithbit(13,1));
    System.out.println("Convert a to b : "+findbitconvertatob(20,18));
}
}