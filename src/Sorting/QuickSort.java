package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int arr[] = new int[]{9,0,10,2,2,9,4,3,9,9};
        sort.sort(arr,0,arr.length-1);
    }

    private void sort(int arr[],int low,int high) {

        if(low<high){

            int partition = partition(arr,low,high);

            sort(arr,low,partition-1);
            sort(arr,partition+1,high);
        }
    }

    private int partition(int arr[],int low , int high){

        int pivot = arr[high];

        int i =-1;
        for(int j=0;j<high;j++){

            if(pivot >= arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
