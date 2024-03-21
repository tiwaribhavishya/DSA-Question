package Array;

import java.util.Scanner;

public class prefixSum2DArray {
    static int prefixSum(int arr[][],int r1,int r2,int c1,int c2){
        int sum = 0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
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

        int sum = prefixSum(arr, r1, r2, c1, c2);
        System.out.println("total sum is target = "+sum);
    }
}
