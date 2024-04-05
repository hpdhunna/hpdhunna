package assiggnment3;
import java.util.Scanner;

public class Factorialfind {
    public static void main(String[] args) {
        int i=1, fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial");
        int number= scanner.nextInt();
        do
        {
            fact=fact*i;
            i++;

        }
        while(i<=number);
        System.out.println("Factorial of " +number+ " is" + fact);
    }
}
