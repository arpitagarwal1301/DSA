package Stacks;

import java.util.ArrayList;
import java.util.Scanner;

public class PoisonousPlant {

    static int poisonousPlants(int[] p) {
        // Complete this function
        int temp ;
        int count = -1;
        ArrayList<Integer> dead = new ArrayList<>();
        boolean continueLoop =true;
        while(continueLoop){
            continueLoop = false;
            temp = Integer.MAX_VALUE;
            for (int i =0;i<p.length;i++){
                if (!dead.contains(i)){
                    //if poison greater than left plant then it's position will be added to dead else to live
                    if (p[i]>temp){
                        dead.add(i);
                        continueLoop = true;
                    }
                    //now new temp which will take the position as the left plant
                    temp = p[i];
                }
            }
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
}
