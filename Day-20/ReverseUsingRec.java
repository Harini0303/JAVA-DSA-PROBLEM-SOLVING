
public class ReverseUsingRec {
    public static void main(String[] args) {
        rev(1824);
        System.out.println(sum);
    }

    static int sum = 0;

    public static int rev(int n) {
        if (n == 0) {
            return n;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;

        rev(n / 10);
        return sum;

    }
}
