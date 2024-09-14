// https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {

        Map<Long, Integer> map = new HashMap<>();

        for (long num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (long num : a2) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return "No";
            }

            map.put(num, map.get(num) - 1);
        }
        return "Yes";

    }
}

// class Compute {
// public String isSubset( long a1[], long a2[], long n, long m) {

// Set<Long> st = new HashSet<>();

// for(long num : a1){
// st.add(num);
// }

// for(long num : a2){
// if(!st.contains(num)){
// return "No";
// }
// }

// return "Yes";
// }
// }