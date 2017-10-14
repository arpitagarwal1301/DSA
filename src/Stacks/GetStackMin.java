package Stacks;

import java.util.Stack;

/**
 * Time complexity should be O(1) , IMPORTANT ,INTERVIEW
 */
public class GetStackMin {

    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    public static void main(String[] args) {
        GetStackMin getStackMin = new GetStackMin();
        getStackMin.pushIntoStack(50);
        getStackMin.pushIntoStack(40);
        getStackMin.pushIntoStack(15);
        getStackMin.pushIntoStack(45);
        getStackMin.pushIntoStack(30);

       getStackMin.getMinFromStack();
       getStackMin.popFromStack();
       getStackMin.popFromStack();
       getStackMin.popFromStack();
       getStackMin.popFromStack();
       getStackMin.getMinFromStack();


    }

    /**
     * while pushing we have to insert the mins in the stk2 array and original in stk1
     * @param n
     */
    public void pushIntoStack(int n){
        stk1.push(n);
        if (stk2.isEmpty()){
            stk2.push(n);
        }else if (stk2.peek()>n){
                stk2.push(n);
        }
    }

    /**
     * while poping we have to consider removing the elements of the second stack also
     */
    public void popFromStack(){
        if (!stk1.isEmpty()){
            if (stk1.peek()==stk2.peek()){
                stk2.pop();
            }
            stk1.pop();
        }
    }


    /**
     * return stk2 peek
     */
    public void getMinFromStack(){
        if (!stk2.isEmpty()){
            System.out.println(stk2.peek());
        }else {
            System.out.println("No value in the stack");;
        }
    }



}
