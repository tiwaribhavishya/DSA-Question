package DsaAssignment;                                          // Time Complexity O(log^n2)

                                                                // Space complexity O(1)
import java.util.Scanner;

public class UpperBoundBinarySearch {
    static int lastOccurence(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result = mid;
                low = mid+1;
            }
            else if(arr[mid]>target){
               
                high = mid-1;
            }
            else{
                
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" element in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the traget to search ");
        int target = sc.nextInt();
        int result = lastOccurence(arr, target);
        if(result == -1){
            System.out.println(result);
        }
        else{
            System.out.println("serach element found at location "+result);
        }

    }
}
