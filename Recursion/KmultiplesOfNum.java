package Recursion;

import java.util.Scanner;

public class KmultiplesOfNum {
    static void printMultiples(int n,int k){
        if(k==0||k==1){
            System.out.println(n+"*"+k+"="+n);
            return;
        }
        printMultiples(n, k-1);
        
        System.out.println(n+"*"+k+"="+n*k);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the n and k value for k multiples ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        printMultiples(n, k);

    }
}
