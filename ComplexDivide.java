import java.util.Scanner;

public class ComplexDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        double a = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double b = sc.nextDouble();
        System.out.print("Enter real part of second complex number: ");
        double c = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double d = sc.nextDouble();

        // (a+bi)/(c+di) = [(ac+bd) + (bc-ad)i] / (c^2 + d^2)
        double denominator = c * c + d * d;
        double real = (a * c + b * d) / denominator;
        double imag = (b * c - a * d) / denominator;

        System.out.printf("Result: %.2f + %.2fi\n", real, imag);
    }
}