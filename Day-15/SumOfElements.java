import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = sumOfArray(arr, n);

        System.out.println("The sum of the elements in the array is " + sum);

        sc.close();
    }

    public static int sumOfArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return arr[n - 1] + sumOfArray(arr, n - 1);
    }
}
