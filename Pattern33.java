public class Pattern33 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            // print leading spaces
            for (int s = 6; s > i; s--) {
                System.out.print(" ");
            }
            // print Bs
            for (int j = 1; j <= i; j++) {
                System.out.print("B");
            }
            System.out.println();
        }
    }
}
