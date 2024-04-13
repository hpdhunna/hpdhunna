package Assignments4;

import java.util.Scanner;

public class Shape {

    public static double AreaofCircle(double raduis)
    {
        return 3.14*raduis*raduis;
    }
    public static double AreaofSquare(double side)
    {
        return side*side;
    }
    public static double AreaofRectangle(double length, double width)
    {
        return length*width;
    }

    public static void main(String[] args) {
        double Area= AreaofCircle(25);
        System.out.println("The area of circle is " + Area);
        double Area2 = AreaofSquare(12);
        System.out.println("The area of square is " + Area2);
        double Area3 = AreaofRectangle(12,15);
        System.out.println("The area of rectangle is " + Area3);
    }
}
