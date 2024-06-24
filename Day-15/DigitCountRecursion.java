import java.util.*;

class DigitCountRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The number of digits in " + n + " is " + computeNum(n));
    }

    public static int computeNum(int n) {
        if (n == 0) {
            return 1;
        } else {
            return computeNumRecursive(n);
        }
    }

    static int count = 0;

    public static int computeNumRecursive(int n) {
        if (n == 0) {
            return 0;
        } else {
            count++;
            computeNumRecursive(n / 10);
            return count;
        }
    }
}
