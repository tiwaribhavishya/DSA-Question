package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(20);
        deque.offerFirst(21);
        deque.addLast(24);
        deque.offerLast(25);
        deque.offerFirst(99);

        System.out.println("Deque output looks like "+deque);

        System.out.println(" deletion : "+deque.pollFirst());
        System.out.println("after deletion looks like "+deque);
    }
}
