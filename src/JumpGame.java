public class JumpGame {

    public static boolean canJump(int[] nums) {
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        if(canJump(nums)){
            System.out.println("You can reach the last index.");
        }else {
            System.out.println("You cannot reach the last index.");
        }
    }
}
