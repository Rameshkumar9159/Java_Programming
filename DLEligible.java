import java.util.Scanner;
public class DLEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for DL");
        } else {
            System.out.println("Not eligible for DL");
        }
    }
}
