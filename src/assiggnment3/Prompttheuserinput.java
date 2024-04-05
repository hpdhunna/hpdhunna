package assiggnment3;
import java.util.Scanner;
public class Prompttheuserinput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input;


        do
        {
            System.out.println("Enter your input (enter q to quit)");
            input= scanner.nextLine();


        }
        while(!input.equalsIgnoreCase("q"));
        System.out.println(" you have quit");
    }
}
