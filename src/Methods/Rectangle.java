package Methods;

public class Rectangle {
    double length;
    double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {

       double area= length*width;
        System.out.println("area is =" +area);
        return area;
    }

    public double calculatePerimeter() {

       double perimeter= length+width;
        System.out.println("Perimeter is"  + perimeter);
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 12, 24);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}