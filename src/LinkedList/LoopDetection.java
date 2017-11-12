package LinkedList;

public class LoopDetection {

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

        LoopDetection listClass = new LoopDetection();
        listClass.isLoop();

    }

    private void isLoop(){
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        Node node4 = new Node(6);
        Node node5 = new Node(7);
        Node node6 = new Node(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        node4.next = node2;
        head = node1;

        Node tortoise = head;
        Node hair = head;
        while (tortoise.next!=null && hair.next.next != null ){

            if (tortoise!=head && tortoise==hair){
                System.out.println("True");
                tortoise = head;

                    while (tortoise != hair){
                        tortoise = tortoise.next;
                        hair = hair.next;
                    }
                    System.out.println(tortoise.data);
                return;
            }else {
                tortoise = tortoise.next;
                hair = hair.next.next;
            }
        }
    }



}
