package Array;

import java.util.Scanner;

public class BinaryLowerBound {
    //function defination
    static int CheckLowerBound(int arr[] ,int target){
        int  low = 0;
        int high = arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                result = mid;
                // traverse the array left side
                high = mid-1;
            }
            else if(arr[mid]>target){ // agar mid==target ke nahi hai aur mid target se bada hai to tab ye condition aayegi mid ki value 
                // left side traverse hoga
                high = mid-1;
            }
            else{
                low = mid+1; // ye condition tab apply hogi jab uper ki dono condition false hojayegi aur arr[mid] ki value target se choti 
                // hogi tab right side array traverse hoga
            }
        }
        return result;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the element");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target element");
        int target = sc.nextInt();

        int result = CheckLowerBound(arr, target);

        if(result == -1){
            System.out.println("search element not found in the array");
        }
        else{
            System.out.println("serach element found at location "+result);
        }

    }
}
