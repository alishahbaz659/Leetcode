import java.util.Arrays;

public class RemoveElements {

    public static int removeElementsFun(int[] nums, int val) {

        int right = nums.length - 1;
        int left = 0;
        int k = 0;

        while (left < right) {
            if (nums[left] < nums[right]) {
                left++;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println("Length of the array after removing elements:" + removeElementsFun(nums, val));
    }
}
