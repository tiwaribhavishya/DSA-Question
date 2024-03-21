package Array;

import java.util.Scanner;


public class sortArray2 {
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
    static void sortzerosAndOnes(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
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
        System.out.println("orignal array is : ");
        printarray(arr);
        System.out.println("sort array is :");
        sortzerosAndOnes(arr);
        printarray(arr);
    }
}
