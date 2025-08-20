import java.util.Scanner;
public class HexaToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int dec = Integer.parseInt(hex, 16);
        System.out.println("Decimal: " + dec);
    }
}
