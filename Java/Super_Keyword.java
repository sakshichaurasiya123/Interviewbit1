 class super1{
     int k=10;
 }
public  class Super_Keyword extends super1{
    int k=20;
    Super_Keyword(int k){
        System.out.println(k);
        System.out.println(this.k);
        System.out.println(super.k);
    }
    public static void main(String arg[]){
        Super_Keyword sk=new Super_Keyword(60);
    }
}