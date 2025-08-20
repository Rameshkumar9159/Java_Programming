import java.util.Scanner;
public class LeapYearCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for (int year = start; year <= end; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                count++;
            }
        }
        System.out.println("Leap year count: " + count);
    }
}
