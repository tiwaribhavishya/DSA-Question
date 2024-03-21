package DsaAssignment;                      // Time Complexity = O(n);
                                            // Space Complexity = O(1);
import java.util.Scanner;

public class CountTotalNumber {
    static int CountNumber(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" element in the array form of 0's and 1's");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = CountNumber(arr);
        System.out.println("Total Number of 1's is : "+result);
    }
}
