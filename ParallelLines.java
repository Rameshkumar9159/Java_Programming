import java.util.Scanner;
public class ParallelLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter slope of line 1:");
        double m1 = sc.nextDouble();
        System.out.println("Enter slope of line 2:");
        double m2 = sc.nextDouble();
        if (m1 == m2) {
            System.out.println("Lines are parallel");
        } else {
            System.out.println("Lines are not parallel");
        }
    }
}
