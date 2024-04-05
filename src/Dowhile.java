import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        int n;
        int counter=1;
        int  sum=0;
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        System.out.println("Enter the value of n");

       do {
           System.out.println(counter);
           counter++;
           sum= sum+counter;
           System.out.println(sum);
       }

while(counter<=n);



    }



}
