import javax.security.auth.kerberos.KerberosTicket;
import javax.swing.RootPaneContainer;
import java.util.*;
 class Node{
    int data;
     Node next;
    
}
class Linklist_Function{
   //Link List Creation
    Node insert(int i,Node head){
        if(head==null)
            return getNewNode(i);
        else{
            head.next=insert(i,head.next);
             
        }
        return head;
    }
    public Node getNewNode(int data){
        Node a=new Node();
        a.data=data;
        a.next=null;
        return a;
    }

    //insert at beginning
    public Node insert_at_beginning(int data,Node head){
        Node temp=new Node();
        temp.data=data;
        if(head==null)
            return temp;
        else{
            Node tt= head;
            temp.next=tt;
            return temp;
        }
    } //Print List
    public void print(Node head){
        if(head==null)
            return;
        System.out.print(head.data +" ");
        print(head.next);

        

    }

    //Insert at last
    public Node insert_at_last(int data,Node head){
        Node node=new Node();
        node.data=data;
        if(head==null)
            return  node;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.next=null;
        }
        return head;
    }

    //Insert at given position
    public void insert_at_given_position(int data,int pos,Node head){
        Node newnode=new Node();
        newnode.data=data;
        if(head==null && pos>1)
        {
            System.out.println("Invalid position");
            return;
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(pos>count+1){
            System.out.println("Invalid position");
            return;
        }
        temp=head;
        for(int i=1; i<pos-1; i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    //Delete first Node
    public Node delete_first(Node head){
        if(head==null)
            return null;
        else
            return head.next;
            
    }

    //Calculate size of link list 
    public int size(Node head){
        int i=1; 
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            i++;
        }
        return i;
    }
    public Node delete_last(Node head){
        if(head==null)
            return null;
        else{
            Node temp=head;
            while(temp.next.next!=null)
                temp=temp.next;
            temp.next=null;
            return head;
        }
    }
    public void delete_given_position(int pos,Node head){
        if(head==null && pos>=1){
            System.out.println("Invalid position");
            return;
        }
        
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        } 
        if(pos>count)
        {
            System.out.println("Invalid Position");
            return;
        }       
        temp=head;
        for(int i=1; i<pos-1 && temp.next.next!=null; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    
    }

    //Rotate link list clock wise by k times
    public Node rotateClockWise(int k,Node head){
        if(head==null || k<0)
            return null;
        int count=size(head);
         k=k%count;
        int i=1; 
        Node temp=head;
        while(i<count-k){
            temp=temp.next;
            i++;
        }
        Node tmp=temp.next;
        Node root= tmp;
        temp.next=null;

        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=head;
        return root;

    }
    
    //Rotate link list Anti clock wise by k times
    public Node rotateantiClockWise(int k,Node head){
        if(head==null || k<0)
            return null;
        int count=size(head);
         k=k%count;
        int i=1; 
        Node temp=head;
        while(i<k){
            temp=temp.next;
            i++;
        }
        Node tmp=temp.next;
        Node root= tmp;
        temp.next=null;

        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=head;
        return root;

    }

    //Reverse Link List Naive Solution
    public Node reverseNaive(Node head){
        if(head==null || head.next==null)
            return head;
        ArrayList<Integer>arr=new ArrayList<Integer>();
        Node temp=head;
        while(temp!=null)
        {
            arr.add(temp.data);
            temp=temp.next;
        }
        Node tt=head;
        while(arr.size()!=0){
            tt.data=arr.remove(arr.size()-1);
            tt=tt.next;
        }
        return head;
    }

    //Reverse list Iteratively
   public Node  reverseIteratively(Node head){
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        Node prev=null;
        Node next1=null;
        Node curr=head;
        while (curr!=null){
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        return prev;
   }

   //Reverse list recursively
   public Node reverserecursively(Node head,Node prev){
    if(head==null)
        return prev;  
    Node curr=head.next;
       head.next=prev;
      return  reverserecursively(curr, head);
   }

   //Get Middle Node of link list
   public int getMiddle(Node head){
       if(head==null)
        return 0;
        Node first=head;
        Node second=head;
        while(first!=null && first.next!=null){
           
            second=second.next;
            first=first.next.next;
            
        }
        return second.data;
   }

   //Sort List Naive Solution
   public Node sortnaive(Node head){
       if(head==null)
        return null;
        ArrayList<Integer>arr=new ArrayList<Integer>();
        Node temp=head;
        while(temp!=null)
        {
            arr.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(arr);
        Node tt=head;
        while(arr.size()!=0){
            tt.data=arr.remove(0);
            tt=tt.next;
        }
        return head;

   }
   
   //Sort using mergesort function
   public Node mergesort(Node head){
        if(head==null || head.next==null)
            return head;
        Node first=head;
        Node second=head.next;
        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;

        }
        Node middle=first;
        Node secondhalf=middle.next;
        middle.next=null;
        return merge(mergesort(head),mergesort(secondhalf));
   }
   public Node merge(Node A,Node B){
       Node temp=new Node();
       Node finallist=temp;
       while(A!=null && B!=null){
           if(A.data<B.data){
               temp.next=A;
               A=A.next;
           }
           else{
               temp.next=B;
               B=B.next;
           }
           temp=temp.next;
       }
       temp.next=(A==null)?B:A;
       return finallist.next;
   } 
   
   //Remove n node after m node
    public Node removennodeaftermnode(Node head, int n, int m){
        if(head==null)
            return null;
        int size=size(head);
        if(size<m)
            return head;
        Node temp=head;
        int i=1;
        while(i<m){
            temp=temp.next;
            i++;
        }
        Node tt=temp.next;
        int k=1;
        while(k<=n && tt.next!=null ){
            tt=tt.next;
            k++;
        }
        while (tt.next!=null){
            temp.next=tt;
            tt=tt.next;
            temp=temp.next;

        }
        
        return head;

    }
    //Detect loop in given link list
    public boolean detectloop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

}

public class Creation_link_list{
    
    public static void main(String arg[]){
        Node root=null;
        Linklist_Function a=new Linklist_Function();
        root=a.insert(12,root);
        root=a.insert(20,root);
        root=a.insert(25,root);
        System.out.print("Print List :  ");
        a.print(root);
        System.out.println();
        //Insert at beginning
        System.out.print("Insert at Beginning : ");
        root=a.insert_at_beginning(80,root);
        a.print(root);
        System.out.println();

        //Insert at Last
        System.out.print("Insert at Last : ");
        root=a.insert_at_last(100, root);
        a.print(root);
        System.out.println();

        //Insert at given position
        System.out.print("Insert at given position : ");
        a.insert_at_given_position(111,2,root);
        a.print(root);
        System.out.println();

        //Delete from front
        System.out.print("Delete first Node : ");
        root=root=a.delete_first(root);
        a.print(root);
        System.out.println();

        //Delete from last
        System.out.print("Delete last Node : ");
        root=root=a.delete_last(root);
        a.print(root);
        System.out.println();

        // Delete at given position
        System.out.print("Delete at given position : ");
        a.delete_given_position(2, root);
        a.print(root);
        System.out.println();

        // Rotate list clockwise by k times
        System.out.print("Rotate list by k times clockwise :  ");
        root=a.rotateClockWise(2, root);
        a.print(root);

        System.out.println();

        // Rotate list Anti clockwise by k times
        System.out.print("Rotate list by k times Anti clockwise :  ");
        root=a.rotateantiClockWise(2, root);
        a.print(root);
        
        
        System.out.println();

        // Rotate list Anti clockwise by k times
        System.out.print("Rotate list by k times Anti clockwise :  ");
        root=a.rotateantiClockWise(2, root);
        a.print(root);

        System.out.println();
        //Reverse LinkList Naive Solution
        System.out.print("Reverse list Naive Solution :  ");
       root= a.reverseNaive(root);
        a.print(root);
        


        System.out.println();
        //Reverse LinkList  Iteratively
        System.out.print("Reverse list Iteratively :  ");
        root =a.reverseIteratively(root);
        a.print(root);

        System.out.println();
        //Reverse LinkList Recursively
        System.out.print("Reverse list Recursively :  ");
        Node prev=null;
       root= a.reverserecursively(root,prev);
        a.print(root);

        //Get middle of link list
        System.out.println();
        System.out.print("Get Middle Node of List : ");
        int res=a.getMiddle(root);
        System.out.println(res);

        root=a.insert_at_beginning(250, root);
        System.out.print("Print Without Sorting : ");
        a.print(root);
        //Sort list Naive Solution
        System.out.println();
        System.out.print("Sort list Naive Solution : ");
        root =a.sortnaive(root);
        a.print(root);

        //Sort using merge Sort
        System.out.println();
        System.out.print("Sort list Using merge sort : ");
        root=a.mergesort(root);
        a.print(root);

        //Merge Two shorted List
        Node root1=null;
        root1=a.insert_at_beginning(5, root1);
        root1=a.insert_at_beginning(7, root1);
        root1=a.insert_at_beginning(4, root1);
        root1=a.insert_at_beginning(10, root1);
        System.out.println();
        System.out.print("Merge two sorted array : ");
        Node k=a.mergesort(root1);
        Node l=a.mergesort(root);
        Node finallist=a.merge(k,l);
        a.print(finallist);
        System.out.println();
        root=a.insert_at_beginning(51, root);
        root=a.insert_at_beginning(75, root);
        root=a.insert_at_beginning(46, root);
        root=a.insert_at_beginning(101, root);
        System.out.print("Print list before removing : ");
        a.print(root);
        
        System.out.println();
        //Remove n node after m node
        System.out.print("Remove n node after m node : ");
        Node ans=a.removennodeaftermnode(root,2,2);
        a.print(ans);
        System.out.println();
        //Detect Loop in given link list
        boolean b=a.detectloop(root);
        System.out.println("Loop Detection :  "+b);
    }
}
