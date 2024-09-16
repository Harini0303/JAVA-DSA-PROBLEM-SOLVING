// https://leetcode.com/problems/minimum-time-difference/description/?envType=daily-question&envId=2024-09-16

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);

            int hour = Integer.parseInt(time.substring(0, 2));
            int min = Integer.parseInt(time.substring(3));

            minutes[i] = hour * 60 + min;
        }

        Arrays.sort(minutes);

        int minDiff = 1440;

        for (int i = 1; i < minutes.length; i++) {
            minDiff = Math.min(minDiff, minutes[i] - minutes[i - 1]);
        }

        int cirularDiff = 1440 + minutes[0] - minutes[minutes.length - 1];
        minDiff = Math.min(minDiff, cirularDiff);

        return minDiff;

    }
}