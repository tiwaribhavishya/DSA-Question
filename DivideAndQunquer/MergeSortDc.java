package DivideAndQunquer;

public class MergeSortDc {
    public static void Combine(int arr[],int l, int mid , int r){
        int i , j , k;

        int n1 = mid-l+1;
        int n2 = r-mid;

        int lSubArray[] = new int[n1];
        int rsubarray[] = new int[n2];

        for(i=0;i<n1;i++){
            lSubArray[i] = arr[l+i];
        }
        for(j=0;j<n2;j++){
            rsubarray[j] = arr[mid+1+j];
        }
        // comparison between the element in left and right subarray
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if (lSubArray[i]<=rsubarray[j]) {
                arr[k] = lSubArray[i];
                i++;
            }else{
                arr[k] = rsubarray[j];
                j++;
            }
            k++;
        }
        // best case senerio me agar uper walio condition satisfy nai hoti hai to best case lagega 

        // copy all the remaining element from the left subarray
        while (i<n1) {
            arr[k] = lSubArray[i];
            i=i+1;
            k=k+1;
        }
        // copy all the remaining element from the right subarray
        while (j<n2) {
            arr[k] = rsubarray[j];
            j=j+1;
            k=k+1;
        }


    }
    public static void mgSort(int arr[],int i,int j){
        if (i<j) {
            int mid = i+(j-i)/2;

            mgSort(arr, i, mid);
            mgSort(arr, mid+1, j);
            
            Combine(arr,i, mid ,j);
            
        }
    }
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {50,20,40,90,88,11,13};
        int n = arr.length;
        System.out.println("Before sorting the array is ");
        printArr(arr,n);

        mgSort(arr,0,n-1);
        System.out.println("before sorting the array is ");
        printArr(arr,n);

        
    }
}
