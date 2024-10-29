import java.util.Arrays;
/*
* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

*
* */
public class ProductExceptSelf {


    //brute force method
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        System.out.println("Length of the array is this:" + nums.length);
        System.out.println("Length of the array is this:" + nums.length);
        System.out.println("Length of the array is this:" + nums.length);
        System.out.println("Length of the array is this:" + nums.length);
        System.out.println("Length of the array is this:" + nums.length);

        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Product of array except self: " + Arrays.toString(productExceptSelf(nums)));
    }
}
