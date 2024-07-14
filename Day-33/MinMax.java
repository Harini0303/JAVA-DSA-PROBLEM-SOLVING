// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

*/

class Solution {
    public Pair<Long, Long> getMinMax(int[] a) {
        // Code Here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        return new Pair(min, max);

    }
}
