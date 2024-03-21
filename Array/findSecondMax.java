package Array;

import java.util.Scanner;

public class findSecondMax {
    static int findMax(int arr[]){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int secondmax(int arr[]){
        int mx = findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == mx){
                arr[i] =  Integer.MIN_VALUE;
            }
        }
        int secondmax = findMax(arr);
        return secondmax;
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
        System.out.println("SecondMax number is : "+secondmax(arr));
        
        

    }
}
