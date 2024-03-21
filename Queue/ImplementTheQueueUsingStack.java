package Queue;
import java.util.*;
public class ImplementTheQueueUsingStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    // insertion in the Queue
    // time complexity O(1)
    static void enQueue(int data){
        stack1.push(data);
    }
    // Deletion in the Queue
    // time complexity O(n)
    static int dequeue(){
        int ele;
        if(stack1.empty()&&stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        // push all element stack1 to stack2
        if(stack2.empty()){
            while(!stack1.empty()){
                ele = stack1.pop();
                stack2.push(ele);
            }
        }
        // pop the top element from stack2
        ele = stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        ImplementTheQueueUsingStack q = new ImplementTheQueueUsingStack();
        // push the element 
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        
        // pop the top most element
        System.out.println("queue top most element deletion is  : "+ q.dequeue());

    }
}
