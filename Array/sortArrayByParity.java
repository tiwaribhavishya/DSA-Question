package Array;

import java.util.Scanner;

public class sortArrayByParity {
    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortParity(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        // two pointer approch me while loop use krna hai yaha left aur right jab tak nai takra jate tabtak array traverse hoga
        while(left<right){
            if(arr[left] % 2 == 1 && arr[right] %2 == 0){
                swap(arr,left,right);
                left++;
                right--;

            }
           // ye second aur third if tab lagega jab uper wali if codition false hojaye mtlb even paihle se left me ho aur odd paihle se right me ho
           // tab pointer ko aange bdhane ke liye ye condition apply huiye hai
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        
        System.out.println("enter the "+n+"elements");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal array is :");
        printarray(arr);
        sortParity(arr);
        System.out.println("sort array is : ");
        printarray(arr);

    }
}
