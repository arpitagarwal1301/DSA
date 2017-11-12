package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLinkedLists {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head1 = null;
    Node head2 = null;

    public IntersectionOfLinkedLists(){
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
        nodeC.next = node5;

        head1 = node1;
        head2 = nodeA;
    }

    public static void main(String[] args) {

        IntersectionOfLinkedLists listClass = new IntersectionOfLinkedLists();
//        System.out.println(listClass.intersection());
        listClass.intersectionUsingMap();
    }

    /**
     * taking 2 pointer from head and iterating after null assign to head of another list
     */
    public int intersection(){
        Node node1 = head1;
        Node node2 = head2;

        while (node1 != node2){
            node1 = node1.next;
            node2 = node2.next;

            if (node1==null){
                node1 = head1;
            }
            if (node2 == null){
                node2 = head2;
            }
        }
        return node1.data;
    }

    /**
     * Using address
     */
    public void intersectionUsingMap(){
        Set<Node> hash_Set = new HashSet<>();
        Node node = head1;
        while (node!=null){
            hash_Set.add(node);
            node = node.next;
        }
        Node node1 = head2;

        while (node1!=null && hash_Set.add(node1)){
            node1 = node1.next;
        }
        System.out.println(node1.data);
    }



    //OTHER SOLUTION
    //Calculate the length of first list and then second list
    // size = size1-size2 leave the first size elements from bigger list and then
    //iterate size2 elements

}
