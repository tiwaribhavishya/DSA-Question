
package Array;

import java.util.Scanner;

public class sorttry {
    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortZerosAndOnes(int arr[]){
        int n= arr.length;
        int zeros = 0;
        
        // Firstly count the zeros
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        System.out.println("total zeros is "+zeros);
        // 0 to zeros-1 tak 0 put krna hai phir zeros to n-1 tak one put krna hai
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the zeros and one "+n+" times");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("input array is :");
        printarray(arr);
        System.out.println("sort arrai is : ");
        sortZerosAndOnes(arr);
        printarray(arr);

    }
}
