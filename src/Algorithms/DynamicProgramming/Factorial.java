package Algorithms.DynamicProgramming;

public class Factorial {

    public static void main(String args[]){

        Factorial factorial = new Factorial();
        int arr[] = new int[100];
        System.out.println(factorial.getResultTopDown(4,arr));
        System.out.println(factorial.getResultBottomUp(4,arr));

    }

    private int getResultTopDown(int n, int[] arr) {
        if(n==0 || n==1)
            return 1;
        else if(arr[n]!=0){
            return arr[n];
        }else{
             arr[n]= n*getResultTopDown(n-1,arr);
             return arr[n];
        }
    }

    private int getResultBottomUp(int n, int[] arr) {
        if(n==0 || n==1)
            return 1;

        arr[0] = 1;
        arr[1] = 1;

        for(int i =2;i<=n;i++){
            arr[i] = i*arr[i-1];
        }
        return arr[n];
    }
}
