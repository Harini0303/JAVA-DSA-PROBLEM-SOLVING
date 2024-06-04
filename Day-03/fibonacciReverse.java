import java.util.Arrays;
import java.util.Scanner;

public class fibonacciReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[n - 1] = 1;
        arr[n - 2] = 1;
        for (int i = n - 3; i >= 0; i--) {
            arr[i] = arr[i + 1] + arr[i + 2];
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
