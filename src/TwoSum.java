
/*
*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*
*/

/*
* Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*
*
* */

import java.sql.Array;
import java.util.Arrays;

public class TwoSum {

    private int[] calculateTwoSum(int[] arr, int target) {
        int[] indexes = new int[2];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                    //   System.out.println(i + " " + j);
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {3, 2, 4};
        int target = 6;
        int[] foundIndexes = twoSum.calculateTwoSum(arr, target);
        System.out.println(Arrays.toString(foundIndexes));

    }
}
