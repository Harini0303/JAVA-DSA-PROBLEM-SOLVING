//https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop

class Solution {

    void printNos(int N) {
        // code here
        if (N < 1) {
            return;
        }

        System.out.print(N + " ");

        printNos(N - 1);
    }
}