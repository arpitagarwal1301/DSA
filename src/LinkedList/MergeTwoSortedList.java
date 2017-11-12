package LinkedList;

public class MergeTwoSortedList {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node headA = null;
    Node headB = null;
    Node head3 = null;

    public MergeTwoSortedList(){
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

        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);

        nodeA.next = nodeB;
        nodeB.next = nodeC;

        headA = node1;
        headB = nodeA;
    }

    public static void main(String[] args) {

        MergeTwoSortedList listClass = new MergeTwoSortedList();
//        System.out.println(listClass.intersection());
        listClass.printList(listClass.mergeSortedLists());
    }

    private Node mergeSortedLists() {
        Node newNode = new Node(0);

        Node head3 = newNode;
        while (headA!=null && headB!=null){
            if (headA.data > headB.data){
                newNode.next = headB;
                headB = headB.next;
            }else {
                newNode.next = headA;
                headA = headA.next;
            }
            newNode = newNode.next;
        }

        if (headA!=null){
            newNode.next = headA;
        }else if (headB != null){
            newNode.next = headB;
        }

        return head3.next;
    }

    public void printList(Node head3){
        if (head3==null){
            System.out.println("List is empty");
            return;
        }

        Node node = head3.next;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
