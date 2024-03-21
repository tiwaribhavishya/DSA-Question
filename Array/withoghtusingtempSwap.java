package Array;

public class withoghtusingtempSwap {
    static void swap(int a,int b){
        System.out.println("orignal value before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("value after swap");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a,b);
    }
}
