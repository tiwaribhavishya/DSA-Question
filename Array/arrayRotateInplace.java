package Array;

import java.util.Scanner;

public class arrayRotateInplace {
    // static void printarray(int arr[]){
    //     int n = arr.length;
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    static void reverse(int arr[],int i,int j){
        while(i<j){
            i++;
            j--;
        }
    }
    static void rotateInPlace(int arr[],int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
        static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        
        System.out.println("enter the "+n+"elements");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         System.out.println("enter the k value");
         int k = sc.nextInt();
          System.out.println("k = "+k);
          System.out.println("orignal arra is :");
          printarray(arr);
           System.out.println(" ");

          rotateInPlace(arr,k);
          System.out.println("rotate array is :");
          rotateInPlace(arr,k);
          printarray(arr);
    }
}
