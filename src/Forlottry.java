import java.util.Scanner;
public class Forlottry {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to my Lottery System");

        System.out.println("Enter the number you want to try,you can try 3 times");
        int number = scanner.nextInt();
        int n=3;

        {
                int luckyNumber = 45;
            if (number == 45) {
                System.out.println("You won the Lottery of $50k");

            }

            else
            {

                System.out.println("Sorry, try again");

            }
        }
    }
}
