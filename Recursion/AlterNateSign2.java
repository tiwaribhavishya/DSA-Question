package Recursion;

import java.util.Scanner;

public class AlterNateSign2 {
    static int FindingAlternateSeris(int n){
        if(n==0){
            return n;
        }
        else{
            if(n%2==0){
                return FindingAlternateSeris(n-1)-n;
            }
            else{
                return FindingAlternateSeris(n-1)+n;
            }
        }
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value ");
        int n = sc.nextInt();

        int result = FindingAlternateSeris(n);
        System.out.println("OutPut given of Alternative Sign Series is "+ result);

    }
}
