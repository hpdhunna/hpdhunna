package assiggnment3;

import java.util.Scanner;
public class Tableof5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number for you want to print table");
        int num = scanner.nextInt();

       int i=1;


       do {
           System.out.printf("%d * %d = %d \n" ,num,i, num*i);
           i++;

       }

        while(i<=10);


    }
}
