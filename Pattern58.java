public class Pattern58 {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = n; i >= 1; i--) {
            // print leading spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
