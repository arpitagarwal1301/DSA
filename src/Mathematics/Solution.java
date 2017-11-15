package Mathematics;

import java.util.Scanner;

public class Solution {

    static int lowestTriangle(int base, int area){
        // Complete this function
        return ((Double)Math.ceil((2*area)/base)).intValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 17;
        int area = 100;
        int height = lowestTriangle(base, area);
        System.out.println(height);


    }
}
