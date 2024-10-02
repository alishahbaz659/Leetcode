public class JumpGameII {


    /* The point to use greedy approach set up a greed criteria.
     * The greed criteria is to choose the farthest I can go, from my available options
     * We are extending our coverage at every step.
     * Like on first index we can either go to index 1 or index 2
     * So I have two options after jumping from 0 index, max I can go is either on 1 or 2. Then I will check again on 1 and
     * 2 that what is the farthest I can go from these points. And update the coverage window again. lastJumpIdx will
     * keep track of the last visited element from the current available window.
     * */

    public static int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length - 1; //destination is the last index
        int coverage = 0; //the farthest we can go
        int lastJumpIdx = 0; // it will tell this was the point where I could reach

        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;

                //check if we reached destination already
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }

        return totalJumps;
    }

    //this one is using BFS and doing recursion to find the minimum number of jumps
    public static int minJumpsRecursion(int[] nums, int position) {
        int n = nums.length;

        // Base case: if you have reached the last index, no more jumps are needed
        if (position == n - 1) {
            return 0;
        }

        // If the value at the current position is 0, you can't move forward
        if (nums[position] == 0) {
            return Integer.MAX_VALUE; // Impossible to proceed
        }

        // The maximum number of steps we can take from the current index
        int maxJump = nums[position];

        // Initialize the minimum number of jumps to a large value
        int minJumps = Integer.MAX_VALUE;

        // Try all possible jumps from this position
        for (int i = 1; i <= maxJump && position + i < n; i++) {
            int jumps = minJumpsRecursion(nums, position + i);

            // If jumps is valid, update the minimum number of jumps
            if (jumps != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, jumps + 1);
            }
        }
        return minJumps;

    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Min jump required: " + jump(nums));
    }
}
