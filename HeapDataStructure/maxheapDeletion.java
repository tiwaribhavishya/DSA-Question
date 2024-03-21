package DSA.HeapDataStructure;

public class maxheapDeletion {
    static int n = 0;
    static int heap[] = new int[100];
    public static void swap(int a,int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp ;
    }
    public static void maxHeap(int x){
        n++;
        heap[n-1] = x;
        int i = n-1;
        while(i>0 && heap[(i-1)/2] < heap[i]){
            swap((i-1)/2, i);
            i = (i-1)/2;
        }
    }
    public static void printarr(){
        for(int i=0;i<n;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static int deletion(){
        int delete = heap[0];
        heap[0] = heap[n-1];
        n--;
        int i = 0;
        while(i<=(n-1)/2){
            if(heap[2*i+1]>heap[i]||heap[2*i+2]>heap[i]){
                int max = (heap[2*i+1]>heap[2*i+2]) ? 2*i+1 : 2*i+2;
                swap(i, max);
                i = max; // 
            }
        } 
        return delete;
    }
    public static void main(String[] args) {
        maxHeap(50);
        maxHeap(30);
        maxHeap(40);
        maxHeap(10);
        maxHeap(5);
        maxHeap(20);
        maxHeap(30);
        maxHeap(60);
       // printarr();
        deletion();
        printarr();
    }
}
