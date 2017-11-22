package LinkedList;

public class CircularLinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node tail = null;

    public static void main(String[] args) {

        CircularLinkedList listClass = new CircularLinkedList();
        listClass.insertAtBeginning(30);
//        listClass.insertAtEnd(2);
//        listClass.insertAtEnd(1);
        listClass.insertAtBeginning(20);
        listClass.insertAtBeginning(10);
        listClass.insertAtBeginning(40);
        listClass.insertAfterData(10,99);
//        listClass.deleteSpecificNode(30);
//        listClass.removeAtBeginning();
//        listClass.removeAtEnd();
//        listClass.insertAfterData(1,4);
//        listClass.insertAtEnd(1);
//        listClass.insertAtEnd(6);
//        listClass.insertAtEnd(9);
//        listClass.deleteAtStart();
//        System.out.println(listClass.findNode(1).data);
//        listClass.insertAfterNode(9,10);
//        listClass.deleteFromBeginning();
//        listClass.deleteFromLast();
//        listClass.deleteParticularNode(1);
        listClass.printList();
    }

    public Node insertAtEnd(int data){
        if (tail==null){
            tail = new Node(data);
            tail.next = tail;
        }else {
            Node node = tail.next;
            tail.next = new Node(data);
            tail = tail.next;
            tail.next = node;
        }

        return tail;
    }

    public Node insertAtBeginning(int data){
        if (tail==null){
            tail = new Node(data);
            tail.next = tail;
        }else {
            Node node = tail.next;
            tail.next = new Node(data);
            tail.next.next = node;
        }
        return tail;
    }

    public void insertAfterData(int data, int newData){
        Node node = tail;
        if (node.data==data){
            //insert after this node
            Node tempNode = node.next;
            node.next = new Node(newData);
            node.next.next = tempNode;
            return;
        }else {
            node = node.next;
            while (node!=tail){
                if (node.data==data){
                    //insert after this node
                    Node tempNode = node.next;
                    node.next = new Node(newData);
                    node.next.next = tempNode;
                    return;
                }else {
                    node = node.next;
                }
            }
        }
    }

    public Node removeAtBeginning(){
        Node node = tail;
        if (node==null || node.next==node){
            return null;
        }
        Node tempNode = node.next.next;
        node.next = tempNode;
        return tail;
    }

    public void deleteSpecificNode(int data){
        Node node = tail;
        if (node.data==data){
            removeAtEnd();
            return;
        }else {
            node = node.next;
            while (node!= tail){
                if (node.next.data==data){
                    node.next = node.next.next;
                    return;
                }
            }
            System.out.println("NOt found");
        }
    }

    public Node removeAtEnd(){
        Node node = tail;
        if (node==null || node.next==node){
            return null;
        }

        Node tempNode = node.next;
        while (node.next!=tail){
            node = node.next;
        }

        node.next = tempNode;
        tail = node;
        return tail;
    }

    public void printList(){
        Node node = tail;
        if (node!=null){
            System.out.println(node.data);
            node = node.next;
        }else {
            return;
        }

        while (node!=tail){
            System.out.println(node.data);
            node = node.next;
        }
    }


}
