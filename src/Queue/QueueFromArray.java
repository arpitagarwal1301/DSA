package Queue;

public class QueueFromArray {
    private int rear;
    private int front;
    private int queArray[];
    private static final int size = 6;

    public static void main(String args[]){

        QueueFromArray queue = new QueueFromArray();
        queue.createQ(size);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.enQue(1));
        System.out.println(queue.enQue(2));
        System.out.println(queue.enQue(3));
        System.out.println(queue.enQue(3));
        System.out.println(queue.enQue(7));
        System.out.println(queue.enQue(7));
        System.out.println(queue.enQue(3));
        System.out.println(queue.deQue());
        System.out.println(queue.deQue());
        System.out.println(queue.deQue());
    }

    //intialise que
    private void createQ(int n) {
        rear = -1;
        front = 0;
        queArray = new int[n];
    }

    private int enQue(int n){
        if (!isFull()){
            queArray[++rear] = n;
            return queArray[rear];
        }else {
            System.out.println("Queue is full");
            return -1;
        }

    }

    private int deQue(){
        if (!isEmpty()){
            return queArray[front++];
        }else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    private boolean isEmpty(){
        if (rear==-1){
            return true;
        }else {
            return false;
        }
    }

    private boolean isFull(){
        if (rear==size-1)
            return true;
        else
            return  false;
    }

}
