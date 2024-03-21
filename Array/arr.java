package Array;

import java.util.Scanner;

public class arr {
    static int[] makefreqArray(int arr[]){
        int frq[] = new int[100005];
        for(int i=0;i<arr.length;i++){
            frq[arr[i]]++;
        }
        return frq;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int frq[] = makefreqArray(arr);
        System.out.println("enter the querie");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("enter number to be serched");
            int x = sc.nextInt();
            if(frq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
}
