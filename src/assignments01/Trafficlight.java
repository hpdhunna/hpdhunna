package assignments01;
import java.util.Scanner;

public class Trafficlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter red/yellow/green color to simulate a traffic light: ");

        String color = scanner.next();

        switch (color.toLowerCase()) {

            case "red":
                System.out.println("STOP!!!!");
                break;

            case "yellow":
                System.out.println("Prepare to STOP!!!!");
                break;

            case "green":
                System.out.println("GO!!!!");
                break;

        }
    }
}
