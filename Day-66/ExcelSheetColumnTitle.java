//https://leetcode.com/problems/excel-sheet-column-title/

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;

            sb.append((char) ('A' + rem));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}

// intituion:
// "The idea is to treat the Excel column numbering system as a base-26 system,
// similar to how we treat decimal numbers in base-10. Since 'A' corresponds to
// 1, 'B' to 2, and so on up to 'Z' which corresponds to 26, we subtract 1 from
// the column number to make it zero-based. Then, we find the remainder when
// dividing by 26, which gives us the current letter, and reduce the column
// number for the next iteration. Finally, we reverse the string since we build
// it from the least significant digit to the most significant."
