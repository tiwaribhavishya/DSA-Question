package DivideAndQunquer;

import java.util.Scanner;

public class MergeSort {
    // function to do the combine task in merge sort
    public static void Mergeprocedure(int arr[],int l,int mid ,int r){  // l - Lower index(i) // r - right index(r)
        int i,j,k;

        // size of the left and right subarray
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create left and right Subarray
        int[] lsubarray = new int[n1];
        int[] rsubarray = new int[n2];

        // copy the data into the left and right subarray
        for(i=0;i<n1;i++){
            lsubarray[i] = arr[l+i];
        }
        for(j=0;j<n2;j++){
            rsubarray[j] = arr[mid+1+j];
        }
        i = 0;
        j = 0;
        k = l;
        while(l<n1 && j<n2){
            if(lsubarray[i] <= rsubarray[j]){
                arr[k] = lsubarray[i];
                i++;
            }
            else{
                arr[k] = rsubarray[j];
                j = j+1;
            }
            k = k+1;
        }
        // copying all the remaining elements from the left subarray
        while(i<n1){
            arr[k] = lsubarray[i];
            i = i+1;
            k = k+1;

        }
        while(j<n2){
            arr[k] = rsubarray[j];
            j = j+1;
            k = k+1;
        }

    }

    // Function to do the merge sort
    public static void Mergesort(int arr[],int i,int j){
        if(i<j){
            // 1. Divide the array into two subproblems
            int mid = i+(j-i)/2;

            // 2. Conquer the Subproblems using recursion
            Mergesort(arr,i,mid);
            Mergesort(arr, mid+1, j);

            // 3. Combine the solution of all Subproblems
            Mergeprocedure(arr,i, mid, j);
        }
    }
    public static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("before sorting array is ");
        printarr(arr,n);

        Mergesort(arr,0,n-1);
        System.out.println("after sorting array is ");
        printarr(arr,n);
    }
}
