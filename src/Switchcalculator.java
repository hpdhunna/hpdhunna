import java.util.Scanner;
public class Switchcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=0;
        do {

                System.out.println("Welcome to my calculator");
                System.out.println("1.Addition");
                System.out.println("Subtraction");
                System.out.println("Enter your choices from the above:please only enter numbers");
                int input = sc.nextInt();
                switch (input) {

                    case 1:
                        System.out.println("enter the first number");
                        int x = sc.nextInt();
                        System.out.println("Enter the second number");
                        int y = sc.nextInt();
                        int sum = x + y;
                        System.out.println("sum is" + sum);
                        break;
                    case 2:
                        System.out.println("enter the first number");
                        int a = sc.nextInt();
                        System.out.println("Enter the second number");
                        int b = sc.nextInt();
                        int sub = a - b;
                        System.out.println("sub is" + sub);
                        break;
                }

                System.out.println("Do you want to continue, Press y for yes and Press n for No");
            }
            while (c == 'y' || c == 'Y') ;
        }
    }



