import java.util.*;
class HeapFunction{
    int size;
    int arr[]=new int[20];
    
    //Insert new Values in Heap
    public void insertNewValues(int val){
        arr[size]=val;
        int index=size;
        int parent=(index-1)/2;
        while(parent>=0 && arr[parent]<arr[index]){
            int t=arr[parent];
            arr[parent]=arr[index];
            arr[index]=t;
            t=parent;
            index=parent;
            parent=(t-1)/2;
        }
        size++;
    }

    //Max Heapify Heap
    public void maxHeapify(int index){
        int l,r;
        l=index*2+1;
        r=index*2+2;
        int largest=index;
        if(l<this.size && arr[largest]<arr[l])
            largest=l;
        if(r<this.size && arr[largest]<arr[r])
            largest=r;
        if(largest!=index){
            int t=arr[largest];
            arr[largest]=arr[index];
            arr[index]=arr[largest];
            maxHeapify(largest);
        }
        
    }

    //Remove Max
    public int removeMax(){
        int max=arr[0];
        arr[0]=arr[size-1];
        size --;
        maxHeapify(0);
        return max;
    }

// Get Maximum Element from heap
public int getMax(){
    return arr[0];
}

//Build MAX Heap
public void buildMaxHeap(int arr[]){
this.arr=arr;
this.size=arr.length;
for(int i=((size)/2-1); i>=0; i--)
    maxHeapify(i);
    }
}

public class MaxHeap_Internal_Implementation{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int arr[]={10,7,11,30};
        HeapFunction a=new HeapFunction();
        a.insertNewValues(arr[0]);
        a.insertNewValues(arr[1]);
        a.insertNewValues(arr[2]);
        a.insertNewValues(arr[3]);
        
        System.out.println("Maximum Element : "+a.getMax());
        System.out.println("Removed Max : "+a.removeMax());
        a.insertNewValues(15);
        System.out.println("Maximum Element : "+a.getMax());
        a.buildMaxHeap(arr);
       
    }
}