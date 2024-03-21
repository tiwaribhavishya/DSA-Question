package DivideAndQunquer;
// l = Lower Bound;
// h = Higher Bound
public class QuickSort {
    public static int partition(int arr[],int l,int h){
        int i = l;
        // pivot as the `first element in an array
        int pivot = arr[i];

        for(int j=i+1;j<h;j++){
            // j - to take care of the Bigger element than the pivot
            // i = to take care of the smaller element than the pivot
            if (arr[j]<=pivot) {
                
                // increment i
                i = i+1;
                // swap(arr[i],arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        
        }
        // swap(arr[l],arr[i])
        // to return the correct index of the pivot element
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
        return i;
    }
    public static void quickSort(int arr[],int l,int h){
        if(l<h){
            // 1. Divide in two subProblems
            int m = partition(arr,l,h);
            // 2. Conquer those Subproblemes Via recursion
            quickSort(arr, l, m-1);
            quickSort(arr, m+1, h); // m = mid
            // 3 No need to combine 
        }

    }
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {20,50,40,30,70,90};
        int n = arr.length;
        System.out.println("Array before sorting is : ");
        printArr(arr,n);
        quickSort(arr,0,n-1);
        System.out.println("Array after sort is : ");
        printArr(arr,n);
    }
}
