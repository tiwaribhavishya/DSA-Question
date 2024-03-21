package Queue;

// Implementation of the function available in the queue data structure in java

import java.util.*;

public class implementionOfOueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<10;i++){
            q.add(i);
        }
        System.out.println("Queue Data look like : "+q);
        System.out.println("the size of the queue is "+q.size());

        System.out.println("the top element in the queue before deletion "+ q.peek());
        
        // to remove the element from the queue - dequeue
        q.remove();

        // to display the top element present in the Queue
        System.out.println("the top element in the queue after deletion "+ q.peek());

        // to display the size of queue
        System.out.println("the size of the queue is "+q.size());
        
    }
}
