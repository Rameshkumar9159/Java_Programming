public class First20EvenReverse {
    public static void main(String[] args) {
        int[] evens = new int[20];
        for (int i = 0; i < 20; i++) {
            evens[i] = 2 * (i + 1);
        }
        for (int i = 19; i >= 0; i--) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }
}
