import java.util.*;
class Node{
    Node left;
    Node right;
    int data;
    int height;
}
class Function{
    public Node createNewNode(int d){
        Node t=new Node();
        t.data=d;
        t.left=null;
        t.right=null;
        return t;      
    }

    //Left View Of Tree
    int maxleftlevel=1;
    public void leftview(Node root,int level){
        if(root==null)
            return;
        if(level>=maxleftlevel){
            System.out.print(root.data+" ");
            maxleftlevel++;
        }
        leftview(root.left,level+1);
        leftview(root.right, level+1);
    }

    //Right View Of Tree
    int maxrightlevel=1;
    public void rightView(Node root,int level){
        if(root==null)
            return;
        if(level>=maxrightlevel){
            System.out.print(root.data+" ");
            maxrightlevel++;
        }
        rightView(root.right, level+1);
        rightView(root.left, level+1);
        
    }

    //Top View 
    public void topView(Node root){
        if(root==null)
            return;
        TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
        Queue<Node>q=new LinkedList<Node>();
        q.add(root);
        while(q.size()>0){
            Node temp=q.remove();
            int hd=temp.height;
            if(map.get(hd)==null)
                map.put(hd,temp.data);
            if(temp.left!=null)
            {
                temp.left.height=hd-1;
                q.add(temp.left);
            }
            if(temp.right!=null){
                temp.right.height=hd+1;
                q.add(temp.right);
            }
        }
        System.out.println(map.values());
    }

    //Bottom View
    public void bottomView(Node root){
        if(root==null)
            return;
        TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            Node temp=q.remove();
            int hd=temp.height;
            map.put(hd,temp.data);
            if(temp.left!=null)


        }
    }

}

public class All_Type_Views {
    public static void main(String arg[]){
        Function f=new Function();
        Node root=f.createNewNode(10);
        root.left=f.createNewNode(20);
        root.right=f.createNewNode(30);
        root.right.left=f.createNewNode(40);
        root.right.right=f.createNewNode(50);
        root.right.right.left=f.createNewNode(15);

        //Left View of tree
        System.out.print("Left View ->  ");
        f.leftview(root,1);
        System.out.println();

        //Right View Of Tree
        System.out.print("Right VIew ->  ");
        f.rightView(root, 1);
        System.out.println();

        // Top VIew
        System.out.print("Top View -> ");
        f.topView(root);
        System.out.println();
    }

}