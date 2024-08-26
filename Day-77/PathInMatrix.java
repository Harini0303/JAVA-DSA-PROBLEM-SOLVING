
public class PathInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 0, 1, 0, 0 },
                { 1, 1, 1, 1, 1 },
                { 0, 0, 0, 1, 0 },
                { 1, 0, 1, 1, 1 },
                { 0, 1, 1, 0, 1 }
        };

        int N = matrix.length;
        boolean[][] visited = new boolean[N][N];
        System.out.println(canReachEnd(matrix, visited, 0, 0, N) ? "Yes" : "No");
    }

    private static boolean canReachEnd(int[][] matrix, boolean[][] visited, int x, int y, int N) {
        if (x == N - 1 && y == N - 1) {
            return true;
        }

        visited[x][y] = true;

        if (isValidMove(matrix, visited, x, y + 1, N) && canReachEnd(matrix, visited, x, y + 1, N)) {
            return true;
        }

        if (isValidMove(matrix, visited, x + 1, y, N) && canReachEnd(matrix, visited, x + 1, y, N)) {
            return true;
        }

        visited[x][y] = false;
        return false;
    }

    private static boolean isValidMove(int[][] matrix, boolean[][] visited, int x, int y, int N) {
        return x >= 0 && y >= 0 && x < N && y < N && matrix[x][y] == 1 && !visited[x][y];
    }
}

// public class PathInMatrix {
// public static void main(String[] args) {
// int[][] matrix = {
// {1, 0, 1, 0, 0},
// {1, 1, 1, 1, 1},
// {0, 0, 0, 1, 0},
// {1, 0, 1, 1, 1},
// {0, 1, 1, 0, 1}
// };
// int N = matrix.length;
// System.out.println(canReachEnd(matrix, N) ? "Yes" : "No");
// }

// private static boolean canReachEnd(int[][] matrix, int N) {
// boolean[][] dp = new boolean[N][N];

// if (matrix[0][0] == 1) {
// dp[0][0] = true;
// }

// for (int i = 0; i < N; i++) {
// for (int j = 0; j < N; j++) {
// if (matrix[i][j] == 1) {
// if (j > 0 && dp[i][j - 1]) {
// dp[i][j] = true;
// }
// if (i > 0 && dp[i - 1][j]) {
// dp[i][j] = true;
// }
// }
// }
// }

// return dp[N - 1][N - 1];
// }
// }
