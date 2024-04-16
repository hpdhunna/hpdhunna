public class Arraydemo {
    public static void main(String[] args) {
        int arr[] = {23, 44, 23, 52, 54, 23, 87, 87};
        int sum = 0;
        int i=0;


        for ( i = 0; i < arr.length; i++) {
            sum = sum + arr[i];


        }
        System.out.println(sum);
    }
}
