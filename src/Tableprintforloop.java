import java.util.Scanner;

public class Tableprintforloop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number for you want to print table");
        int num = scanner.nextInt();



        for (int j = 0; j <=10; j++) {
            System.out.printf("%d * %d = %d \n" ,num,j, num*j);
        }

        }
}
