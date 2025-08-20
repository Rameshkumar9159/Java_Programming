import java.util.Scanner;
public class DisplayNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bit = sc.nextInt();
        int value = (n >> (bit - 1)) & 1;
        System.out.println("nth bit: " + value);
    }
}
