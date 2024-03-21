package Stack;

import java.util.Stack;

public class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1 =  new Stack<>();
        System.out.println(stack1.empty());

        // push the element inside the stack
        stack1.push(2);
        stack1.push(3);
        stack1.push(11);
        stack1.push(15);
        System.out.println(stack1);
        
        // print the top most element in the stack 
        System.out.println("the top most element in the stack is "+stack1.peek());

        // // delete the top element in the stack
        // System.out.println("delete the top most element in the stack "+stack1.pop());

        System.out.println("after deletion the top most element in the stack is "+stack1.peek());
        System.out.println(stack1.empty());

        //Search the element in the stack 
        System.out.println("element 2 at the postion in the stack is "+stack1.search(15));
     }
}
