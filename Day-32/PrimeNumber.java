//https://www.geeksforgeeks.org/problems/prime-number2314/1

class Solution {
    static int isPrime(int N) {
        // code here
        if (N == 1) {
            return 0;
        }
        int n = (int) Math.sqrt(N);
        for (int i = 2; i <= n; i++) {
            if (N % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}

// public class Solution {
// public static String isPrime(int num) {
// //Your code goes here
// if(num<= 1){
// return "NO";
// }
// for(int i=2;i<=(int) Math.sqrt(num);i++){

// if(num%i == 0){
// return "NO";

// }
// }
// return "YES";
// }
// }