package Methods;
import java.util.Scanner;
public class Smallestnumber  {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        double x= in.nextDouble();
        System.out.println("Enter the second number");
        double y= in.nextDouble();
        System.out.println("Enter the third number");
        double z= in.nextDouble();
        System.out.println("The smallest number is " + smallest(x,y,z) );
    }
    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x,y),z);
    }
}
