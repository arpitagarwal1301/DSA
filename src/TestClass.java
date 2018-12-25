
//import for Scanner and other utility  classes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class TestClass {
    public static void main(String args[] ) throws Exception {

        //Scanner
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(-7);
        list.add(2);
        list.add(5);
        TestClass testClass = new TestClass();
//        for(int i = 0;i< n;i++){
            testClass.solution(list);
//        }
    }

    private void solution(Scanner s){
        int size = s.nextInt();
        int seg= s.nextInt();
        int k = s.nextInt();

        int a[] = new int[seg];
        int segmentSize = size/seg;

        for(int j=0;j<size;j++){
            int next = s.nextInt();
            if(j%segmentSize==0){
                a[j/segmentSize] = next;
            }else if(a[j/segmentSize] < next)
                a[j/segmentSize]=next;
        }

        Arrays.sort(a);
        if(a[0]<k){
            System.out.println(a[0]);
        }else{
            System.out.println("NO");
        }
    }



    private ArrayList<Integer>  solution(ArrayList<Integer> a) {

        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
//                newArray.clear();

            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }
}




