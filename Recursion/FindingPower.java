package Recursion;

import java.util.Scanner;

public class FindingPower {
    static int PowerOfElement(int a, int b){
         int result = 0;
         if(b==1){
            return a;
         }
         else{
            result = a*PowerOfElement(a, b-1);
         }
         return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Power of " +a+" is : "+PowerOfElement(a, b));
        System.out.println("this is the all type of powers in");
    }
}
