package Recursion;

import java.util.Scanner;

public class NumMultiple {
    static int multipleOfk(int n,int k){
        int result = 0;
        if(k==1){
            return n;
        }
        else{
            result = multipleOfk(n, k);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value for k multiples");
        int n = sc.nextInt();
        System.out.println("Enter the k value that multiple will you find");
        int k = sc.nextInt();

        int result = multipleOfk(n, k);
        System.out.println(result);
    }
}
