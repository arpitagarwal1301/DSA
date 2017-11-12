package LinkedList;

public class ReverseLinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    public ReverseLinkedList(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }

    public static void main(String[] args) {

        ReverseLinkedList listClass = new ReverseLinkedList();
        listClass.printList();
        listClass.reverseList(null,listClass.head);
        listClass.printList();
    }

    public void reverseList(Node prev,Node curr){

        if (curr == null){
            head = prev;
            return;
        }

        Node nextCurr = curr.next;
        curr.next = prev;
        reverseList(curr,nextCurr);

    }

    /**
     * Recursion
     */
    public void reverseListUsingRecursion(){

    }

    public void printList(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
