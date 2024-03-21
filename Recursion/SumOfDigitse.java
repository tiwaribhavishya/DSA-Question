package Recursion;

import java.util.Scanner;

public class SumOfDigitse {
    public static int Sumthe(int n){
        if(n == 0){
            return 0;
        }else{
            return n%10+Sumthe(n/10);
        }
    
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number Of Digits");
       int n = sc.nextInt();
       System.out.println("Number of Digits is : "+n);
       
        System.out.println("Sum Of digits Is "+Sumthe(n));
    }
}
