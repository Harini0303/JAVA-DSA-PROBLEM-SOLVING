// Input: 
// 4
// 1 2 3 4
// 4 3 2 1
// 7 8 9 6
// 6 5 4 3
// Output:
// Principal Diagonal: 1, 3, 9, 3
// Secondary Diagonal: 4, 2, 8, 6
// Input:
// 3
// 1 1 1
// 1 1 1
// 1 1 1
// Output:
// Principal Diagonal: 1, 1, 1
// Secondary Diagonal: 1, 1, 1

public class DiagonalOfTheMatrix {

    static void printPrincipalDiagonal(int mat[][], int n) {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + ", ");
        }
        System.out.println("");
    }

    static void printSecondaryDiagonal(int mat[][], int n) {
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][n - 1 - i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int n = 4;
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };

        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }
}
