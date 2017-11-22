package LinkedList;

public class RotateListAfterKthNode {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    public RotateListAfterKthNode(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        head = node1;
    }

    public static void main(String[] args) {

        RotateListAfterKthNode listClass = new RotateListAfterKthNode();
        listClass.printList();
        listClass.reverseList(0);
        System.out.println("New list");
        listClass.printList();
    }

    public void reverseList(int k){
        Node node =  head;
        Node tempNode=null;
        int count =0;
        while (node.next!=null){
            count++;
            if (count==k){
                tempNode = node;
            }
            node = node.next;
        }

        if (tempNode!=null){
            node.next = head;
            Node newHead = tempNode.next;
            tempNode.next = null;
            head = newHead;
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
}
