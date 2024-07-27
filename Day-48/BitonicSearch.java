//https://www.interviewbit.com/problems/search-in-bitonic-array/

public class BitonicSearch {
    public int solve(int[] A, int B) {
        int bitonicPoint = findBitonicPoint(A);
        int index = binarySearch(A, B, 0, bitonicPoint, true);
        if (index != -1) {
            return index;
        }
        index = binarySearch(A, B, bitonicPoint + 1, A.length - 1, false);
        return index;
    }

    private int findBitonicPoint(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] > A[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int binarySearch(int[] A, int B, int left, int right, boolean isAscending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == B) {
                return mid;
            }
            if (isAscending) {
                if (A[mid] < B) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (A[mid] > B) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}