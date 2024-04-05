package assiggnment3;
import java.util.Scanner;
public class Sumofnnaturalnumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number,untill you want to find the natural numbers");
        int n= scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum= sum+i;

        }
        System.out.println("The sum of natural numbers is "  + sum);
    }
}


