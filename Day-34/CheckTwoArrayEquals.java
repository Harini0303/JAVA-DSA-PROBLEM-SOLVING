// A loop iterates through each element in array A.
// countMapA.put(A[i], countMapA.getOrDefault(A[i], 0) + 1):
// A[i] is the current element in the array.
// countMapA.getOrDefault(A[i], 0) retrieves the current count of A[i] in the map, or 0 if A[i] is not yet in the map.
// countMapA.put(A[i], newCount) updates the map with the new count, incrementing the existing count by 1.

//https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(long A[], long B[], int N) {
        HashMap<Long, Integer> countMapA = new HashMap<>();
        HashMap<Long, Integer> countMapB = new HashMap<>();

        for (int i = 0; i < N; i++) {
            countMapA.put(A[i], countMapA.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            countMapB.put(B[i], countMapB.getOrDefault(B[i], 0) + 1);
        }

        return countMapA.equals(countMapB);
    }
}