package Queue;


/**
 * BASIC , IMPORTANT
 * Arraylist has a load factor of 75% ....so when you fill 75% of arraylist then it will double
 * size of the arraylist which is not efficient
 */
public class QueueUsingLinkedList {

    private static class Node{
        int data;
        Node next;
    }

    private Node front ;
    private Node rear ;
    private int currentSize;

    public static void main(String[] args) {

        QueueUsingLinkedList linkedList = new QueueUsingLinkedList();
        linkedList.enque(2);
        linkedList.enque(4);
        linkedList.enque(6);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.deque());
        System.out.println("size "+linkedList.getSize());
        System.out.println(linkedList.deque());
        System.out.println("size "+ linkedList.getSize());
        System.out.println(linkedList.deque());
        System.out.println(linkedList.isEmpty());


    }


    public   boolean isEmpty() {
        if (front == null){
            return true;
        }else {
            return false;
        }
    }

    public int deque() {
        //If empty then we have to do rear = null;

        int data = -1;
        if (isEmpty()){
            rear = null;                    //IMPORTANT CONDITION
        } else if (!isEmpty()){
            int temp = front.data;
            front = front.next;
            data = temp;
        }else {
            System.out.println("Queue is empty");
        }
        currentSize--;
        return data;
    }

    public void enque(int n) {
        Node newNode = getNewNode(n);

        if (isEmpty()){
            front =  newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        currentSize++;
    }

    private Node getNewNode(int n){
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = null;

        return newNode;
    }

    public int getSize(){
        return currentSize;
    }
}
