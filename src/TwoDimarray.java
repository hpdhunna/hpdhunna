import java.util.Scanner;

public class TwoDimarray {

    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{56,25,10,12}};
        int arr1[][]={{56,25,10,12},{12,25,23,10}};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr1.length;j++)
            {
                sum=arr[i][j]+arr1[i][j];
            }
            System.out.println("sum of arrays is" + sum);
        }

    }
}
