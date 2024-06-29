
public class ProductUsingRecursion {
    public static void main(String[] args) {
        int n = 1342;
        int ans = prod(n);
        System.out.println(ans);
    }

    public static int prod(int n) {
        if (n % 10 == n) {
            return n;
        }
        return prod(n / 10) * n;
    }

}
