// https://www.naukri.com/code360/problems/rotate-array_1230543

import java.util.ArrayList;

public class RotateArrayByK {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start <= end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }

    }
}