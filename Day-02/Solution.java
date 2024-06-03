//problem link : https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1, c;

        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);

    }

}
