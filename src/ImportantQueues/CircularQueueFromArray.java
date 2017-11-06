package ImportantQueues;

public class CircularQueueFromArray {

    public int front;
    public int rear ;
    public int arr[] ;
    public int maxsize;
    public int currentSize;


    public CircularQueueFromArray(int maxsize){
        super();
        this.maxsize = maxsize;
        this.front =0;
        this.rear=0;
        this.currentSize=0;
        this.arr = new int[maxsize];
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public boolean isFull(){
        return currentSize==maxsize;
    }

    public void enQueue(int data){
        if (isFull()){
            System.out.println("Queue is already full");
        }else {
            arr[rear] = data;
            rear = (rear+1)%maxsize;
            currentSize++;
        }
    }

    public int deQueue(){

        int data = -1;
        if (isEmpty()){
            System.out.println("Queue is already empty");
        }else {
            data = arr[front];
            front = (front+1)%maxsize;
            currentSize--;
        }
        return data;
    }

    public static void main(String[] args) {

        CircularQueueFromArray que = new CircularQueueFromArray(4);
        que.enQueue(5);
        que.enQueue(1);
        que.enQueue(0);
        que.enQueue(3);
        que.enQueue(3);
        que.enQueue(3);
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
    }



}
