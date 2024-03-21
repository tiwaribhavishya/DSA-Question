package LinkedList;

public class insertionAtTheEnd {
    Node head;
    class Node{             // next is a pointer
        int data;
        Node next;

        Node(int d){
           data = d;
            next = null;
        } 
    }
    public void insertAtEnd(int newdata){
        Node newNode = new Node(newdata); // creating new node for new data

        // linked lis is empty
        if(head==null){
            head = new Node(newdata);
            return;
        }

        // linked list is not empty
        newNode.next = null;
        // creating new pointer temp
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;

    }
    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
        System.out.println();
        

    }
    // implemation of insertion of a node at the end
    public static void main(String[] args) {
        insertionAtTheEnd list = new insertionAtTheEnd();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(6);
        list.insertAtEnd(8);
        System.out.println("Before insertion of 10");
        list.printLinkedList();
        System.out.println("After insertion of 10 ");
        list.insertAtEnd(10);
        list.printLinkedList();

    }
}
