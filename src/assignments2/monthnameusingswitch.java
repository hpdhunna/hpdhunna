package assignments2;
import java.util.Scanner;

public class monthnameusingswitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number from 1-12 to get to know the month");
        int month= scanner.nextInt();
        switch(month)
        {
            case 1:
                System.out.println("Its a Janurary");
                break;
            case 2:
                System.out.println("Its a Feburary");
                break;
            case 3:
                System.out.println("Its March");
            case 4:
                System.out.println("Its a April");
                break;
            case 5:
                System.out.println("Its a May");
                break;
            case 6:
                System.out.println("Its June");
                break;
            case 7:
                System.out.println("Its july");
                break;
            case 8:
                System.out.println("Its a August");
                break;
            case 9:
                System.out.println("Its September");
            case 10:
                System.out.println("Its October");
                break;
            case 11:
                System.out.println("Its November");
                break;
            case 12:
                System.out.println("Its December");
                break;

        }


    }
}
