package assignments2;
import java.util.Scanner;

public class Eligbleforvote {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the age");
        int age= scanner.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("Sorry,you are not eligible to vote");
        }

    }
}
