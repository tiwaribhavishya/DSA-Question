package Array;

import java.util.Scanner;

public class InsertionSort {
    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i,int j){
        int temp =0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void insertion(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp; 
                j--;
            }
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
        System.out.println("orignal array is ");
        printarray(arr);
        System.out.println(" ");
        System.out.println("sorted array is ");
        insertion(arr);
        printarray(arr);
    }
}
