package assignments01;

import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        System.out.println("Enter the marks");
        if (marks>=90 && marks<=100)
        {
            System.out.println("A Grade");

        } else if (marks>=80 && marks<=89) {
            System.out.println("B Grade");

        } else if (marks>=70 && marks<=79) {
            System.out.println("C Grade");

        } else if (marks>=60 && marks<=69) {
            System.out.println("D Grade");

        } else if (marks>=0 && marks<=59) {
            System.out.println("Fail");

        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }
}
