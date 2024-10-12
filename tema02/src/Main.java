import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new Random().ints(n,1,50).toArray();
        int[] result = MinMax(numbers);
        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
    static int[] MinMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            else if (nums[i] < min)
                min = nums[i];
        }
        return new int[]{min,max};
    }

}
