package DsaAssignment;

import java.util.Scanner;

public class FindTragetLinerly {
    static void findTraget(int arr[],int target){
        int n = arr.length;
        int idx = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                idx = i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("element nor present in the array");
        }else{
            System.out.println("element present at position "+idx);
        }
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

        findTraget(arr, target);

    }
}
