package Array;

import java.util.Scanner;

public class SortSquare {
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
    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static int[] squareSort(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans[] = new int[n];
        int k = 0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;

            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;

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
        int ans[] = squareSort(arr);
        System.out.println("sorted array is : ");
        reverse(ans);
        printarray(ans);

        

        
    }
}
