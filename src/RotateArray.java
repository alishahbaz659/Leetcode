import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int[] rotatedArray = new int[nums.length];
        for (int r = 0; r < k; r++) {

            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    rotatedArray[i] = nums[nums.length - 1];
                } else {
                    rotatedArray[i] = nums[i - 1];
                }
            }
            //for leet code because it is checking original array for testing
            System.arraycopy(rotatedArray, 0, nums, 0, nums.length);
        }
        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
    }
}
