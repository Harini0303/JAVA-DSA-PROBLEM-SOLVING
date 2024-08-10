//https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class CheckPrime {
    public static String isPrime(int num) {
        // Your code goes here
        if (num <= 1) {
            return "NO";
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {

            if (num % i == 0) {
                return "NO";
            }

        }
        return "YES";
    }
}
