import java.util.ArrayList;

public class StringMatcher {
    public static void main(String[] args) {
        String str = "hello";
        String[] arr = { "hello", "he-lo", "-ello" };

        ArrayList<String> lst = new ArrayList<>();
        for (String s : arr) {
            if (s.equals(str)) {
                lst.add(s);
            } else {
                int ind = s.indexOf("-");
                char ch = str.charAt(ind);
                // if (s.contains(Character.toString(ch))) {
                // if (s.contains(String.valueOf(ch))) {

                if (s.contains("" + ch)) {
                    lst.add(s);
                }
            }
        }
        System.out.println(lst);
    }

}
