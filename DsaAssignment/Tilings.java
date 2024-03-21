package DsaAssignment;
import java.util.*;

public class Tilings {
    static int gateWays(int n){
        if(n<=3){
            return n;
        }
        else{
            return gateWays(n-1)+gateWays(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of board for tilsing");
        int n = sc.nextInt();
        int result = gateWays(n);
        System.out.println("total number of ways for fitting tilis "+result);
    }
}
