package Methods;
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side of the square");
        double side= scanner.nextDouble();
        double area= calculatearea(side);
        System.out.println("The area of square is "  +area);
    }

    public static double calculatearea(double side
    ) {
        return side * side;
    }
    }

