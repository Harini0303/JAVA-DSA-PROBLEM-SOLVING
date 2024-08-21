public class SplitEvenOddString {

    public static void main(String[] args) {
        String str1 = "Hacker";
        String str2 = "Rank";

        System.out.println(processString(str1));
        System.out.println(processString(str2));
    }

    private static String processString(String str) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                even.append(str.charAt(i));
            } else {
                odd.append(str.charAt(i));
            }
        }

        return even.toString() + " " + odd.toString();
    }
}
