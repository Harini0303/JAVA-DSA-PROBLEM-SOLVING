// Remove the duplicates in the String.
// Testcase 1:
// Input: Java1234
// Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
// Testcase 2:
// Input: Python1223:
// Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
// Testcase 3:
// Input: aBuzZ9900
// Output: aBuzC9012

import java.util.HashSet;
import java.util.Set;

public class RemoveReplaceString {
    public static void main(String[] args) {
        System.out.println(removeDuplicatesAndReplace("Java1234"));
        System.out.println(removeDuplicatesAndReplace("Python1223"));
        System.out.println(removeDuplicatesAndReplace("aBuzZ9900"));
    }

    public static String removeDuplicatesAndReplace(String str) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            } else {
                char replace = ch;
                while (seen.contains(replace)) {
                    if (Character.isUpperCase(ch)) {
                        replace = (char) ((replace - 'A' + 1) % 26 + 'A');
                    } else if (Character.isLowerCase(ch)) {
                        replace = (char) ((replace - 'a' + 1) % 26 + 'a');
                    } else if (Character.isDigit(ch)) {
                        replace = (char) ((replace - '1' + 1) % 26 + '1');
                    }

                }

                seen.add(replace);
                result.append(replace);
            }
        }
        return result.toString();
    }
}