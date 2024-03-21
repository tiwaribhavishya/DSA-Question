package Recursion;

import java.util.Scanner;
import java.math.*;

public class FindingBigInteger {
    static BigInteger powerfinding(BigInteger a, int b){
        if(b==1){
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger result = powerfinding(a,b);
        System.out.println(" power of a and b is = "+result);
    }
}
