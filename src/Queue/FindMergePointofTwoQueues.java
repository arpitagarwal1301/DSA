package Queue;

/**
 * Say, there are two lists of different lengths, merging at a point; how do we know where the merging point is?

 Conditions:

 We don't know the length
 We should parse each list only once.
 */
public class FindMergePointofTwoQueues {

    class Node {
        int data;
        Node next;
    }


    Node mergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method

        Node node1 = headA;
        Node node2 = headB;

        while (node1 != node2){

            if (node1!=null){
                node1 = node1.next;
            }else {
                node1 = headA;
            }

            if (node2 != null){
                node2 = node2.next;
            }else {
                node2 = headB;
            }

        }

        return node1;
    }
}
