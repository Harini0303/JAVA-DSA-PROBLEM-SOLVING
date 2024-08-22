public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(convertToBinary(n));
    }

    public static String convertToBinary(int n) {

        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        return sb.reverse().toString();
    }
}