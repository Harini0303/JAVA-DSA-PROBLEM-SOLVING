//https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        switch (choice) {
            case 1:
                double circle = Math.PI * arr.get(0) * arr.get(0);
                return circle;
            case 2:
                double rectangle = arr.get(0) * arr.get(1);
                return rectangle;
        }
        return -1;
    }
}