package April13;

public class ArrayDemo
{
    public static void main(String[] args) {
        int sample[]= new int[10];
        int i;
        for(i=0;i<10;i++)
            sample[i] =i;
        for(i=0;i<10;i=i+1)
            System.out.println(sample[i]);
    }
}
