// Matrix inverse is complex and usually requires a library. Here is a simple 2x2 implementation.
import java.util.Scanner;
public class MatrixInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                mat[i][j] = sc.nextInt();
        int det = mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
        if (det == 0) {
            System.out.println("Inverse not possible");
            return;
        }
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / (double)det;
        inv[0][1] = -mat[0][1] / (double)det;
        inv[1][0] = -mat[1][0] / (double)det;
        inv[1][1] = mat[0][0] / (double)det;
        System.out.println("Inverse:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%.2f ", inv[i][j]);
            }
            System.out.println();
        }
    }
}
