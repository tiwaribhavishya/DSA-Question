package DSA.HeapDataStructure;

public class insertin {
    static int n = 0;
    static int heap[] = new int[100];
    public static void swap(int a,int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
    public static void minHeap(int x){
        n++;
        heap[n-1] = x;
        int i = n-1;
        while(i>0 && heap[(i-1)/2] > heap[i]){
            swap((i-1)/2, i);
            i = (i-1)/2;
        }
    }
    public static void printheap(){
        for(int i=0;i<n;i++){
            System.out.println(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
        minHeap(50);
        minHeap(30);
        minHeap(40);
        minHeap(10);
        minHeap(5);
        minHeap(30);
        minHeap(20);
        minHeap(4);
        printheap();
    }
}
