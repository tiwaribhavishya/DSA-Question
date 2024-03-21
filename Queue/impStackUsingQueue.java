package Queue;
import java.util.*;                                       // space complexity O(n);

public class impStackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    // add krne ki time complexity O(n)
    // to add a new element in the stack
    static void add(int data){
        // move all the element from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }
        // push the new data to q1
        q1.add(data);

        // Move back all the element from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }

    }
    // to delete the element from the stack
    // time complexity O(1)
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Queue underflow");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        impStackUsingQueue s = new impStackUsingQueue();

        // push all the element in the stack
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        
        // remove all the element fro the stack
        // LIFO - Last in first out
        System.out.println("Deleted element from the stack is : "+s.remove());
        s.add(15);
         
        System.out.println("Deleted element from the stack is : "+s.remove());
    }
}
