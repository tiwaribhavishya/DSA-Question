package Recursion;
import java.util.*;
public class TilingProblem {
    static int Gateways(int n){
        if(n<=3){
            return n;  // Base case if n==1 n==2 and n==3 return n beacuse this condition num of n then num of ways
        }
        else{
            //recursive call
            return Gateways(n-1)+Gateways(n-2); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of board for tilsing");
        int n = sc.nextInt();

        int result = Gateways(n+1);
        System.out.println("the total number of ways of tilings is "+result);


    }
}
