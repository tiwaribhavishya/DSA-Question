package Array;

import java.util.Scanner;

public class prefixSum {
    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    // prefix sum using with extra space
    static int[] makePrixSum(int arr[]){
        int n = arr.length;
        int prf[] = new int[n];
        prf[0] = arr[0];
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return prf;
    }
    // prefix sum whithout using extra space 
    static void prefix(int arr[]){
        int n = arr.length;
        arr[0] = arr[0];
        for(int i=1;i<n;i++){
            arr[i] = arr[i] + arr[i-1];

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
        System.out.println("Orignal array is :");
        printarray(arr);
        System.out.println("prefix sum is : ");
        int prf[] = makePrixSum(arr);
        printarray(prf);
        System.out.println("withous using extra space prefixSum Is : ");
        prefix(arr);
        printarray(arr);
    }
}
