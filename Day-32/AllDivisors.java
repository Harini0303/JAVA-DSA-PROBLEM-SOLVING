//https://www.codingninjas.com/studio/problems/print-all-divisors-of-a-number_1164188

import java.util.ArrayList;
import java.util.List;

public class AllDivisors {
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

// public class Solution {
// public static int sumOfAllDivisors(int n){
// int totalSum = 0;
// for (int i = 1; i <= n; i++) {
// totalSum += sumOfDivisors(i);
// }
// return totalSum;
// }

// private static int sumOfDivisors(int num) {
// int sum = 0;
// int sqrtNum = (int) Math.sqrt(num);
// for(int i=1;i<=sqrtNum;i++){
// if(num%i == 0){
// sum+=i;
// if(i != num/i){
// sum+=num/i;
// }

// }

// }
// return sum;
// }
// }
