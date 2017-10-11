package Stacks;

import java.util.Stack;

public class HistogramProb {

    public static void main(String args[]){
        int arr[] = new int[]{2};

        calculateMaxAreaofGraph(arr);
    }

    private static void calculateMaxAreaofGraph(int[] arr) {
        Stack<Integer> stk =new Stack();
        int maxArea = 0;
        int currentArea = 0 ;
        int i =0;

        while(i<arr.length){

            if(stk.isEmpty() || (arr[i]>=arr[stk.peek()]) ) {

                //pushing the  location in the stack
                stk.push(i);
                i++;

            }else {

                //Calculating the area using backtracking

                    int top = stk.pop();
                    if (stk.isEmpty()){
                        currentArea = arr[top]*(i);
                    }else {
                        currentArea = arr[top]*(i - 1 -stk.peek());
                    }

                    if (maxArea < currentArea){
                        maxArea = currentArea;
                    }

            }

        }



        while (!stk.isEmpty() ){
            int top = stk.pop();
            if (stk.isEmpty()){
                currentArea = arr[top]*(i);
            }else {
                currentArea = arr[top]*(i - 1 -stk.peek());
            }

            if (maxArea < currentArea){
                maxArea = currentArea;
            }
        }

        System.out.print(maxArea);


    }
}
