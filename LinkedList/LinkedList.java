package LinkedList;

import java.awt.List;

public class LinkedList {

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
    //reversel of array
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
    public static void main(String[] args) {
        System.out.println("Insertion At the end");
        LinkedList ll = new LinkedList();
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
        System.out.println("reversel of array");
        ll.reversel();
        ll.print();

    }
}