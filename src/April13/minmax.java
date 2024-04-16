package April13;

public class minmax {
    public static void main(String[] args) {
        int nums[]={99,-10,10023,18,-978,463};
        int min;
        int max;
        min=max=nums[0];
        for (int i = 1; i < 6; i++) {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            if(nums[i]>max)
            {
                max=nums[i];
            }

            System.out.println(min);
            System.out.println(max);
        }
    }
}
