package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int arr[] = new int[]{3,5,0,1,0,67};
        sort.selectionSort(arr);

    }


    private void selectionSort(int arr[]){


        for (int i =0;i<arr.length;i++){

            int min = i;
            for(int j=i;j<arr.length;j++){

                if (arr[min]>arr[j]) {
                    min = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
}
