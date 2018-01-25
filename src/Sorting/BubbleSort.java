package Sorting;

/**
 * if no swapping is taking place then exit the loop
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int arr[] = new int[]{3,5,0,1,0,67};
        sort.bubbleSort(arr);
    }

    private void bubbleSort(int arr[]){

        for (int i =arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){

                if (arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
