package ArrayDataStructure;

public class missingElementInArray2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,13};
        int n = arr.length;

        int sum_natu_num = ((n+1)*(n+2)/2);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        int missing_element = 0;

        missing_element = sum_natu_num-sum;
        System.out.println("missing element is:"+missing_element);
    }
}
