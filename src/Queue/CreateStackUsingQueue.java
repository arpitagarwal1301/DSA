package Queue;

/**
 * IMPORTANT ,INTERVIEW
 */
public class CreateStackUsingQueue {
    QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
    public static void main(String[] args) {
        CreateStackUsingQueue stackUsingQueue = new CreateStackUsingQueue();

        stackUsingQueue.push(2);
        stackUsingQueue.push(3);
        stackUsingQueue.push(7);
        stackUsingQueue.pop();
        stackUsingQueue.pop();
        stackUsingQueue.pop();
    }

    private void push(int n){

        int size = this.queueUsingLinkedList.getSize();
        if (size==0){
            this.queueUsingLinkedList.enque(n);
        }else {
            this.queueUsingLinkedList.enque(n);
            while (size!=0){
                this.queueUsingLinkedList.enque(this.queueUsingLinkedList.deque());
                size--;
            }
        }
    }

    private void pop(){
        System.out.println(this.queueUsingLinkedList.deque());
    }
}
