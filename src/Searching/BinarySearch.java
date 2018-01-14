package Searching;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch search = new BinarySearch();
        int position = search.binarySearch(new int[]{1,2,3,4},1);
        System.out.println(position);
    }

    public int binarySearch(int[] arr,int data){
        int low =0;
        int max = arr.length-1;

        while (low <=max){
            int mid = (max+low)/2;
            if (data<arr[mid]){
                //
                max = mid-1;
            }else if(data>arr[mid]){
                //
                low = mid+1;
            }else {
                //return the location
                return mid;
            }
        }
     return -1;
    }

}
