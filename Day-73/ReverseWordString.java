// https://leetcode.com/problems/reverse-words-in-a-string/description/

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}

// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// class Solution
// {
// //Function to reverse words in a given string.
// String reverseWords(String S)
// {
// // code here
// String[] arr = S.split("\\.");

// StringBuilder sb = new StringBuilder();

// for(int i=arr.length-1;i>=0;i--){
// sb.append(arr[i]);

// if(i!=0){
// sb.append(".");
// }
// }
// return sb.toString();
// }
// }