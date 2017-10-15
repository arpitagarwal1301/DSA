package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Try with simple array also
 */
public class LeftRotation {
    static ArrayList leftRotation(ArrayList list, int d) {
        // Complete this function
        //we have d < n always
        while (d!=0){
            list.add(list.remove(0));
            d--;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int a_i = 0; a_i < n; a_i++){
            a.add(in.nextInt());
        }
        ArrayList<Integer> result = leftRotation(a, d);
        for (int arrayList : result) {
            System.out.print(arrayList + " ");
        }

        in.close();
    }
}
