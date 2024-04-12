package Methods;
import java.util.Scanner;

public class Averageofthreenumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        double x = sc.nextDouble();
        System.out.println("Enter the second number");
        double y = sc.nextDouble();
        System.out.println("Enter the third number");
        double z = sc.nextDouble();
        System.out.println("The average of numbers is " +average(x,y,z));
    }
    public static double average(double x,double y,double z)
    {return (x+y+z)/3;
    }
}
