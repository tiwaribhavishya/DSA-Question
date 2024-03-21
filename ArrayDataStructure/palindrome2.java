package ArrayDataStructure;

import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0 ; i<size;i++){
            arr[i] = sc.nextInt();
            
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        for(int i=0;i<size/2;i++){
            if(arr[i]!=arr[size-i-1]){
                System.out.println("its not a palindromic array");
            }
            else{
                System.out.println(" palindromic Array");
            }break;
        }
        
        
    }
}
