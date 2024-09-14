// https://www.geeksforgeeks.org/problems/missing-ranges-of-numbers1019/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// https://www.geeksforgeeks.org/find-missing-elements-of-a-range/

// A hashing based Java program to find missing
// elements from an array

import java.util.Arrays;
import java.util.HashSet;

public class MissingRangesNumbers {

    static void printMissing(int ar[], int low, int high) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < ar.length; i++)
            hs.add(ar[i]);

        for (int i = low; i <= high; i++) {
            if (!hs.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4 };
        int low = 1, high = 10;
        printMissing(arr, low, high);
    }
}
