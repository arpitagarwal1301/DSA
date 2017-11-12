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

        if (node.next == null){
            return head;
        }
        Node tempNode = node.next.next;
        while(tempNode!=null){

            Node nextNode = node.next;
            nextNode.next = node;
            nextNode.prev = tempNode;
            node.next = node.prev;
            node.prev = nextNode;
            tempNode = tempNode.next.next;
            if(tempNode==null){

            }
        }

        return head;

    }
}
