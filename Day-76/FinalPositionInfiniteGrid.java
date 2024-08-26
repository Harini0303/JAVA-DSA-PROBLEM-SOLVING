
class FinalPositionInfiniteGrid {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        int n = 9;

        String movements = "ULRRDDULR";

        for (int i = 0; i < n; i++) {
            char move = movements.charAt(i);
            switch (move) {
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
            }
        }

        System.out.println(x + " " + y);
    }
}
