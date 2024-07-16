// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {

        // Complete the function

        // int length = 0;
        // for(int i=0; i<N; i++) {
        // int sum = 0;
        // for(int j=i; j<N; j++) {
        // sum += A[j];
        // if(sum == K) {
        // length = Math.max(length, j-i+1);
        // }
        // }
        // }
        // return length;

        int sum = 0, len = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (!map.containsKey(sum))
                map.put(sum, i);
            if (map.containsKey(sum - K))
                len = Math.max(len, i - map.get(sum - K));
        }
        return len;
    }
}