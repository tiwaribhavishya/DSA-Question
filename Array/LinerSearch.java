package Array;

import java.util.Scanner;

public class LinerSearch {
    static void targetserach(int arr[],int x){
        int n = arr.length;
        int idx = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
               // System.out.print(arr[i]);
                idx = i;
                break;
            }
        }
        if(idx == -1){
            System.out.println("search element not found in the array");
        }
        else{
            System.out.println("serach element found at location "+idx);
        }
        
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

       
        targetserach(arr, x);
    }
}
