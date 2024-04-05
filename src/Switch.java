import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int  num2= scanner.nextInt();
        int result = 0;
        System.out.println();
        System.out.println("choices for calculator");
        System.out.println(" Press 1 for addition");
        System.out.println(" Press 2 for sub");
        System.out.println(" Press 3 for multiply");
        System.out.println(" Press 4 for division");
        System.out.println(" Press 5 for remainder");
        System.out.println();
        System.out.println("Enter choice");
        int choice = scanner.nextInt();
        System.out.println();
        switch (choice)
        {
            case 1:
                result = num1+num2;
                System.out.format("Addition of %d and %d is %d",num1 ,num2 ,result);
                break;
            case 2:
                result = num1-num2;
                System.out.format("Subtraction of %d and %d is %d",num1 , num2 , result);
                break;

            case 3:
                result = num1*num2;
                System.out.format("Multiplication of %d and %d is %d",num1 , num2 , result);
                break;
            case 4:
                double div = num1/num2;
                System.out.format("division of %d and %d is %.2f",num1 , num2 , result);
                break;
            case 5:
                result = num1%num2;
                System.out.format("Remainder of %d and %d is %d",num1 , num2 , result);
                break;









        }
        }
}
