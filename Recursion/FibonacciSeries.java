package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    static int FibonacciSeriesFinding(int n){
        int result = 0;
        if(n==0||n==1){
            return n;
        }
        else{
            result = FibonacciSeriesFinding(n-1)+FibonacciSeriesFinding(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value which you have fibonacci series");
        int n = sc.nextInt();

        int result = FibonacciSeriesFinding(n);
        System.out.println(n+" times Fibonacci Series is : "+result);
    }
}
