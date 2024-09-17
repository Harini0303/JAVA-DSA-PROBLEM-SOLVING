// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        int sum =0, len =0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,-1);
        
        for(int i=0;i<N;i++){
            sum+=A[i];
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            
            if(map.containsKey(sum-K)){
                len= Math.max(len, i-map.get(sum-K));
            }
        }
        return len;
    }
}