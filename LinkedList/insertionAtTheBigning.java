package LinkedList;

public class insertionAtTheBigning {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertingAtTheEnd(int Newdata){
        Node newNode = new Node(Newdata);
        if(head==null){
            head = new Node(Newdata);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    public void AtTheBign(int newdata){
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        insertionAtTheBigning  list = new insertionAtTheBigning();
        System.out.println("without add the ending value");
        list.insertingAtTheEnd(2);
        list.insertingAtTheEnd(3);
        list.insertingAtTheEnd(4);
        list.insertingAtTheEnd(6);
        list.print();
        System.out.println("after adding the 10");
        list.insertingAtTheEnd(10);
        list.print();
        System.out.println("Adding 1 At bigning");
        list.AtTheBign(1);
        list.print();
        list.AtTheBign(11);
        list.AtTheBign(12);
        list.AtTheBign(132);
        list.print();
    }
}
