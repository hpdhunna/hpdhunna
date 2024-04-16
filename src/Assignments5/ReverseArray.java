public class ReverseArray {
    public static void main(String[] args) {
        int[]originalarray= {10,30,43,54,23,543,43,32};
        System.out.println(originalarray);

        int[]ReverseArray= reverseArray(originalarray);
        System.out.println(ReverseArray);
        PrintArray(originalarray);
    }
}
public static int[] reverseArray(int[] arr) {
    int[] reevrsed = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        reevrsed[i] = arr[arr.length - 1 - i];
    }
    return reevrsed;
}
public static void PrintArray(int[]arr)
{
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");

    }
}


