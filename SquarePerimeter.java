import java.util.Scanner;
public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        int side = sc.nextInt();
        int perimeter = 4 * side;
        System.out.println("Perimeter of square: " + perimeter);
    }
}

