import java.util.Scanner;
public class Factorialfind {
    public static void main(String[] args) {
        int i, fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial");
        int number= scanner.nextInt();
        for(i=1;i<=number;++i)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of" +number+"is" +fact);
    }

        }



