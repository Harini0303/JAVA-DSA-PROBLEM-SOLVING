// Print all possible subsets of the given array whose sum equal to given N.
//example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}

import java.util.ArrayList;
import java.util.List;

public class PossibleSubsetSum {

    public static void findSubsets(int[] arr, int index, List<Integer> current, int sum, int N,
            List<List<Integer>> result) {
        if (sum == N) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (sum > N || index == arr.length) {
            return;
        }

        current.add(arr[index]);
        findSubsets(arr, index + 1, current, sum + arr[index], N, result);

        current.remove(current.size() - 1);
        findSubsets(arr, index + 1, current, sum, N, result);
    }

    public static List<List<Integer>> subsetsWithSumN(int[] arr, int N) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(arr, 0, new ArrayList<>(), 0, N, result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int N = 6;

        List<List<Integer>> result = subsetsWithSumN(arr, N);
        System.out.println("Subsets with sum " + N + ":");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
