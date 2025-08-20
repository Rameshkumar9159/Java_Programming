import java.util.Scanner;
public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Hexadecimal: " + Integer.toHexString(n).toUpperCase());
    }
}
