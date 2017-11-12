package Queue;

import java.util.Scanner;

/**
 * petrolpump(petrol qty, distance)
 * Find the first circular tour that visits all petrol pumps 3.7 Suppose there is a circle.
 * There are n petrol pumps on that circle. You are given two sets of data.  1.
 * The amount of petrol that every petrol pump has. 2. Distance from that petrol pump to the next petrol pump.
 *   Calculate the first point from where a truck will be able to complete the circle (The truck will stop at each petrol pump and it has infinite capacity).
 * Expected time complexity is O(n).
 * Assume for 1 litre petrol, the truck can go 1 unit of distance.  For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump value pairs as {4, 6}, {6, 5}, {7, 3} and {4, 5}.
 * The first point from where truck can make a circular tour is 2nd petrol pump.
 * Output should be “start = 1” (index of 2nd petrol pump).
 */

public class PetrolPumpTour {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scn.nextInt() - scn.nextInt();
        }
        PetrolPumpTour solution = new PetrolPumpTour();
        solution.isCircular(0,n,arr);

    }


        public void isCircular(int start,int size,int arr[]){
        int end;
        if (start>=size){
            return;
        }
        int sum = arr[start];
        end = (start+1)%size;

        while (sum >= 0 && start!=end%size){
            sum = sum + arr[end];
            end = (end+1)%size;
        }
        if (start == end%size){
            System.out.println(start);
            //DOUBT SHOULD WE THROW RETURN AT THIS POINT OF NOT  "return ;"
        }else {
           isCircular(start+1,size,arr);
        }

    }

    //UNDERSTAND : Another solution using maths concepts "start from the petrol pump after the global minimum"
}