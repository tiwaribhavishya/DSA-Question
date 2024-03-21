package Array;

import java.util.Scanner;

public class QuerieArray {
    static int[] makefreqArray(int arr[]){
        int freq [] = new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the "+n+"Elements in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // querioes se paihle frequency array ko call krlena hai
        int freq[] = makefreqArray(arr);
        System.out.println("enter the number of queries");
        int quer = sc.nextInt();

        while(quer>0){
            System.out.println("enter number to be serched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");

            }else{
                System.out.println("no");
            }
            quer--;
        }
    }
}
