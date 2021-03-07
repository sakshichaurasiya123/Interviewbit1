import java.util.*;
class Node{
     int data;
     Node left;
     Node right;
}
class TreeFunction{
    public Node createNewNode(int val){
        Node d=new Node();
        d.data=val;
        d.left=null;
        d.right=null;
        return d;
    }

    //Sum of All Node of Tree
    public int getSumofAllNoode(Node root){
        if(root==null)
            return 0;
        return root.data+getSumofAllNoode(root.left)+getSumofAllNoode(root.right);
    }

    //Get Difference between Even Odd Values
    public int getDifferenceEvenOdd(Node root){
        if(root==null)
            return 0;
        return root.data-getDifferenceEvenOdd(root.left)-getDifferenceEvenOdd(root.right);
    } 

    //Get Total Number of Nodes
     int getumNode(Node root){
         if(root==null)
            return 0;
        return 1+getumNode(root.left)+getumNode(root.right);
     }

     //Get Number of leaf Node
     public int getnumleafnode(Node root){
         if(root==null)
            return 0;
         if(root.left==null && root.right==null)
            return 1;
        return getnumleafnode(root.left)+getnumleafnode(root.right);
     }

     //Height of Tree
     public int getHeight(Node  root){
         if(root==null)
            return 0-1;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
     }

    //Pre Order
    public void preorder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //Post Order
    public void postorder(Node root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //In Order
    public void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //Print Elements at given Level 
    public void getElementAtgivenLevel(Node root, int level){
        if(root==null)
            return ;
        if(level==1){
        System.out.print(root.data+" ");
        return;
        }
        getElementAtgivenLevel(root.left, level-1);
        getElementAtgivenLevel(root.right, level-1);

    }
    //Print level order traversal Using Recursion
    public void levelOrderTraversal(Node root){
        if(root==null)
            return;
        int height=getHeight(root);
        for(int i=0; i<=height; i++){
            getElementAtgivenLevel(root, i+1);
            System.out.println();
        }
    }
    // Print Level Order Traversal using Queue
    public void levelordersuingqueue(Node root){
        if(root==null)
            return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node top=q.remove();
            System.out.print(top.data+" ");
            if(top.left!=null)
                q.add(top.left);

             if(top.right!=null)
                q.add(top.right);
        }
    }
        //Print Reverse level Order Traversal using recursion
        public void reverselevelorderusingrecursion(Node root){
            if(root==null)
                return;
            int height=getHeight(root);
            for(int i=height+1; i>0; i--){
                getElementAtgivenLevel(root, i);
                System.out.println();
            }        
        }
    
        //Print Reverse Level order element without using recursion
         public void reverseLevelOrderTraversalwithoutRecursion(Node root){
            if(root==null)
                return;
            Queue<Node>q=new LinkedList<>();
            Stack<Integer> st=new Stack<>();
            q.add(root);
            while(q.size()>0){
                Node top=q.remove();
                st.push(top.data);
                if(top.left!=null)
                    q.add(top.left);
                if(top.right!=null)
                    q.add(top.right);

            }
            while(st.size()!=0)
                System.out.print(st.pop()+" ");
        }

        //Level Order traversal line by line using one loop only
        public void levelordertraversalusingonleQueueOnly(Node root){
            if(root==null)
                return;
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            while(true){
                int count=q.size();
                if(count==0)
                    break;
                while(count>0){
                    Node top=q.remove();
                    System.out.print(top.data+" ");
                    if(top.left!=null)
                        q.add(top.left);
                    if(top.right!=null)
                        q.add(top.right);
                    count--;
                }
                System.out.println();
            }            
        }

        //Left View of Tree
        int maxleftlevel=1;
        public void leftview(Node root, int level){
            if(root==null)
                return;
            if(level>=maxleftlevel)
            {
                System.out.print(root.data+" ");
                maxleftlevel++;
            }
            leftview(root.left,level+1);
            leftview(root.right,level+1);
        }

        //Right View of Tree
        int maxrightlevel=1;
        public void rightView(Node root, int level){
            if(root==null)
                return;
            if(level>=maxrightlevel){
                System.out.print(root.data+" ");
                maxrightlevel++;
            }
            rightView(root.right, level+1);
            rightView(root.left, level+1);
        }
        
        //In-Order without Recursion
        public void inorderwithoutrecursion(Node root){
            if(root==null)
                return;
            Stack<Node>st=new Stack<Node>();
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            while(st.size()>0){
                Node t=st.pop();
                System.out.print(t.data+" ");
                if(t.right!=null){
                    Node tmp=t.right;
                    while(tmp!=null){
                        st.push(tmp);
                        tmp=tmp.left;
                    }
                }
            }
        }

        //Print Pre - Order Without Recursion
        public void preorderWithoutRecursion(Node root){
            if(root==null)
                return;
        Stack<Node>st=new Stack<Node>();
        st.push(root);
        while(st.size()>0){
                Node t=st.pop();
                System.out.print(t.data+" ");
                if(t.right!=null)
                    st.push(t.right);
                
                if(t.left!=null)
                    st.push(t.left);
            }
        }
        
        //Post Order Without Recursion();
        public void postorderwithoutrecursion(Node root){
            if(root==null)
                return;
            Stack<Node>s1=new Stack<Node>();
            Stack<Integer>s2=new Stack<Integer>();
            s1.push(root);
            while(s1.size()>0){
                Node t=s1.pop();
                s2.push(t.data);
                if(t.left!=null)
                    s1.push(t.left);
                if(t.right!=null)
                    s1.push(t.right);
            }
            while(s2.size()>0){
                System.out.print(s2.pop()+" ");
            }
        }

        //Get Mirror Image of Tree
        public Node mirror(Node root){
            if(root==null)
                return null;
            Node t=root.left;
            root.left=root.right;
            root.right=t;
            mirror(root.left);
            mirror(root.right);
            return root;
        }

        //Delete the Binary Tree
        public Node deleteBinaryTree(Node root){
            if(root==null)
                return null;
           root.left=deleteBinaryTree(root.left) ;
            root.right=deleteBinaryTree(root.right);
            System.out.println("Deleting Node : "+root.data);
            root=null;
            return root;
        }

        //Check whether twwo tree are identical of each oother or not
        public boolean  checkidentical(Node root1,Node root2){
            if(root1==null && root2==null)
                return true;

            if(root1==null || root2==null)
                    return false;
           
            return root1.data==root2.data && 
            checkidentical(root1.left, root2.left) &&
            checkidentical(root1.right, root2.right);
        }

        //Get Level of Given Node
        public void  getLevelOfGivenNode(Node root, int searchkey,int level){
            if(root==null)
                return;
            if(root.data==searchkey)
            {
                System.out.println("Level of Search Key : "+level);
                return;
            }
                getLevelOfGivenNode(root.left, searchkey, level+1);
                getLevelOfGivenNode(root.right, searchkey, level+1);
            
        }
}
public class Creation_of_Binary_Tree{
    public static void main(String a[]){
        TreeFunction tf=new TreeFunction();
        Node root=tf.createNewNode(2);
        root.left=tf.createNewNode(5);
        root.right=tf.createNewNode(7);
        root.left.left=tf.createNewNode(10);
        root.left.right=tf.createNewNode(13);
        root.right.left=tf.createNewNode(15);
        root.right.right=tf.createNewNode(18);

        //Inorder
        System.out.print("Inorder : ");
        tf.inorder(root);
        System.out.println();

        //Pre Order
        System.out.print("Pre Order : ");
        tf.preorder(root);
        System.out.println();

        //Post Order
        System.out.print("Post Order : ");
        tf.postorder(root);
        System.out.println();

        // Sum of All Node
        System.out.print("Sum of All Node : ");
        System.out.print(tf.getSumofAllNoode(root));
        System.out.println();

        
        //Get All No. of Nodes in a tree
        System.out.print("All Number of Nodes : "+tf.getumNode(root));
        System.out.println();

        //No of Leaf Node in Binary Tree
        System.out.print("No. of Left Node : "+tf.getnumleafnode(root));
        System.out.println();

        //Get Heght of Node
        System.out.println("Height of Root : "+tf.getHeight(root));

        //Print Elemets at given Level
        System.out.print("Element at Given Level : ");
        tf.getElementAtgivenLevel(root,3);
        System.out.println();
        System.out.println();

        //Print all elements of tree levelwise Using recursion
        System.out.println("All Elements of tree Levelwise Using Recursion -> ");
        tf.levelOrderTraversal(root);
        System.out.println();

        //Print Level Order Traversal usingq queue
        System.out.print("Level Order Traversal Using queue  ->");
        tf.levelordersuingqueue(root);
        System.out.println();
        System.out.println();


        //Level Order Traversal using line by line by using only one Queue only
        System.out.println("Level Order Traversal using only one Queue only  ->  ");
        tf.levelordertraversalusingonleQueueOnly(root);

        //Print Reverse Level Order Traersal Using Recursion
        System.out.println("Reverse Level Order Traversal Using Recursion ->  ");
        tf.reverselevelorderusingrecursion(root);
        System.out.println();

        //Print reverse Level Order Traersal without using recursion
        System.out.print("Reverse Level Order Traversal Withous using recursion  ->  ");
        tf.reverseLevelOrderTraversalwithoutRecursion(root);
        System.out.println();
        System.out.println();

        //Print Left view of Tree
        System.out.print("Left View of Tree ->  ");
        tf.leftview(root, 1);
        System.out.println();

        //Print Right view of Tree
        System.out.print("Right View of Tree ->  ");
        tf.rightView(root, 1);
        System.out.println();

        //In-order Without Recursion
        System.out.println();
        System.out.print("Inorder Of Tree without Recursion ->  ");
        tf.inorderwithoutrecursion(root);
        System.out.println();
        
        //Pre- Order Without Recursion
        System.out.print("Pre-Order Without Recursion -> ");
        tf.preorderWithoutRecursion(root);
        System.out.println();

        //Post Order Without Recursion
        System.out.print("Post  Order Witohut Recursion -> ");
        tf.postorderwithoutrecursion(root);
        System.out.println();
        System.out.println();

        //Get Mirror Image of Given Tree
       /* System.out.print("Mirror Image of given tree  -> ");
        tf.mirror(root);
        tf.inorder(root);
        System.out.println();
        System.out.println();
        */

        //Deleted Binary Tree
       /* Node k=tf.deleteBinaryTree(root);
        System.out.print("Binary Tree has deleted -> ");
        System.out.println(k);  */
        
        
        //Check Identical
        Node root1=tf.createNewNode(2);
        root1.left=tf.createNewNode(5);
        root1.right=tf.createNewNode(7);
        root1.left.left=tf.createNewNode(10);
        root1.left.right=tf.createNewNode(13);
        root1.right.left=tf.createNewNode(15);
        root1.right.right=tf.createNewNode(18);
        boolean b =tf.checkidentical(root, root1);
        System.out.print("Check whether two node are identical or not : "+b);
        System.out.println();
        System.out.println();        
        
        //Get level of given Node
        System.out.print("Level of Given Node : ");
        tf.getLevelOfGivenNode(root, 10, 1);
    }
}