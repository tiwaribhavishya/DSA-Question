package DsaAssignment;

import java.util.Scanner;

public class CountDuplicate {
    static int Findtarget(int arr[],int target){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" element in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target to search ");
        int target = sc.nextInt();

        int result = Findtarget(arr, target);
        if(result==0){
            System.out.println("Current Element not found in the array");
        }
        else{ 
            System.out.println("target "+target+" occure "+result+" times");
        }
    }
}
