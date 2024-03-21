package Recursion;

import java.util.Scanner;

public class GreatestCommonDivisor1 {
    public static int GCD(int x,int y){
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println("Enter the x and y value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = GCD(x, y);
        System.out.println("Greatest Common Divisor is :  "+result);
    }
}
