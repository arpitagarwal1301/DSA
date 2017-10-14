package Queue;

import java.util.ArrayList;

/**
 * Arraylist has a load factor of 75% ....so when you fill 75% of arraylist then it will double
 * size of the arraylist which is not efficient
 *
 */

public class QueueFromArrayList {

    private static ArrayList list;
    private static int rear;
    private static int front;

    public static void main(String[] args) {
        initQue();
        System.out.println(isEmpty());
        System.out.println(enque(1));
        System.out.println(enque(2));
        System.out.println(enque(3));
        System.out.println(enque(4));
        deque();
        deque();
        deque();
        deque();
        deque();
        System.out.println(enque(2));
        deque();
        deque();

    }

    private static void initQue() {
        list = new ArrayList();
        rear = -1;
        front = 0;

    }

    private static int enque(int n){
        ++rear;
        list.add(n);
        return n;

    }

    private static void deque(){
        if (!isEmpty()){
            System.out.println(list.remove(0));
            front++;
        }else {
            System.out.println("Que is empty");
        }
    }

    //Always false
    private static boolean isFull(){
        return false;
    }

    /**
     * Case 1 : rear < front then empty
     * case 2 : read == front then non empty
     * @return
     */
    private static boolean isEmpty(){
        if (rear<front){
            return true;
        }else {
            return false;
        }
    }


}
