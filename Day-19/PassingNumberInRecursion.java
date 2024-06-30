public class PassingNumberInRecursion {
    public static void main(String[] args) {
        fun(5);

    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        // fun(n--); - it print 5 more times then it will show error

        fun(--n);
    }

}
