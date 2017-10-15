package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    int lastAnswer = 0;
    ArrayList arrayList;


    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        Scanner scn = new Scanner(System.in);
        array.initialise(scn);
    }

    public void initialise(Scanner scn){
        int nSeq = scn.nextInt();
        int nRow = scn.nextInt();
        arrayList = new ArrayList();
        for (int i =0 ;i<nSeq;i++){
            arrayList.add(new ArrayList<>()) ;
        }

        for (int i =0 ;i<nRow;i++){
            this.performOperation(arrayList,scn.nextInt(),scn.nextInt(),scn.nextInt(),nSeq);
        }
    }

    public void performOperation(ArrayList<ArrayList> arrayList, int op, int x, int y ,int n){
       switch (op){
           case 1:arrayList.get((x^lastAnswer)%n).add(y);
               break;
           case 2:ArrayList seq = arrayList.get((x^lastAnswer)%n);
                lastAnswer = (int) seq.get(y%seq.size());
               System.out.println(lastAnswer);
               break;
       }
    }

}
