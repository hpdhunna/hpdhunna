public class Arraydemo2 {
    public static void main(String[] args) {
        int[] arr = {70,10, 20, 30, 40, 50, 20};
        int max = arr[0];

        for ( int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }


        }
        System.out.println(max);
    }
}
