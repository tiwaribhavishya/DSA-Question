package Recursion;

import java.util.Scanner;

public class Search2DMatrix {
    static boolean findingtarget(int arr[][],int n,int m,int target){
        n = arr.length;
        m = arr[0].length;
        int low = 0;
        int high = n*m-1;
        int mididx = 0;
        int midele = 0;
        while(low<=high){
            mididx  = low+(high-low)/2;
            int rowidx = mididx/n;
            int colidx = mididx%n;
            midele = arr[rowidx][colidx];
            if(target == midele){
                return true;
            }
            else if(target<midele){
                high = mididx-1;
            }
            else{
                low = mididx+1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n and m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the "+m*n+" element in the array");
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] =  sc.nextInt();
            }
        }
        System.out.println("Enter the traget element");
        int target = sc.nextInt();

        boolean result = findingtarget(arr, n, m, target);
        System.out.println("target is "+result);


    }
}
