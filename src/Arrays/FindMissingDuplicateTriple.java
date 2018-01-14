package Arrays;

/**
 * only 1 no will be missing from order
 * for [1,2,3,4,6]
 * we have array of length n
 */
public class FindMissingDuplicateTriple {

    public static void main(String[] args) {
        FindMissingDuplicateTriple findMissingDuplicateTriple = new FindMissingDuplicateTriple();
        int n = findMissingDuplicateTriple.findMissing(new int[]{1,2,3,4,6});
        System.out.println(n);
    }

    public int findMissing(int []arr){
        int n = arr[arr.length-1];
        int sum =0;
        for (int i :arr){
            sum = sum+i;
        }
        return (((n*(n+1))/2) - sum);
    }
}
