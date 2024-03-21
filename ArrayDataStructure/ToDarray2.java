package ArrayDataStructure;

public class ToDarray2 {
    public static void main(String[] args) {
        int arr[][] = {
                        
                       {5,2},{8,9},{11,12} 
                       
                      };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }              
    }
}
