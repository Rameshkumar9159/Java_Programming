import java.util.Scanner;

public class StringCombinations68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().replace(" ", "");
        int n = input.length();
        System.out.println("All combinations:");
        for (int i = 1; i < (1 << n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sb.append(input.charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}
