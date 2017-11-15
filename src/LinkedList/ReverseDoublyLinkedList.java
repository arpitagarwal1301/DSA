package LinkedList;

public class ReverseDoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    public static void main(String[] args) {

    }

    Node Reverse(Node head) {

        Node node = head;
        while (node!=null){

            Node nextnode = node.next;
            //for last node
            if (nextnode==null){
                head = node;
            }
            //revert the node
            node.next = node.prev;
            node.prev = nextnode;
            //move to next node here you can apply recurrsion also
            node = nextnode;
        }

        //return the head
        return head;
    }
}
