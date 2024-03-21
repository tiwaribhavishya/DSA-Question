package Array;

import java.util.Scanner;

public class sortAnArray {
    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZerosAndOnes(int arr[]){
        int n = arr.length;
        int zeros = 0;
        // count zeros
        for(int i=0; i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }

        // 0 to zeros-1:0 and zeros to n-1 ; 1
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
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
        printarray(arr);
        sortZerosAndOnes(arr);

        System.out.println("sorted array ");
        printarray(arr);
    }
}
