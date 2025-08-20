import java.util.Scanner;
public class AgeGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age <= 5) System.out.println("Nice child");
        else if (age <= 10) System.out.println("Nice kid");
        else if (age <= 15) System.out.println("Teenager");
        else if (age <= 25) System.out.println("Young dynamic");
        else if (age <= 50) System.out.println("Middle age");
        else System.out.println("Old");
    }
}
