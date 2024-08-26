import java.util.Arrays;

public class MinimumBikeTrips {
    public static int minBikeTrips(int[] persons, int K) {
        Arrays.sort(persons);
        int trips = 0;
        int i = 0, j = persons.length - 1;

        while (i <= j) {
            if (persons[i] + persons[j] <= K) {
                i++;
            }
            j--;
            trips++;
        }

        return trips;
    }

    public static void main(String[] args) {
        int[] persons1 = { 50, 60, 70, 80 };
        int K1 = 100;
        System.out.println(minBikeTrips(persons1, K1));

        int[] persons2 = { 30, 40, 50, 60, 70, 80 };
        int K2 = 100;
        System.out.println(minBikeTrips(persons2, K2));
    }
}
