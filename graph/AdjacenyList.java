import java.util.*;
public class AdjacencyList{
static class Edge{
    int src;
    int des;
    int nbr;
    Edge(int src,int nbr,int des){
        this.src=src;
        this.nbr=nbr;
        this.des=des;
    }
}
public static void main(String arg[]){
    Scanner in=new Scanner(System.in);
    int vces=in.nextInt();
    ArrayList<Edge>[]graph=new ArrayList<Edge>[vces];
    for(int i=0; i<=vces; i++)
            graph[i]new ArrayList<>();

    int edge=in.nextInt();
    for(int i=0; i<edge; i++){
        int v1=in.nextInt();
        int v2=in.nextInt();
        int wt=in.nextInt();
        graph[v1].add(new Edge(v1,v2,wt));
        graph[v2].add(new Edge(v2,v1,wt));
    }
    int src=in.nextInt();
    int des=in.nextInt();

 }
 public static boolean hashpath(ArrayList<Edge>[]graph,int src,int des){
     if(src==des){
         return true;
     }
     for(ArrayList<Edge>e:graph[src]){
         boolean hashPath=hashpath(graph, e.nbr, des);
         if(hashPath==true)
                return true;

     }
     return false;
 }

}