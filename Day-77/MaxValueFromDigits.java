// Given an array of integers, compute the maximum value for each integer in the index, by either summing all the digits or multiplying all the digits. (Choose which operation gives the maximum value)
// •	Input:
// •	5
// •	120 24 71 10 59
// •	Output:
// •	3 8 8 1 45
// Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0. Thus, maximum of this two is 3.

public class MaxValueFromDigits {
    public static void main(String[] args) {
        int[] numbers = { 120, 24, 71, 10, 59 };
        int[] results = getMaxValueForEachIndex(numbers);
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    private static int[] getMaxValueForEachIndex(int[] numbers) {
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int sumOfDigits = sumDigits(number);
            int productOfDigits = productDigits(number);
            results[i] = Math.max(sumOfDigits, productOfDigits);
        }

        return results;
    }

    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static int productDigits(int number) {
        int product = 1;
        boolean hasNonZeroDigit = false;
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0) {
                hasNonZeroDigit = true;
                product *= digit;
            }
            number /= 10;
        }
        return hasNonZeroDigit ? product : 0;
    }
}
