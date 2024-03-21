package Recursion;

import java.util.Scanner;

public class FindFactorial {
    static int FactorialFind(int n){
        int result = 0;
        if(n==0 || n==1){
            return 1;
        }
        else{
            result = n*FactorialFind(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Factorial");
        int n = sc.nextInt();
        
        int result = FactorialFind(n);
        System.out.println("Total number of Factorial is "+result);
    }
}
