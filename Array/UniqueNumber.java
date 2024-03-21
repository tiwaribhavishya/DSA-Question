package Array;

import java.util.Scanner;

public class UniqueNumber {
    static int uniquenum(int arr[]){
        int n = arr.length;
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                     arr[i] = -1;
                     arr[j] = -1;
                    
                    
                }
                
            }
        }
         for(int i=0;i<n;i++){
             if(arr[i]>0){
                 ans = arr[i];
             }
     }
        return ans;
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

        System.out.println("in array unique number is : "+uniquenum(arr));
        
    }
}
