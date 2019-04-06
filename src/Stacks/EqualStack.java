package Stacks;

import java.util.Scanner;



/*
Given three stack of the positive numbers, the task is to find the possible equal maximum sum of the stacks with removal
 of top elements allowed.
Stacks are represented as array, and the first index of the array represent the top element of the stack.
https://www.geeksforgeeks.org/find-maximum-sum-possible-equal-sum-three-stacks/
 */
public class EqualStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();


        int count1 = 0;
        int count2 = 0;
        int count3 = 0;


        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            count1 = count1+ h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            count2 = count2+ h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            count3 = count3+ h3[h3_i];
        }

        int i1 = 0 ;
        int i2 = 0;
        int i3 = 0;


            while (true){

                if (count1>count2 || count1>count3){
                    count1 = count1-h1[i1++];
                }else if (count2>count1 || count2>count3){
                    count2 = count2-h2[i2++];
                }else if (count3>count2 || count3>count1){
                    count3 = count3-h3[i3++];
                }else {
                    break;
                }
                }


        System.out.println(count1);

    }
}
