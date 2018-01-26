package Sorting;

/**
 * practice more
 */
public class MergeSort {
    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int arr[] = new int[]{3,5,0,1,0,67};
        sort.sort(arr,0,arr.length-1);

    }

    private void sort(int arr[],int low , int high){

        if(low<high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);

            mergeSort(arr,low,mid,high);
        }

    }

    private void mergeSort(int arr[],int low,int mid,int high){

        int n1 = mid-low+1;
        int n2 = high-mid ;

        int l[] = new int[n1];
        int r[] = new int[n2];

        for(int i =0;i<n1;i++){
            l[i] = arr[low+i];
        }
        for(int i =0;i<n2;i++){
            r[i] = arr[mid+1+i];
        }


        int k = low;
        int i=0,j =0;
        while(i<n1 && j<n2){
            if(l[i]<r[j]){
                arr[k++]=l[i];
                i++;
            }else{
                arr[k++]=r[j];
                j++;
            }
        }

        while(i<n1){
            arr[k++] = l[i++];
        }

        while(j<n2){
            arr[k++] = r[j++];
        }


    }

}
