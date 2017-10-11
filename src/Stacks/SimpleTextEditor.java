package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {



    public static void main(String[] args) {

        String stringBuilder = "";

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        Stack<String> stack = new Stack();

        for(int p_i = 0; p_i < n; p_i++){
            int x = in.nextInt();
            switch (x){
                case 1:stack.push(stringBuilder);
                    stringBuilder= stringBuilder+in.next();
                    break;
                case 2:
                    stack.push(stringBuilder);
                    int size = stringBuilder.length();
                    stringBuilder = stringBuilder.substring(0,size-in.nextInt());

                    break;
                case 3:
                    System.out.println(stringBuilder.charAt(in.nextInt()-1));
                    break;
                case 4:
                    stringBuilder = stack.pop();
                    break;
                default:
                    break;
            }
        }

        in.close();
    }

}
