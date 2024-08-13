// Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.

// Input Format

// First Line contains an integer T,T testcases follow

// Each testcase contains two integers M and N .

// The next M lines contains N integers,array[M][N]

// Output Format

// Print testcase number followed by its output

// Sample Input

// 3

// 2 2

// 1 0

// 0 0

// 2 3

// 0 0 0

// 0 0 1

// 3 4

// 1 0 0 1

// 0 0 1 0

// 0 0 0 0

// Sample Output

// 1

// 1 1

// 1 0

// 2

// 0 0 1

// 1 1 1

// 3

// 1 1 1 1

// 1 1 1 1

// 1 0 1 1

import java.util.Scanner;

public class BooleanMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[][] mat = new int[M][N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            boolean[] row = new boolean[M];
            boolean[] col = new boolean[N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (mat[i][j] == 1) {
                        row[i] = true;
                        col[j] = true;
                    }
                }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (row[i] || col[j]) {
                        mat[i][j] = 1;
                    }
                }
            }

            System.out.println(t);
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a
// matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
// public class Main
// {
// public static void main(String[] args) {
// int[][] mat = {
// {1, 0, 0},
// {0, 1, 0},
// {0, 0, 0}
// };

// System.out.println("Original Matrix:");
// printMatrix(mat, 3, 3);

// modifyMatrix(mat, 3, 3);

// System.out.println("Modified Matrix:");
// printMatrix(mat, 3, 3);
// }

// public static void printMatrix(int[][]mat, int M, int N){
// for(int i=0;i<M;i++){
// for(int j=0;j<N;j++){
// System.out.print(mat[i][j]+" ");
// }
// System.out.println();
// }
// }

// public static void modifyMatrix(int[][]mat, int M, int N){
// for(int i=0;i<M;i++){
// for(int j=0;j<N;j++){
// if(mat[i][j] == 1){
// //UP
// if(i>0 && mat[i-1][j] == 0){
// mat[i-1][j] = -1;
// }
// //DOWN
// if(i<M-1 && mat[i+1][j] == 0){
// mat[i+1][j] = -1;
// }
// //LEFT
// if(j>0 && mat[i][j-1] == 0){
// mat[i][j-1] = -1;
// }
// //RIGHT
// if(j<N-1 && mat[i][j+1] == 0){
// mat[i][j+1] = -1;
// }
// }
// }
// }

// for(int i=0;i<M;i++){
// for(int j=0;j<N;j++){
// if(mat[i][j] == -1){
// mat[i][j] = 0;
// }
// }
// }
// }
// }