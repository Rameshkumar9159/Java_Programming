import java.util.Scanner;

public class ArmstrongBetween64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int temp = num, sum = 0, digits = 0;
            // Count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = num;
            // Calculate Armstrong sum
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
