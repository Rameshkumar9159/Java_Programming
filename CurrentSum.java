import java.util.Scanner;
public class CurrentSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter numbers to sum (enter 0 to stop):");
		while (true) {
			int num = sc.nextInt();
			if (num == 0) break;
			sum += num;
		}
		System.out.println("Sum: " + sum);
	}
}
