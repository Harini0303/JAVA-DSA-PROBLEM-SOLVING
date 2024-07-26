// https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?page=1&category=Binary%20Search&sortBy=submissions

class GFG {
    ArrayList<Integer> find(int arr[], int n, int x) {
        // code here
        ArrayList<Integer> occ = new ArrayList<>();

        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            occ.add(first);
            occ.add(last);
        } else {
            occ.add(-1);
            occ.add(-1);
        }
        return occ;
    }
}