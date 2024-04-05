package assignments2;
import java.util.Scanner;
public class Weekdayorweekend {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day of the week in lower case");
        String day= scanner.next();
        switch(day.toLowerCase())
        {
            case "sunday":
                System.out.println("Its a weekend");
                break;
            case "monday":
                System.out.println("Its a weekday");
                break;
            case "tuesday":
                System.out.println("Its a weekday");
                break;
            case "wednesday":
                System.out.println("Its a weekday");
                break;
            case "thursday":
                System.out.println("Its a weekday");
                break;
            case "friday":
                System.out.println("Its a weekday");
                break;
            case "saturday":
                System.out.println("Its a weekend");
                break;

        }



    }
}
