//problem link : https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

class Solution {
    static long sumOfDivisors(int N) {
        // code here
        long sumOfAllDivisors = 0;
        for (int i = 1; i <= N; i++) {
            sumOfAllDivisors += (N / i) * i;

        }
        return sumOfAllDivisors;

    }

    // static long sumOfFactors(int N){
    // int n = (int)Math.sqrt(N);
    // long sum = 0;
    // for(int i=1;i<=n;i++){
    // if(N%i==0){
    // sum+=i;
    // if(i!= N/i){
    // sum += N/i;
    // }

    // }
    // }
    // return sum;
    // }
}
