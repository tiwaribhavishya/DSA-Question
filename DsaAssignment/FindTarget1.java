package DsaAssignment;
import java.util.Scanner;
public class FindTarget1 {
    static int findtarget(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid  = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = high+1;
            }
            else{
                high = low-1;
            }
        }
        return 0;
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

        int result = findtarget(arr, target);
        if(result == 0){
            System.out.println("Search Element is not present in the array");
        }else{
            System.err.println("Search element present at position : "+result);
        }
    }
}
