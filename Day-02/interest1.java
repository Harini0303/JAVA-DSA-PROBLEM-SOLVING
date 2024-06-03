//problem
// A person borrows Rs.Z for 'm' years at X% p.a. simple interest. He immediately lends it to another person at Y% p.a for the same 'm' years. Find his gain in the transaction per year.
// Input format:

// First line of input corresponds to the borrowed amount (Rs. Z)

// Second line of input corresponds to the interest rate (X%) that he borrowed

// Third line of input corresponds to the interest rate (Y%) that he lends it to the another person

// Fourth line of input corresponds to number of years 'm'

// Output Format:

// Output corresponds to the gain in the transaction per year

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt(); // Borrowed amount
        int x = sc.nextInt(); // Interest rate at which borrowed
        int y = sc.nextInt(); // Interest rate at which lent
        int m = sc.nextInt(); // Number of years

        int gain = z * (y - x) / 100; // Gain per year

        System.out.println(gain);
        sc.close();
    }
}

// calculating the interest1
// 1.Interest Paid on Borrowed Amount:
// principal = Z
// Rate = x%
// time = m years
// interest paid = z * x* m / 100

// 2.Interest Earned on Lent Amount:
// principal = Z
// Rate = y%
// time = m years
// interest earned = z * y* m / 100

// Net Gain Calculation:
// Net Gain=Total Interest Earned−Total Interest Paid
// net gain = z *m * (y - x)/100

// gain per year = z *m * (y - x)/100 / m so the m and m will cancel
// gain per year = z*(y-x)/100
