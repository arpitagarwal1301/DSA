package Arrays;

/*
https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class ContiguousArray {


    public static void main(String[] args) {
        ContiguousArray array = new ContiguousArray();
//        Scanner scn = new Scanner(System.in);
        int arr[]= new int[]{-1,2,3,-4,5,10};
        array.initialise(arr);
    }

    private void initialise(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (Integer item : arr) {
            sum = sum+item;

            if (sum<max){
                max = sum;
            }

            if (sum<0){
                sum = 0;
            }
        }
        System.out.println(String.valueOf(sum));
    }


}
