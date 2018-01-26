package Sorting;

/**
 *https://www.programiz.com/dsa/heap-sort
 */
public class HeapSort {

    int arr[] = new int[]{2,4,4,9,1,1};;

    public static void main(String[] args) {
        HeapSort sort = new HeapSort();
        sort.heapSort();

    }

    private void heapSort(){
        int n = arr.length;

        //first we have to make the max heap and for this we have to call every parent node
        //In the below call for heapify ...since child subtrees are already heapify so we go to
        //only one side since other side is already heapified during this current step
        for(int i = (n/2)-1;i>=0;i--)
            heapify(arr,n,i);

        for(int i=n-1;i>=0;i--){

            swap(i,0);

            //heapify the root ..recursive call goes into one part of tree since other part is already
            //heapified in the above heapify call.
            heapify(arr,i,0);
        }


    }

    private void heapify(int arr[],int heapSize,int parent){

        int left = parent*2+1;
        int right = parent*2+2;
        int largest = parent;

        if(left<heapSize && arr[left] > arr[largest]){
            largest = left;
        }

        if(right<heapSize && arr[right] > arr[largest]){
            largest = right;
        }


        if(largest!=parent){

            swap(largest,parent);

            //heapify the affected child subtree , leave the other part as it is as will be already sorted
            heapify(arr,heapSize,largest);
        }

    }

    private void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
