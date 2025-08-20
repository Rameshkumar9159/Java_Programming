import java.util.Scanner;
public class BinaryToHexa66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal: " + hex);
    }
}
