import java.util.Scanner;
import java.util.Arrays;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Character[] arr = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr, (a, b) -> {
            int cmp = Character.toLowerCase(a) - Character.toLowerCase(b);
            if (cmp != 0) return cmp;
            return a - b; // If same letter, uppercase comes first
        });
        StringBuilder sb = new StringBuilder();
        for (char c : arr) sb.append(c);
        System.out.println(sb.toString());
    }
}
