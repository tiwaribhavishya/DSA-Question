package ArrayDataStructure;

public class enhanceForLoop {
    public static void main(String[] args) {
    //    int arr[] = {5,4,2,1};

    //    for(int n : arr){
    //     System.out.println(n);
    //    }

          int arr[][] = {
                        
                       {5,2,4,3},{8,9},{11,12,6,7} 
                       
                      };
          for(int a[] : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
          }

    }
}
