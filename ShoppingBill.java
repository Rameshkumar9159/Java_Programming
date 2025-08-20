import java.util.Scanner;
public class ShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter quantity and unit price for item " + i + ": ");
            int qty = sc.nextInt();
            double price = sc.nextDouble();
            total += qty * price;
        }
        System.out.println("Total Bill: " + total);
    }
}
