package ArrayDataStructure;

public class JagdArray {
    public static void main(String[] args) {
         int arr[][] = {
                        
                       {5,2,4,3},{8,9},{11,12,6} 
                       
                      };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }              
    }
}
