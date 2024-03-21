package Recursion;

import java.util.Scanner;

public class FindingPowerApproach2 {
    static long powerFinding(long a,long b){
        long mid = 0;
        long result = 0;
        long finalresult = 0;
        if(b==1){
            return a;
        }
        else{
            mid = b/2;
            result = powerFinding(a, mid);
            finalresult = result*result;
             if(mid%2==0){
            return finalresult;
        }
        else{
            return a*finalresult;
        }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a and b value");
        long a = sc.nextInt();
        long b = sc.nextInt();

        long result = powerFinding(a, b);
        System.out.println(result);


    }
}
