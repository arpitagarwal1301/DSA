package Recursion;

public class Factorial {


    public static void main(String[] args) {
        Factorial factorial = new Factorial();
//        System.out.println(factorial.findFactorial(5));
        System.out.println(factorial.add(1));
    }


    public int findFactorial(int data){
        if (data == 0){
            return 1;
        }else {
            return data*findFactorial(data-1);
        }

    }

    public int add(int n){
        if (n==5){
            return 5;
        }else {
            return add(n+1);
        }
    }
}

