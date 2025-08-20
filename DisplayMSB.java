import java.util.Scanner;
public class DisplayMSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int msb = 0;
        int temp = n;
        while (temp > 1) {
            temp >>= 1;
            msb++;
        }
        System.out.println("MSB: " + ((n >> msb) & 1));
    }
}
