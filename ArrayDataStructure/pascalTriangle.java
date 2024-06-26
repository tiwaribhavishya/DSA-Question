package ArrayDataStructure;

import java.util.Scanner;

public class pascalTriangle {
    static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int ans[][] = new int[n][];
        for(int i=0;i<n;i++){
            //ith row has (i+1) columns
            ans[i] = new int[i+1];
            //1st and last elements is 1
            ans[i][0] = ans[i][i] = 1;
            for(int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the row and columns size");
        // int r= sc.nextInt();
        // int c = sc.nextInt();

        // int matrix[][] = new int[r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("input matrix is");
        // printmatrix(matrix);

        System.out.println();

        int n = sc.nextInt();
        int ans[][] = pascal(n);
        printmatrix(ans);
    }
}
