package Array;

public class swapping {
    static void swap(int a,int b){
        System.out.println("orignal value before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("value after swap");
        int temp = 0;
        temp = 9;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int arr[] = {2,3,4,5,6,7};

        swap(a,b);

    }
}
