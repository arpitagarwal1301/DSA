package LinkedList;

public class ReverseAlternateKNode {

    private Node nextNode;


    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    public ReverseAlternateKNode(){
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

        ReverseAlternateKNode listClass = new ReverseAlternateKNode();

    }

    private Node reverseAtKNode(Node head,int k) {

        if (head.next == null) {
            return head;
        }
        Node startNode = head;
        Node endNodePrev = getNextNode(startNode,k);

        if (endNodePrev==null){
            return head;
        }

        reverseNodes(startNode,endNodePrev);
//        reverseAtKNode(getNextNode(endNodePrev.next,))
        return head;
    }


    public Node getNextNode(Node startNode,int k) {

        for (int i =1;i<k-1;i++){
            startNode = startNode.next;
            if (startNode==null || startNode.next==null){
                return null;
            }
        }
        return startNode;
    }

    private void reverseNodes(Node startNode,Node endNodePrev){
        Node tempNode = startNode.next;
        startNode.next =endNodePrev.next.next;
        endNodePrev.next = tempNode;
    }
}
