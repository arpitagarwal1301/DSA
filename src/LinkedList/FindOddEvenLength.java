package LinkedList;

public class FindOddEvenLength {


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

        FindOddEvenLength listClass = new FindOddEvenLength();
        System.out.println(listClass.isOdd());
    }

    public boolean isOdd(){
        Node node1 = new Node(2);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        head = node1;
        Node node = head;


        while (node != null ){
            if (node.next == null){
                return true;
            }else if (node.next.next == null){
                return false;
            }else {
                node = node.next.next;
            }
        }
        return false;
    }
}
