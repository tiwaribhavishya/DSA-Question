package DivideAndQunquer;

public class Inversion {
    public static int CountInversion(int arr[],int n){
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count = count+1;
                }
            }
        }
        return count;
    }
    public static int sortDc(int arr[],int l,int mid,int h){
        int swap = 0;
        int i,j,k;
        int n1 = mid-1+1;
        int n2 = h-mid;

        int lsubarray[] = new int[n1];
        int rsubarray[] = new int[n2];

        for( i=0;i<n1;i++){
            lsubarray[i] = arr[l+i];
        }
        for(j=0;j<n2;j++){
            rsubarray[j] = arr[mid+1+j];
        }
        i = 0;
        j = 0;
        k=l;
        while(i<n1 && j<n2){
            if (lsubarray[i]<=rsubarray[j]) {
                arr[k] = lsubarray[i];
                i++;
            }else{
                arr[k] = rsubarray[j];
                j++;
                swap += (mid+1)-(l+i);
            }
            k++;
        }
        while(i<n1){
            arr[k] = lsubarray[i];
            i = i+1;
            k = k+1;

        }
        while(j<n2){
            arr[k] = rsubarray[j];
            j = j+1;
            k = k+1;
        }
        return swap;

    }

    
    public static int countinversion(int arr[],int l,int h){
        int count = 0;
        while (l<h) {
            int mid = l+(h-l)/2;

            count += countinversion(arr, l, mid);
            count += countinversion(arr, mid+1, h);
            count += sortDc(arr,l,mid,h); 

           
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,8,3,4};
        int n = arr.length;

        int count = CountInversion(arr,n);
        System.out.println("Count inversion by a brute force approch"+count);
        int counts = countinversion(arr,0,n-1);
        System.out.println(counts);
    }
}
