package LinkedList;

public class LinkedListClass {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    public static void main(String[] args) {

        LinkedListClass listClass = new LinkedListClass();
        listClass.insertAtEnd(3);
        listClass.insertAtEnd(1);
        listClass.insertAtEnd(6);
        listClass.insertAtEnd(9);
//        listClass.deleteAtStart();
//        System.out.println(listClass.findNode(1).data);
//        listClass.insertAfterNode(9,10);
//        listClass.deleteFromBeginning();
//        listClass.deleteFromLast();
        listClass.deleteParticularNode(1);
        listClass.printList();
    }

    public void insertAtStart(int data){
        Node node = new Node(data);
        //insert at start
        if (head==null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }

    }

    public void deleteAtStart(){
        //delete at start
        if (head==null){
            return;
        }else {
            head = head.next;
        }
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        //insert at end
        if (head == null){
            head = node;
        }else {
            Node node1 = head;
            while (node1.next != null){
                node1 = node1.next;
            }
            node1.next = node;
        }

    }

    public void deleteAtEnd(){
        //delete at end
        if (head == null){
            return;
        }else {
            Node node1 = head;
            Node node2 = head.next;

            if (node2==null){
                head = null;
                return;
            }
            while (node2.next != null){
                node1 = node1.next;
                node2 = node1.next;
            }
            node1.next = null;
        }
    }

    public void printList(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }

        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public Node findNode(int data){
        if (head==null){
            return null;
        }else {
            Node node = head;
            while (node!=null){
                if (node.data == data){
                    return node;
                }else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public void insertAfterNode(int data,int insertData){

        Node node = findNode(data);
        if (node==null){
            System.out.println("Node not present");
            return;
        }else {
            Node temp = node.next;
            Node node1 = new Node(insertData);
            node.next = node1;
            node1.next = temp;
        }
    }

    public void deleteAfterNode(int data){

        Node node = findNode(data);
        if (node.next==null){
            return;
        }else {
            node.next = node.next.next;
        }
    }

    public void deleteFromBeginning(){
        if (head == null){
            return;
        }else {
            head = head.next;
        }
    }

    public void deleteFromLast(){
        if (head == null){
            return;
        }else if (head.next == null){
            head = null;
        } else {
            Node node = head;
            while (node.next.next != null){
                node = node.next;
            }
            node.next = null;
        }
    }

    public void deleteParticularNode(int data){
        Node node = findNode(data);
        if (node==null){
            return;
        }
        Node iteratorNode = head;
        while (iteratorNode.next != node){
            iteratorNode = iteratorNode.next;
        }

        iteratorNode.next = iteratorNode.next.next;
    }
}
