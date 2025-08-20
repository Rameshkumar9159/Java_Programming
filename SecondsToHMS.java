import java.util.Scanner;
public class SecondsToHMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
