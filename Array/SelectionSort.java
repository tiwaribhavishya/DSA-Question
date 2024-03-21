package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selectionsort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            // min_idx taking a minimum elemnt of every iteration
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[j-1]){
                   
                    min_idx = j; // j ki every minimum value jyo min_idx se choti hogi usse wo change hojayega
                }
            }
            if(min_idx != i){
                int temp = arr[min_idx];
               arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("inter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the "+n+" elements in the array");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printarray(arr);
        System.out.println(" ");
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
