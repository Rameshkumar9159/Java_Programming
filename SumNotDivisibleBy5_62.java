import java.util.Scanner;
public class SumNotDivisibleBy5_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum not divisible by 5: " + sum);
    }
}
