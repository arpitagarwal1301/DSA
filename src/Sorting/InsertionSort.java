package Sorting;

/**
 * see geeks for geeks for correct solution
 */
public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int arr[] = new int[]{3,5,0,1,0,67};
        sort.insertSortGeeks(arr);

    }

    /**
     * this method involves lot of swapping instead of just shifting the elements and inserting the key to correct position
     * @param arr
     */
    private void insertSortARPIT(int arr[]){

        for (int i =1;i<arr.length;i++){
            for(int j=i;j >0;j--){
                if(arr[j] < arr[j-1]){
                    //see the geeks for geeks also
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    private void insertSortGeeks(int arr[]){
        for(int i=1;i<arr.length;i++){

            int key = arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1]= key;

        }
    }
}
