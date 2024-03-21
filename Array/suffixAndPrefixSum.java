package Array;

import java.util.Scanner;

public class suffixAndPrefixSum {
static int finadTotalSum(int arr[]){
    int totalSum = 0;
    for(int i=0;i<arr.length;i++){
        totalSum += arr[i];
    }
    return totalSum;
}
static boolean equalSumPartition(int arr[]){
    int totalSum = finadTotalSum(arr);
    int prefixSum = 0;
    for(int i=0;i<arr.length;i++){
        prefixSum += arr[i];
        int suffixSum = totalSum-prefixSum;
        if(suffixSum==prefixSum){
            return true;
        }
    }
    return false;
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
        equalSumPartition(arr);
        System.out.println("equal partition possible :"+equalSumPartition(arr));
        
    }
}
