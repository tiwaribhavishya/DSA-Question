package ArrayDataStructure;

import java.util.Scanner;

public class t {
    

    static int[][] findTranspose(int matrix[][],int r, int c){
        int ans[][] = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
              ans[i][j] =  matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("inter the size of row and column");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        int totalmatrix = r*c;
        System.out.println("enter the "+totalmatrix+" elements");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose matrix");
        // int ans[][] = findTranspose(matrix, r, c);
        // System.out.println(ans);
        
     int ans[][] = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
              ans[i][j] =  matrix[j][i];
            }
        }
        System.out.println(ans);
    }
}
