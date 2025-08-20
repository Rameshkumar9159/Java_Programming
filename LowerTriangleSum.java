import java.util.Scanner;
public class LowerTriangleSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size (n): ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int sum = 0;
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		// Sum lower triangle including diagonal
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				sum += mat[i][j];
			}
		}
		System.out.println("Lower triangle sum: " + sum);
	}
}
