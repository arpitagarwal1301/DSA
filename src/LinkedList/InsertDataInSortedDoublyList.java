package LinkedList;
/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as

*/
public class InsertDataInSortedDoublyList {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    public static void main(String[] args) {
        InsertDataInSortedDoublyList list = new InsertDataInSortedDoublyList();

    }


    Node SortedInsert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;

        Node prevTempNode = null;

        Node node = head;
        if (head == null) {
            return newNode;
        }

        //insert at first
        if (data < node.data) {
            newNode.next = node;
            node.prev = newNode;
            return newNode;
        }


        while (node != null && node.data < data) {
            prevTempNode = node;
            node = node.next;
        }


        //insert at last
        if (node == null) {
            node = prevTempNode;
            node.next = newNode;
            newNode.prev = node;
            return head;
        }

        //insert at middle
        Node nextNode = node;
        node = prevTempNode;
        node.next = newNode;
        newNode.next = nextNode;
        newNode.prev = node;
        nextNode.prev = newNode;

        return head;
    }

}
//working solution
