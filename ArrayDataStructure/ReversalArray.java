package ArrayDataStructure;

public class ReversalArray {
    public static void main(String[] args) {
        int arr[] = {2,4,8,10,12,14};
        int n = arr.length;
        int temp =0;

        for(int i=0;i<n/2;i++){
             temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println("reversal of an array is:");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
