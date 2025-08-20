import java.util.Scanner;
public class SecondLargest50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        System.out.println("Second largest: " + second);
    }
}
