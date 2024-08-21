// Reverse the words in the given String1 from the first occurrence of String2 in String1 by maintaining white Spaces.
// example: String1 = Input: This is a test String only String2 = st Output: This is a only String test

public class ReverseFromStrings {

    public static String reverseFromString(String string1, String string2) {
        int startIndex = string1.indexOf(string2);

        if (startIndex == -1) {
            return string1;
        }

        String beforePart = string1.substring(0, startIndex);
        String afterPart = string1.substring(startIndex);

        int wordStart = startIndex;
        while (wordStart > 0 && string1.charAt(wordStart - 1) != ' ') {
            wordStart--;
        }

        String beforeWordPart = string1.substring(0, wordStart);
        String fromWordPart = string1.substring(wordStart);

        String[] words = fromWordPart.split("\\s+");

        StringBuilder reversedPart = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedPart.append(words[i]);
            if (i != 0) {
                reversedPart.append(" ");
            }
        }

        return beforeWordPart + reversedPart.toString();
    }

    public static void main(String[] args) {
        String string1 = "This is a test String only";
        String string2 = "st";

        String result = reverseFromString(string1, string2);
        System.out.println(result);
    }
}
