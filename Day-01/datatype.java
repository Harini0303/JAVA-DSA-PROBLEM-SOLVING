
//Problem link : https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

class Solution {
    static int dataTypeSize(String str) {
        if (str.equals("Character")) {
            return 1;
        } else if (str.equals("Integer")) {
            return 4;
        } else if (str.equals("Long")) {
            return 8;
        } else if (str.equals("Float")) {
            return 4;
        } else if (str.equals("Double")) {
            return 8;
        }

        return 0;

    }
}