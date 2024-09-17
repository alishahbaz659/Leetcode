import java.util.Arrays;

public class RemoveElements {

    public static int removeElementsFun(int[] nums, int val) {


        // 1st Approach
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[i] = nums[i];
                index++;
            }

        }
        return index;
    }

    public static int removeElementsFunTwoPointer(int[] nums, int val) {
        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] == val) {
                right++;
            } else {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        return left;
    }


    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        System.out.println("Length of the array after removing elements:" + removeElementsFun(nums, val));
        System.out.println("Length of the array after removing elements using two points approach:" + removeElementsFunTwoPointer(nums, val));

    }
}
