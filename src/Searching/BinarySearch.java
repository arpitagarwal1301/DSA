package Searching;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch search = new BinarySearch();

        arr = new int[]{1,2,3,4};
        data = 3;

//        int position = search.binarySearch(new int[]{1,2,3,4},1);
        int position = search.binarySearchRecursion(0,arr.length-1);
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

    static int arr[];
    static int data;

    public int binarySearchRecursion(int low,int high){

        if (low>high){
            return -1;
        }
        //important ...see how to calculate mid .....(low+high)/2 might not work in some corner cases
        int mid = low+(high-low)/2;

        if (arr[mid]==data){
            return mid;
        }else if (data>arr[mid]){
           return binarySearchRecursion(mid+1,high);
        }else if (data<arr[mid]){
           return binarySearchRecursion(low,mid-1);
        }else {
            return -1;
        }
    }

}
