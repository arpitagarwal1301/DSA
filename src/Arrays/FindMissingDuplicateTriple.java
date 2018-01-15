package Arrays;

/**
 * only 1 no will be missing from order
 * for [1,2,3,4,6]
 * we have array of length n
 */
public class FindMissingDuplicateTriple {

    public static void main(String[] args) {
        FindMissingDuplicateTriple findMissingDuplicateTriple = new FindMissingDuplicateTriple();
//        int n = findMissingDuplicateTriple.findMissing(new int[]{1,2,3,4,6});
        findMissingDuplicateTriple.findDuplicate(new int[]{1,2,3,4,6});
//        System.out.println(n);
    }


    public void findDuplicate(int []arr){
        int arrParent[] = new int[100];

        for (int i =0;i<arr.length;i++){
            if (arrParent[arr[i]]==-1){
                System.out.println("duplicate");
                return;
            }else {
                arrParent[arr[i]]=-1;
            }
        }

        System.out.println("No duplicate");

    }

    public int findMissing(int []arr){
        int n = arr[arr.length-1];
        int sum =0;
        for (int i :arr){
            sum = sum+i;
        }
        return (((n*(n+1))/2) - sum);
    }

    /**
     * some no coming twice and other thrice
     * perform xor twice will become 0 thrice will return the no.
     * @param arr
     * @return
     */
    public int findConsecutiveThreeNo(int []arr){
        return -1;
    }

    /**
     * some no occuring once and other twice
     * @param arr
     * @return
     */
    public int findNoOccurringOnce(int []arr){
        return -1;
    }
}
