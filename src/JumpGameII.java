public class JumpGameII {


    public static int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int farthest = 0;

        // Implicit BFS
        for (int i = 0; i < nums.length - 1; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                ++ans;
                break;
            }
            if (i == end) {   // Visited all the items on the current level
                ++ans;          // Increment the level
                end = farthest; // Make the queue size for the next level
            }
        }

        return ans;
    }

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
        System.out.println("Min jump required: " + minJumpsRecursion(nums,0));
    }
}
