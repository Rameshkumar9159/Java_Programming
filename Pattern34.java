public class Pattern34 {
    public static void main(String[] args) {
        int n = 6; // number of rows
        for (int i = n; i >= 1; i--) {
            // print leading spaces
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            // print A's
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            // print B's
            for (int j = 1; j <= i; j++) {
                System.out.print("B");
            }
            System.out.println();
        }
    }
}
