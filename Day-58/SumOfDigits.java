public class SumOfDigits {
    public static void main(String[] args) {
        int n = 234;
        System.out.print(sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}