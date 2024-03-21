package ArrayDataStructure;

// class reverseTheArray{
    
//     public static void reverse(int arr[]){
//        // int arr[] = { 1,2,3,2,1};
//         for(int i=arr.length-1;i>=0;i--){
//            int newarr[]  = arr[];
//         }
//     }
// }

public class PalindromeArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
