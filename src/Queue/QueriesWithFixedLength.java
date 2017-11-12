package Queue;

/*
https://www.hackerrank.com/challenges/queries-with-fixed-length/problem

REFER - https://knaidu.gitbooks.io/problem-solving/content/stacks_and_queues/sliding_window_max.html
 */


import java.util.Scanner;

public class QueriesWithFixedLength {

    static int arr[];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int q = scn.nextInt();
        arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        QueriesWithFixedLength solution = new QueriesWithFixedLength();
        for (int j =0 ;j<q;j++){
            System.out.println(solution.output(scn.nextInt()));
        }


    }


    public static int output(int d){
        int size = arr.length;
        int min = Integer.MAX_VALUE;
        //calculate min in case d == size of array
        if (d == size){
            return calculateMax(arr);
        }
        // in this we have taking d values at a time calculating their max and then calculating the global minimum
        for (int i =0 ;i<size-d;i++){
            int max = arr[i];
            //taking d values and calculating max
            for (int j =1 ;j<d;j++){
                if (arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            //calculating global min out of max(d values)
            if (max < min){
                min = max;
            }
        }
        return min;
    }

    /**
     * calculate the max from given array
     * @param arr
     * @return
     */
    public static int calculateMax(int arr[]){
        int max = arr[0];
        for (int i : arr){
            if (i>max){
                max = i ;
            }
        }
        return max;
    }
}
