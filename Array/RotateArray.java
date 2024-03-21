package Array;
import java.util.Scanner;

public class RotateArray {

    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] rotate(int arr[],int k){
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j = 0;
        //second part of array
        for(int i=n-k;i<n;i++){
            ans[j++] = arr[i]; 
        }
        for(int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans ;
        
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
         System.out.println("enter the k value");
         int k = sc.nextInt();
          System.out.println("k = "+k);
          System.out.println("orignal arra is :");
          printarray(arr);
           System.out.println(" ");

          System.out.println("rotate array is :");
          printarray(rotate(arr,k));

        



    }
}
