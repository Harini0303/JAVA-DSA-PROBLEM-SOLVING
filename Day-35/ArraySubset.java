// https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> freqMap = new HashMap<>();

        for (long num : a1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (long num : a2) {
            if (!freqMap.containsKey(num) || freqMap.get(num) == 0) {
                return "No";
            }
            freqMap.put(num, freqMap.get(num) - 1);
        }

        return "Yes";
    }
}