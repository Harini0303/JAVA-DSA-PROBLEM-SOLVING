public class SquareRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println();
    }

    public static int square(int N) {
        if (N == 1) {
            return 1;
        } else {
            return square(N - 1) + 2 * N - 1;
        }
    }
}
