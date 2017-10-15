package Queue;

import java.util.ArrayList;
import java.util.Stack;

public class QueueUsingStackArray {

    Stack<Integer> stk1 = new Stack<>();
    ArrayList<Integer> list = new ArrayList();

    public static void main(String[] args) {
        QueueUsingStackArray queueUsingStack = new QueueUsingStackArray();

        queueUsingStack.enque(1);
        queueUsingStack.enque(2);
        queueUsingStack.enque(3);
        System.out.println(queueUsingStack.dequeu());
        System.out.println(queueUsingStack.dequeu());
//        System.out.println(queueUsingStack.dequeu());
    }


    public void enque(int n){
//        if (stk1.isEmpty()){
//            stk1.push(n);
//        }else {
//
//            while(!stk1.isEmpty()){
//                list.add(stk1.pop());
//            }
//
//            stk1.push(n);
//            for (int i =list.size()-1 ;i>=0;i--){
//                stk1.push(list.remove(i));
//            }
//        }

        if (stk1.isEmpty()){
            stk1.push(n);
            list.add(n);
        }else {
            list.add(n);
            while(!stk1.isEmpty()){
                stk1.pop();
            }

            stk1.push(n);
            for (int i =list.size()-1 ;i>=0;i--){
                stk1.push(list.get(i));
            }
        }
    }

    public int dequeu(){
        list.remove(0);
        return stk1.pop();
    }
}
