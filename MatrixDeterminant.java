import java.util.Scanner;

public class MatrixDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int det = 0;
        if (n == 2) {
            det = mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
        } else if (n == 3) {
            det = mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])
                - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
                + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
        } else {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            return;
        }
        System.out.println("Determinant: " + det);
    }
}