package LinkedList;

public class insertionAtAnyNode {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

    }
    public void insertingAtTheEnd(int newdata){
        Node newNode = new Node(newdata);
        if(head==null){
            head = new Node(newdata);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    public void insertionAtTheBigning(int newdata){
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtAnyNode(Node pre_Node,int newdata){
        if(pre_Node==null){
            System.out.println("The previous value cannot contain null value");
        }
        Node newNode = new Node(newdata);
        newNode.next = pre_Node.next;
        pre_Node.next = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
        System.out.println();
    }
    void Deletion(int postion){
        if(head == null){
            return;
        }
        // Deletion At beginning
        Node temp = head;
        if(postion==0){
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null&&i<postion-1;i++){
            temp = temp.next;
        }
        if(temp==null&&temp.next==null){
            return;
        }
        else{
            temp.next = temp.next.next;
        }


    }
    public static void main(String[] args) {
        insertionAtAnyNode list = new insertionAtAnyNode();
        System.out.println("Before insurting 10 after 4");
        list.insertingAtTheEnd(2);
        list.insertingAtTheEnd(4);
        list.insertingAtTheEnd(6);
        list.insertingAtTheEnd(5);
        list.print();
        
        System.out.println("after insurting new node after 4");
        list.insertAtAnyNode(list.head.next, 10);
        list.print();

        System.out.println("after insurting 12 after 10");
        list.insertAtAnyNode(list.head.next.next, 12);
        list.print();
        System.out.println("after deleting at psotion ");
        list.Deletion(5);
        list.print();

    }
}
