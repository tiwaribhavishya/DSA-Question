package Array;

import java.util.Scanner;

public class binarySearch {
    static int binarySearch(int arr[],int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){ // agar mid ke brabr x nai hai aur mid ki value x se choti hai to pointer right side move krega array
                low = mid+1;
            }
            else{
                high = mid-1; // nahi to left side krega jab x ki value mid se choti hai to
            }
        }
        //(yaha return 0 isliye hai kyuki uper wale algroithem me agar koi value match nai krti hai x se to return 0 krdnege jiska mtlb hoga array me x ki value nai padi huiye hai)
        return 0;
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
        int x = sc.nextInt();

        int result = binarySearch(arr, x);
        if(result == 0){
            System.out.println("search element not found in the array");
        }
        else{
            System.out.println("serach element found at location "+result);
        }

    }
}
