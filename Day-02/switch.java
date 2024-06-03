// problem link : https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        double result = 0.0;

        switch (choice) {
            case 1:
                double R = arr.get(0);
                result = Math.PI * (R * R);
                break;

            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                result = L * B;
                break;

            default:
                break;

        }

        return result;

    }
}