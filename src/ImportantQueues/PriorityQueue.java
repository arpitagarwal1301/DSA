package ImportantQueues;


public class PriorityQueue {

    Node head;

    class Node{
        int data;
        int priority;
        Node next;

      public Node(int data, int priority){
            this.data = data;
            this.priority = priority;
            next = null;
        }
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.enque(3,4);
        queue.enque(45,1);
        queue.enque(21,5);
        queue.enque(9,0);
        queue.printList();
        queue.deque();
        queue.printList();
    }


    public void enque(int data,int priority){
        if(head == null){
            Node node = new Node(data,priority);
            head = node;
        }else {
            Node node = head;
            Node newNode = new Node(data,priority);

            //Checking head
            if (priority > node.priority){
                newNode.next = head;
                head = newNode;
                return;
            }

            //Checking middle values
            while (node.next!=null){
                if (priority < node.priority && priority > node.next.priority){
                    //insert before node
                    Node tempNode = node.next;
                    node.next = newNode;
                    newNode.next = tempNode;
                    return;
                }else{
                    node = node.next;
                }
            }

            //checking tail
            if (node.next == null){
                node.next = newNode;
                return;
            }

        }
    }

    public int deque(){
        Node tempNode = head;
        head = tempNode.next;
        return tempNode.data;
    }

    public void printList(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

}
