package Array;

import java.util.Scanner;

public class prefixSum2DArrayOptimized {
   
    static void prefixSum(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        System.out.println("row wise prefix sum ");
        // calculate the row-wise prefix sum
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j] = arr[i][j]+arr[i][j-1];
            }
        }
        // calculate the column wise prefix sum
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                arr[i][j] += arr[i-1][j];
            }
        }
        
        
    }
    static int findSumMatrix(int[][] arr,int r1, int r2,int c1,int c2){
        int sum = 0;
        for(int i=r1;i<r2;i++){
            for(int j=c1;i<c2;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array for r and c");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter the "+r*c+" elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the value for r1,r2,andc1,c2 ");
        System.out.println("Enter the value of r1 cordinate ");
        int r1 = sc.nextInt();
        System.out.println("Enter the value of r2 cordinate ");
        int r2 = sc.nextInt();
        System.out.println("Enter the value of c1 cordinate ");
        int c1 = sc.nextInt();
        System.out.println("Enter the value of c2 cordinate ");
        int c2 = sc.nextInt();

    }
}
