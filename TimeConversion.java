import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        // IST to London (IST - 4:30)
        int londonHour = (hour - 4 + 24) % 24;
        int londonMin = (min - 30 + 60) % 60;
        if (min < 30) londonHour = (londonHour - 1 + 24) % 24;
        // IST to New York (IST - 9:30)
        int nyHour = (hour - 9 + 24) % 24;
        int nyMin = (min - 30 + 60) % 60;
        if (min < 30) nyHour = (nyHour - 1 + 24) % 24;
        System.out.printf("London Time: %02d:%02d:%02d\n", londonHour, londonMin, sec);
        System.out.printf("New York Time: %02d:%02d:%02d\n", nyHour, nyMin, sec);
    }
}
