package Recursion;

import java.util.Scanner;

public class NumberOfStairs {
    static int CountWays(int n){
        int result = 0;
        if(n==0||n==1){
            return n;
        }
        else{
            result = CountWays(n-1)+CountWays(n-2);

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of stairs");
        int n = sc.nextInt();

        int result = CountWays(n+1);

        System.out.println("Number of ways is : "+result);
        
    }
}
