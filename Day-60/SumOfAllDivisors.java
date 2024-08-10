//https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

class Solution {
    static long sumOfDivisors(int N) {
        // code here
        long sumOfAllDivisors = 0;
        for (int i = 1; i <= N; i++) {
            sumOfAllDivisors += (N / i) * i;

        }
        return sumOfAllDivisors;
    }
}

// class Solution{
// static long sumOfDivisors(int N){
// // code here
// long ans = 0;
// for(int i=1;i<=N;i++){
// ans+=sumOfAllDivisors(i);
// }
// return ans;
// }

// public static long sumOfAllDivisors(int n){
// int sqrt = (int)Math.sqrt(n);
// long sum =0;

// for(int i=1;i<=sqrt;i++){
// if(n%i == 0){
// sum+=i;

// if(i != n/i){
// sum+=n/i;
// }
// }

// }
// return sum;
// }
// }