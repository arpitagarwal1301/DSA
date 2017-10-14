package Queue;

public class StackUsing2Queue {

    QueueUsingLinkedList queue1  = new QueueUsingLinkedList();
    QueueUsingLinkedList queue2  = new QueueUsingLinkedList();

    public static void main(String[] args) {
        StackUsing2Queue stackUsing2Queue = new StackUsing2Queue();
        stackUsing2Queue.push(1);
        stackUsing2Queue.push(2);
        stackUsing2Queue.push(3);
        stackUsing2Queue.push(9);
        stackUsing2Queue.pop();
        stackUsing2Queue.pop();
        stackUsing2Queue.pop();

    }

    public void push(int n){
        int size1 = queue1.getSize();
        int size2 = queue2.getSize();

        if (size1==0){
            this.queue1.enque(n);
            while (size2!=0){
                this.queue1.enque(queue2.deque());
                size2--;
            }
        }else if (size2==0){
            this.queue2.enque(n);
            while (size1!=0){
                this.queue2.enque(queue1.deque());
                size1--;
            }
        }
    }

    public void pop(){
        if (queue1.getSize()!=0){
            System.out.println(this.queue1.deque());
        }else {
            System.out.println(this.queue2.deque());
        }
    }
}
