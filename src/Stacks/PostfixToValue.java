package Stacks;

import java.util.Stack;

public class PostfixToValue {

    public static void main(String args[]){
        String string = "32 2 + 2 /";

        postfixToIn(string);
    }

    public static void postfixToIn(String str){
        Stack<String> stk = new Stack();

        String arr[] = str.split(" ");

        for(int i=0;i<arr.length;i++){

            String s = arr[i];

            if (s.equals("+") ||s.equals("-") ||s.equals("*") || s.equals("/")  ){
                int val1 = Integer.parseInt((String) stk.pop());
                int val2 = Integer.parseInt((String) stk.pop());

                int output = calculatedVal(s,val1,val2);
                stk.push(output+"");
            }else {
                stk.push(s);
            }
        }

        System.out.println(stk.pop());

    }


    public static int calculatedVal(String operator,int v1,int v2){

        if (operator.equals("+")){
            return v2+v1;
        }else if(operator.equals("-")){
            return v2-v1;
        }else if(operator.equals("*")){
            return v2*v1;
        }else if(operator.equals("/")){
            return v2/v1;
        }else {
            return 0;
        }

    }
}
