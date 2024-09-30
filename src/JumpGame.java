/*
Jump Game

You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

*/

public class JumpGame {

    public static boolean canJump(int[] nums) {

        int finalPosition = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }

        return (finalPosition == 0);
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 0};
        System.out.println(canJump(nums));
    }
}
