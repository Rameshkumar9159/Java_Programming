import java.util.Scanner;
public class EvenReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] evens = new int[n];
        for (int i = 0; i < n; i++) {
            evens[i] = 2 * (i + 1);
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }
}
