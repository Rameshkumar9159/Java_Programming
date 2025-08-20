import java.util.Scanner;
public class SeriesFactDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            long fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum += (double)fact / i;
        }
        System.out.println("Sum of series: " + sum);
    }
}
