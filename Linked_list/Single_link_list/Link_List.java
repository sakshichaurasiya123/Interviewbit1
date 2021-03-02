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

    //Delete last node
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

    //Delete element from given position
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

   //Remove middle Node
   public Node removemiddle(Node head){
       if(head==null)
        return null;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;

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

   //Merge two lists
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

    //Find Length of loop from given link list
    public int lengthofloop(Node head){
        
        if(head==null)
            return -1;
     int length=0;
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data)
                break;
        }
        
        if(slow==fast)
        {
            while(slow.next!=fast){
                slow=slow.next;
                length++;
            }
            length++;
        }
        return length;

    }
    //Remove loop from link list
       public Node deleteloop(Node head){
        
        if(head==null)
            return null;
     int length=0;
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data)
                break;
        }
        
        if(slow==fast)
        {
            while(slow.next!=fast){
                slow=slow.next;
                
            }
            slow.next=null;
        }
        else{
            while(slow.next!=fast.next)
                slow=slow.next;
            fast.next=null;
        }
        return head;
    }

    //Check first half and second half of list , they are matching or not
    public boolean checkfirsthalfwithsecondhalf(Node head){
        if(head==null)
            return false;
        Node first=head;
        Node second=head;
        while(second.next!=null && second.next.next!=null){
            first=first.next;
            second=second.next.next;
        }
        Node secondhalf=first.next;
        Node firsthalf=head;
        while(secondhalf!=null){
            if(firsthalf.data!=secondhalf.data){
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true ;
    }

    //PairWise Swap Elements
    public Node pairwisawapelement(Node head){
        if(head==null || head.next==null)
            return head;
        Node temp=head;
        
        while(temp!=null && temp.next!=null){
            if(temp.next!=null){
                int tmp=temp.data;
                temp.data=temp.next.data;
                temp.next.data=tmp;
                temp=temp.next.next;
            }
        }
        return head;
    }

    //Remove Alternate Node 
    public Node deleteAlternate(Node head){
        if(head==null || head.next==null)
            return head;
        Node temp=head;
        while(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return head;
    }

    //Check two lists are identical or not
    public String twoListsareIdentical(Node head1,Node head2){
        if(head1==null ||head2==null)
            return "Both lists are identical";
        int len1=size(head1);
        int len2=size(head2);
        if(len1!=len2)
            return "Both lists are not equal";
        while(head1!=null && head2!=null){
            if(head1.data!=head2.data)
                return "Both lists are not identical";
            head1=head1.next;
            head2=head2.next;
        }
        return "Both lists are identical";
    }

    //Move last Node to front Node
    public Node movelasttofront(Node head){
        if(head==null)
            return head;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node tmp=temp.next;
        Node head1=tmp;
        temp.next=null;
        while(tmp.next!=null)
            tmp=tmp.next;
        tmp.next=head;
        return head1;
    }

    //Remove node which has greater  value of its right side
    public Node removenodewitchhasmaxvalueinitsrightside(Node head){
        if(head==null || head.next==null)
            return head;
        Node reverse=reverseIteratively(head);
        
        Node tmp=reverse;
        int max=tmp.data;
        while(tmp.next!=null){
        if(tmp.next.data>max)
        {
            max=tmp.next.data;
            tmp=tmp.next;
        }
        else{
            tmp.next=tmp.next.next;
        }
    }
    Node res =reverseIteratively(reverse);
    return res;

    }

    //Swap Nodes of given values without swapping data
    public Node swapTwoNodewithoutSwappingData(Node head,int a,int b){
        if(head==null || head.next==null)
            return head;
        Node temp= null;
        Node prev1 = null;
        Node prev2=null;
        Node t1=null;
        Node t2=null;
        temp=head;
        while(temp!=null){
            if(temp.data==a)
            {
                t1=temp;
                break;
            }
            prev1=temp;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data==b){
                t2=temp;
                break;
            }
            prev2=temp;
            temp=temp.next;
        }
        if(t1==null || t2==null)
            return head;
        if(prev1!=null)
            prev1.next=t2;
        else
            head=t2;
        
        if(prev2!=null)
            prev2.next=t1;
        else
            head=t2;
        Node tmp=t1.next;
        t1.next=t2.next;
        t2.next=tmp;
        return head;
    }

    //Reverse List in a group of k size
    public Node reverseInKsizeGroup(Node head,int k){
        if(head==null)
            return null;
        Node next1=null;
        Node prev=null;
        int i=1;
        Node temp=head;
        while(temp!=null && i<=k){
            next1=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next1;
            i++;
        }
        if(next1!=null)
            head.next=reverseInKsizeGroup(next1,k);
        return prev;
        
    }

    //Reverse List Alternatively in a group of k size
    public Node reverseAlternativelyGropuOfKsize(Node head,int k){
        if(k<=1 || head==null || head.next==null)
            return head;
        Node temp=head;
        Node prev=null;
        Node next1=null;
        int i=1;
        while(temp!=null && i<k){
            next1=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next1;
            i++;
        }
        i=1;
        if(next1!=null){
            head.next=next1;
            temp=next1;
            
            while(temp!=null && i<k){
                temp=temp.next;
                i++;
            }
        if(temp!=null)
            temp.next=reverseAlternativelyGropuOfKsize(temp.next,k);
        }
            return prev;
    }

}

// Main Driver Code
public class Link_List{

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
        System.out.println();

        //Insert at Last
        System.out.print("Insert at Last : ");
        root=a.insert_at_last(100, root);
        a.print(root);
        System.out.println();

        System.out.println();
        //Insert at given position
        System.out.print("Insert at given position : ");
        a.insert_at_given_position(111,2,root);
        a.print(root);
        System.out.println();
        System.out.println();

        //Delete from front
        System.out.print("Delete first Node : ");
        root=root=a.delete_first(root);
        a.print(root);
        System.out.println();
        System.out.println();

        //Delete from last
        System.out.print("Delete last Node : ");
        root=root=a.delete_last(root);
        a.print(root);
        System.out.println();
        System.out.println();

        // Delete at given position
        System.out.print("Delete at given position : ");
        a.delete_given_position(2, root);
        a.print(root);
        System.out.println();
        System.out.println();

        // Rotate list clockwise by k times
        System.out.print("Rotate list by k times clockwise :  ");
        root=a.rotateClockWise(2, root);
        a.print(root);

        System.out.println();
        System.out.println();

        // Rotate list Anti clockwise by k times
        System.out.print("Rotate list by k times Anti clockwise :  ");
        root=a.rotateantiClockWise(2, root);
        a.print(root);
        System.out.println();
        System.out.println();

        // Rotate list Anti clockwise by k times
        System.out.print("Rotate list by k times Anti clockwise :  ");
        root=a.rotateantiClockWise(2, root);
        a.print(root);
        System.out.println();
        System.out.println();
        //Reverse LinkList Naive Solution
        System.out.print("Reverse list Naive Solution :  ");
       root= a.reverseNaive(root);
        a.print(root);
        System.out.println();
        System.out.println();
        //Reverse LinkList  Iteratively
        System.out.print("Reverse list Iteratively :  ");
        root =a.reverseIteratively(root);
        a.print(root);
        System.out.println();
        System.out.println();
        //Reverse LinkList Recursively
        System.out.print("Reverse list Recursively :  ");
        Node prev=null;
       root= a.reverserecursively(root,prev);
        a.print(root);
        System.out.println();
        //Get middle of link list
        System.out.println();
        System.out.print("Get Middle Node of List : ");
        int res=a.getMiddle(root);
        System.out.println(res);
        System.out.println();
        root=a.insert_at_beginning(250, root);
        System.out.print("Print Without Sorting : ");
        a.print(root);
        //Sort list Naive Solution
        System.out.println();
        System.out.println();
        System.out.print("Sort list Naive Solution : ");
        root =a.sortnaive(root);
        a.print(root);
        System.out.println();
        //Sort using merge Sort
        System.out.println();
        System.out.print("Sort list Using merge sort : ");
        root=a.mergesort(root);
        a.print(root);
        System.out.println();

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
        System.out.println();
        root=a.insert_at_beginning(51, root);
        root=a.insert_at_beginning(75, root);
        root=a.insert_at_beginning(46, root);
        root=a.insert_at_beginning(101, root);
        System.out.print("Print list before removing N node after m node : ");
        a.print(root);
        System.out.println();
        //Remove n node after m node
        System.out.print("Remove n node after m node : ");
        Node ans=a.removennodeaftermnode(root,2,2);
        a.print(ans);
        System.out.println();
        System.out.println();
        //Detect Loop in given link list
        int kl=a.size(root);
        Node temp=root;
        int i=1;
        while(temp.next!=null && i<kl){
            temp=temp.next;
            i++;
        }
        temp.next=root.next;
        boolean b=a.detectloop(root);
        System.out.println("Loop Detection :  "+b);
        
        //Find length of loop
        System.out.println();
        int len=a.lengthofloop(root);
        System.out.println("Length of loop : "+len);
        System.out.println();
        //Remove loop
        root=a.deleteloop(root);
        System.out.print("List After Removed loop : ");
        a.print(root);
        System.out.println();
         b=a.detectloop(root);
        System.out.println("Loop Detection :  "+b);
        System.out.println();
        //Remove middle Node from list
        System.out.print("List Before removing middle : ");
        a.print(root);
        System.out.println();
        root=a.removemiddle(root);
        System.out.print("List after Removing middle node : ");
        a.print(root);
        System.out.println();
        System.out.println();
        //Check if first half match with secondhalf
        System.out.print("List before checking : ");
        a.print(root);
        System.out.println();
        boolean r=a.checkfirsthalfwithsecondhalf(root);
        System.out.println("After checking first half of list is match with second half : "+r);
        System.out.println();
        //Remove node which has max value in its right side 
        Node root3=null;
        root3=a.insert(12, root3);
        root3=a.insert(99, root3);
        root3=a.insert(8, root3);
        root3=a.insert(39, root3);
        root3=a.insert(5, root3);
        //Swap Element Pairwise
        root3=a.pairwisawapelement(root3);
        System.out.print("Swap element pairwise : ");
        a.print(root3);
        System.out.println();
        System.out.println();
        
        System.out.print("Before Removing  Node : ");
        a.print(root3);
        System.out.println();
        //System.out.println();
        // Remove node which has max value in its right side
        root3= a.removenodewitchhasmaxvalueinitsrightside(root3);
        System.out.print("Removed node with has max value in its right side : ");
        a.print(root3);
        System.out.println();
        System.out.println();
        // Check two lists are identical or not
        String x= a.twoListsareIdentical(root,root1);
        System.out.println(x);
        System.out.println();
        //Delete Alternate Node from link list
        System.out.print("List Before Deleted Alternet Node : ");
        a.print(root);
        System.out.println();
        root=a.deleteAlternate(root);
        System.out.print("List After Deleted alternet node : ");
        a.print(root);
        System.out.println();

        //Move Last Node to Front Node
        System.out.println();
        System.out.print("List before moving last node to front node : ");
        a.print(root1);
        System.out.println();
        root1=a.movelasttofront(root1);
        System.out.print("Moved Last Node to Front Node : ");
        a.print(root1);

        // nodes of gn value without wapping data
        System.out.println();
        System.out.println();
        Node root4=null;
        root4=a.insert(12, root4);
        root4=a.insert(99, root4);
        root4=a.insert(8, root4);
        root4=a.insert(39, root4);
        root4=a.insert(5, root4);
        System.out.print("List Before Swapping Values : ");
        a.print(root4);
        System.out.println();
        root4 =a.swapTwoNodewithoutSwappingData(root4,99,39);
        System.out.print("List After Swapping the values : ");
        a.print(root4);
        System.out.println();
        System.out.println();
        //Reverse List in a group of K size
        System.out.print("List Before Reverse in a group : ");
        a.print(root4);
        System.out.println();
        root4=a.reverseInKsizeGroup(root4,3);
        System.out.print("List After Reverse list in a group of k size : ");
        a.print(root4);
        System.out.println();
        System.out.println();

        //Reverse list alternatively in a group of K size
        System.out.print("List Before Reversing ALternatively in a group of K size : ");
        a.print(root4);
        System.out.println();
        System.out.print("List After Reversing Alternatively in a group of K size : ");
        root4=a.reverseAlternativelyGropuOfKsize(root4,2);
        a.print(root4);
        System.out.println();

        





    }
}