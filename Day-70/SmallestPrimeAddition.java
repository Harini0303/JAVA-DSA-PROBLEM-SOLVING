//Find the least prime number that can be added with first array element that makes them divisible by second array elements at respective index

import java.util.*;

public class SmallestPrimeAddition {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> findSmallestPrimes(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i];
            int num2 = arr2[i];

            int prime = 2;
            while (true) {
                if (isPrime(prime) && (num1 + prime) % num2 == 0) {
                    result.add(prime);
                    break;
                }
                prime++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 14, 15 };
        int[] arr2 = { 3, 5, 7 };

        List<Integer> result = findSmallestPrimes(arr1, arr2);
        for (int prime : result) {
            System.out.print(prime + " ");
        }
    }
}
