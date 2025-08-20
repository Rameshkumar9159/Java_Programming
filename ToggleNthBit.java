import java.util.Scanner;
public class ToggleNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bit = sc.nextInt();
        int result = n ^ (1 << (bit - 1));
        System.out.println("Result: " + result);
    }
}
