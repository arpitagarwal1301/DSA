package Arrays;

import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        ArrayManipulation array = new ArrayManipulation();
        Scanner scn = new Scanner(System.in);
        array.initialise(scn);
    }

    public void initialise(Scanner scn){
        //array size
        int nSeq = scn.nextInt();
        long arr[] = new long[nSeq];
        long max=0;

        int nQuery = scn.nextInt();
        for (int i =0 ;i<nQuery;i++){
            int a = scn.nextInt()-1;
            int b = scn.nextInt()-1;
            int k = scn.nextInt();

            for (int j =a;j<=b;j++){
                arr[j] =arr[j] + k;
                if (arr[j]>max){
                    max = arr[j];
                }
            }

        }

        System.out.println(max);



    }
}
