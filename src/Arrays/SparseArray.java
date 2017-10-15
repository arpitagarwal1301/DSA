package Arrays;

import java.util.Scanner;

public class SparseArray {

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        Scanner scn = new Scanner(System.in);
        array.initialise(scn);
    }

    public void initialise(Scanner scn){
        int nSeq = scn.nextInt();

        for (int i =0 ;i<nSeq;i++){
            scn.next();

        }

    }
}
