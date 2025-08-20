public class Pattern60 {
    public static void main(String[] args) {
        int n = 5; // height
        for (int i = n; i >= 1; i--) {
            // leading spaces
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            // stars: 2*i - 1 keeps a perfect center column
            for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
