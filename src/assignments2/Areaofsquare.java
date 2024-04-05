package assignments2;
import java.util.Scanner;

public class Areaofsquare {
    public static void main(String[] args) {
        double Area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of side of the square");
        double a= scanner.nextDouble();
        Area= a*a;
        System.out.println("Area of Square is"  +Area);

    }
}
