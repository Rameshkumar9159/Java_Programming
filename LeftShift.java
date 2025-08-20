import java.util.Scanner;
public class LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shift = sc.nextInt();
        System.out.println("Left shifted: " + (n << shift));
    }
}
