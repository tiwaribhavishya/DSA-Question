package LinkedList;

public class newLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }

    }
    public void insertion(int newdata){
        Node newNode = new Node(newdata);
        // linked lis is empty
        if(head==null){
            head = new Node(newdata);
            return;
        }
        // Linked list is not empty
        //newNode.next = null;
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
    public static void main(String[] args) {
        newLinkedList ll = new newLinkedList();
        ll.insertion(2);
        ll.insertion(5);
        ll.insertion(6);
        ll.insertion(7);
        ll.insertion(8);
        ll.printLinkedList();

        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
        ll.insertion(10);
        ll.printLinkedList();


    }
}
