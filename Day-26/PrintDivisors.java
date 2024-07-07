// problem :https://www.naukri.com/code360/problems/print-all-divisors-of-a-number_1164188?leftPanelTabValue=PROBLEM

import java.util.ArrayList;
import java.util.List;

public class PrintDivisors {
    public static List<Integer> printDivisors(int n) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

            }
        }
        return list;
    }

}