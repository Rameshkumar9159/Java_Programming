import java.util.Scanner;
public class BiggestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		int biggest = a;
		if (b > biggest) biggest = b;
		if (c > biggest) biggest = c;
		System.out.println("Biggest number is: " + biggest);
	}
}
