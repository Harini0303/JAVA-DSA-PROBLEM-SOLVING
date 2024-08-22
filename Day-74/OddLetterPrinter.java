// Print the word with odd letters – PROGRAM
// Sample Output-
// P      P
//  R    R 
//   O  O  
//    G   
//   R  R  
//  A    A 
// M      M

public class OddLetterPrinter {
    public static void main(String[] args) {
        String word = "PROGRAM";

        int length = word.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == length - i - 1) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
