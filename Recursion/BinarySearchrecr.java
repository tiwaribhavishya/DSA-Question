
package Recursion;
import java.util.*;
public class BinarySearchrecr {
    static int Findingtarget(int arr[],int low ,int high,int target){
          int result = -1;
          while(low<=high){
            int mid = low+(high-low)/2;

            // condition1 match
            if(arr[mid]==target){
                return mid;
            }
            // condition2 right side
            else if(arr[mid]<target){
                return Findingtarget(arr, mid+1, high, target);
            }
            // condition3 left side
            else{
                return Findingtarget(arr, low, mid-1, target);
            }
          }
          
          
          return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the traget thst will you find");
        int target = sc.nextInt();

        int result = Findingtarget(arr,0,arr.length-1,target);
        if(result == -1){
            System.out.println(result);
        }
        else{
            System.out.println("target at position "+result);
        }
    }
}
