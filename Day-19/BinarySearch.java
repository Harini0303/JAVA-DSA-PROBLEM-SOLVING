public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 9 };
        // int target = 4;

        int ans = search(arr, 4, 0, arr.length - 1);

        System.out.println(ans);
    }

    public static int search(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        return -1;
    }
}
