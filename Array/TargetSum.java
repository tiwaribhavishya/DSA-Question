package Array;

import java.util.Scanner;



public class TargetSum {
    static int pairOFSum(int arr[],int target){
      int n = arr.length;
      int ans = 0;

      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                ans++;
            }
        }
      }
      return ans;
}
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the "+n+" elemts in the array");
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("enter the traget sum");
        int target = sc.nextInt();
        System.out.println("target is"+target);

        System.out.println("target sum in this array is : "+pairOFSum(arr, target));

    }
}
