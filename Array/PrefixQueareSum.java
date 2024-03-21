package Array;

import java.util.Scanner;

public class PrefixQueareSum {
    // static void printarray(int arr[]){
    //     for(int i=1;i<=arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }
    static int [] prefixe(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            arr[i] +=  arr[i-1];

        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the "+n+" elements in array");
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        // printarray(arr);
       // int prfx[] = prefixe(arr);

        System.out.println("enter the number of queary");
        int q = sc.nextInt();
        int prfx[] = prefixe(arr);


        while(q-- > 0){
            System.out.println("enter the range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prfx[r] - prfx[l-1];
            System.out.println("ans is :"+ ans);
        }

    }
}
