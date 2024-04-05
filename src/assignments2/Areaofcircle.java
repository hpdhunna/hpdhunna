package assignments2;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        double Area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the raduis of the circle");
        float ra= scanner.nextFloat();
        Area=3.14*ra*ra;

        System.out.println("Area is " +Area);


    }
}
