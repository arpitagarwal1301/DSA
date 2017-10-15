package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        ReverseQueue reverseQueue = new ReverseQueue();
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(3);
        queue1.add(2);
        queue1.add(1);
        reverseQueue.reverseQueue(queue1);
    }

    public void reverseQueue(Queue<Integer> queue){

        int arr[] = new int[queue.size()];
        int i =0;
        while (!queue.isEmpty()){
            arr[i]=queue.remove();
            i++;
        }

        for (int j =arr.length-1 ; j >=0;j-- ){
            queue.add(arr[j]);
        }

        printQueue(queue);

    }

    public void printQueue(Queue<Integer> queue){
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }


}
