
//TYPE : 1
public class PascalTriangle {
    public static void main(String[] args) {
        int row = 5, col = 3;
        int res = generate(row, col);
        System.out.println(res);
    }

    public static int generate(int row, int col) {
        int element = (int) nCr(row - 1, col - 1);
        return element;
    }

    public static int nCr(int n, int row) {
        int res = 1;
        for (int i = 0; i < row; i++) {
            res = res * (n - i);
            res = res / (i + 1);

        }
        return res;
    }
}

// TYPE : 2
// public class Main
// {
// public static void main(String[] args) {
// int N = 5;
// generate(N);

// }

// public static void generate(int N){
// int ans = 1;
// System.out.print(ans+" ");

// for(int i=1;i<N;i++){
// ans = ans*(N-i);
// ans = ans / i;
// System.out.print(ans+" ");
// }

// }

// }