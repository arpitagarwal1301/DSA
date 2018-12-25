package LinkedList;

public class ReverseLinkedListRecursion {
    class Node{
        int data;
        ReverseLinkedListRecursion.Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    ReverseLinkedListRecursion.Node head = null;

    public ReverseLinkedListRecursion(){
        ReverseLinkedListRecursion.Node node1 = new ReverseLinkedListRecursion.Node(1);
        ReverseLinkedListRecursion.Node node2 = new ReverseLinkedListRecursion.Node(2);
        ReverseLinkedListRecursion.Node node3 = new ReverseLinkedListRecursion.Node(3);
        ReverseLinkedListRecursion.Node node4 = new ReverseLinkedListRecursion.Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }

    public static void main(String[] args) {

        ReverseLinkedListRecursion listClass = new ReverseLinkedListRecursion();
//        listClass.printList();
//        listClass.reverseList(null,listClass.head);
        listClass.reverseList(listClass.head,null);
        listClass.printList();
    }

    private void reverseList(Node curr,Node prev) {

        if(curr.next ==null){
            head = curr ;
            curr.next = prev;
            return;
        }

        Node node1 = curr.next;
        curr.next = prev;
        reverseList(node1,curr);

    }

    public void printList(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

}
