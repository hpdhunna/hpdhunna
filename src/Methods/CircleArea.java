package Methods;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the raduis of the circle");
        double raduis = scanner.nextDouble();

        double area=calculateArea(raduis);
        System.out.println("The area of the circle is "  + area);
    }
    public static double calculateArea(double raduis) {
        return Math.PI * raduis * raduis;

    }
}
