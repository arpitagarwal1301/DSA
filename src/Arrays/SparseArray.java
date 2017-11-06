package Arrays;

import java.util.Scanner;

public class SparseArray {

    public static void main(String[] args) {
        SparseArray array = new SparseArray();
        Scanner scn = new Scanner(System.in);
        array.initialise(scn);
    }

    public void initialise(Scanner scn){
        int nSeq = scn.nextInt();
        String arr[] = new String[nSeq];
        for (int i =0 ;i<nSeq;i++){
            arr[i] = scn.next();
        }

        int cSeq = scn.nextInt();
        for (int i =0 ;i<cSeq;i++){
            int count = 0;
            String str = scn.next();
            for (String s:arr){
                if (str.equals(s)){
                 count++;
                }
            }
            System.out.println(count);
        }

    }
}
