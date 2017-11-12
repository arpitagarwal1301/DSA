package LinkedList;

public class DoublyLinkedList {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    Node head  = null;

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.insertAtBegin(3);
        linkedList.insertAtLast(8);
        linkedList.insertAtBegin(0);
        linkedList.insertAfterData(8,10);
        linkedList.printListForward();
        linkedList.deleteParticularNode(8);
        linkedList.deleteParticularNode(10);
        linkedList.deleteParticularNode(0);
        linkedList.printListForward();
    }


    /**
     * insert at the beginning
     * @param data
     */
    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node node = head;
            head = newNode;
            newNode.next = node;
            node.prev = newNode;
        }

    }

    public Node getNode(int data){
        return new Node(data);
    }

    /**
     * insert at last
     * @param data
     */
    public void insertAtLast(int data){

        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;
            newNode.prev = node;
        }
    }

    /**
     * insert element after particular node
     * @param data
     * @param newData
     */
    public void insertAfterData(int data,int newData){
        Node node  = head;
        Node newNode = new Node(newData);
        while (node != null && node.data != data){
            node = node.next;
        }

        if (node == null){
            System.out.println("Not possible");
            return;
        }

        Node tempNode = node.next;
        if (tempNode == null){
            node.next = newNode;
            newNode.prev = node;
        }else {
            node.next = newNode;
            newNode.next = tempNode;
            newNode.prev = node;
            tempNode.prev = newNode;
        }
    }


    /**
     * print list forward
     */
    public void printListForward(){
        Node node = head;
        if (head ==null){
            System.out.println("No elements to print");
            return;
        }
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    /**
     * print list backward
     */
    public void printListBackward(){
        Node node = head;
        if (head ==null){
            System.out.println("No elements to print");
            return;
        }

        while (node.next!=null){
            node = node.next;
        }

        while (node!= null){
            System.out.println(node.data);
            node = node.prev;
        }
    }

    public void deleteParticularNode(int data){
        Node node  = head;
        while (node != null && node.data != data){
            node = node.next;
        }

        if (node == null){
            System.out.println("Not possible");
            return;
        }

        Node prev = node.prev;
        Node next = node.next;

        if (next==null && prev== null) {
            head = null;
        }else if (next ==null){
            //delete last node
            prev.next = null;
            node.prev = null;
        }else if (prev == null){
            //delete first node
            node.next = null;
            next.prev = null;
            head = next;
        }else {
            //delete middle node
            next.prev = prev;
            prev.next  = next;
        }

    }
}
