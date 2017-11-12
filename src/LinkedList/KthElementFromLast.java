package LinkedList;

import java.util.LinkedList;

public class KthElementFromLast {
    public static void main(String[] args) {


        KthElementFromLast listClass = new KthElementFromLast();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(8);
        list.add(5);
        System.out.println(listClass.getElement(list,3));


    }

    public int getElement(LinkedList<Integer> linkedList,int k){
        int size = linkedList.size();
        int fromFront = size-k;
        return linkedList.get(fromFront);

    }
}
