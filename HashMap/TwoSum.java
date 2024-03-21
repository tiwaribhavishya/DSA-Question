
package HashMap;

import java.util.Scanner;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        n = arr.length;
        System.out.println("enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();

        // create a hashmap where key is arr[i] and value is i
        HashMap<Integer,Integer> map = new HashMap<>();
        // insert the array in hashmap
        for(int i=0;i<n;i++){
            map.put(arr[i], i);

        }
        // create a array to display the index of two numbers
        int result[] = new int[2];
        // if current is equal to the target
        for(int i=0;i<n;i++){
            if(arr[i]==target && map.containsKey(0)){
                result[0] = i;
                result[1] = map.get(0);
                break;
                
            }
            else if(map.containsKey(target-arr[i])){
                if(map.get(target-arr[i])>i){
                    result[0] = i;
                    result[1] =  map.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("["+result[0]+" , "+result[1]+"]");
        
    }
}
