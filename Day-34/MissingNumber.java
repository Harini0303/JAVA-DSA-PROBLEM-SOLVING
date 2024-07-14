// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sum = 0;

        int sumOfNatural = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int missing = sumOfNatural - sum;

        return missing;

    }
}