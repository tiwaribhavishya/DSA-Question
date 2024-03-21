package LinkedList;

public class MiddleLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertionAtTheEnd(int newdata){
        Node newNode = new Node(newdata);
        if(head==null){
            head = new Node(newdata);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertionAtTheBeggining(int newdata){
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }
    public void AtAnyNode(Node pre_node,int newdata){
        if(pre_node==null){
            System.out.println("The previous value cannot contain null value");
        }
        Node newNode = new Node(newdata);
        newNode.next = pre_node.next;
        pre_node.next = newNode;
    }
    // reverse of array method
    public void reversel(){
        Node curr = head;
        Node next = null;
        Node prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }
    public void delete(int postion){
        if(head==null){
            return;
        }
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
        System.out.println();
    }
    public void reverseRec(Node curr, Node prev){
        if(curr.next==null){
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextPtr = curr.next;
        curr.next = prev;
        reverseRec(nextPtr, curr);
    }
    // Middile of Linked list
    public void FindMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast != null&&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle of linked list is "+slow.data);
    }
    public static void main(String[] args) {
        MiddleLinkedList ll = new MiddleLinkedList();
        ll.insertionAtTheEnd(20);
        ll.insertionAtTheEnd(66);
        ll.insertionAtTheEnd(99);
        ll.insertionAtTheEnd(121);
        ll.insertionAtTheEnd(500);
        ll.print();
        System.out.println("Insertion At the after 500");
        ll.insertionAtTheEnd(900);
        ll.print();
        System.out.println("insertion at the beggining");
        ll.insertionAtTheBeggining(10000);
        ll.print();
        System.out.println("new Node add at any Node");
        ll.AtAnyNode(ll.head.next.next.next, 5000);
        ll.print();
        System.out.println("reversel linked list is ");
        ll.reversel();
        ll.print();
        System.out.println("reversel recursivly");
        ll.reverseRec(ll.head, null);
        ll.print();
        ll.FindMiddle();
        System.out.println("thank you");
    }
}
