public class Sum_of_n_natural_Number{
    public static void main(String arg[]){
        int n=5;
        int res=sum(n);
        System.out.println(res);
    }
    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
}