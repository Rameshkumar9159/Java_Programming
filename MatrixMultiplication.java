import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for first matrix: ");
        int m = sc.nextInt(), n = sc.nextInt();
        System.out.print("Enter rows and columns for second matrix: ");
        int p = sc.nextInt(), q = sc.nextInt();

        if (n != p) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] a = new int[m][n];
        int[][] b = new int[p][q];
        int[][] result = new int[m][q];


        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input, please enter an integer:");
                    sc.next(); // discard invalid input
                }
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input, please enter an integer:");
                    sc.next(); // discard invalid input
                }
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < m; i++)
            for (int j = 0; j < q; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += a[i][k] * b[k][j];

        System.out.println("Result:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}