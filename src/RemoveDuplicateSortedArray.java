public class RemoveDuplicateSortedArray {

    public static int RemoveDuplicateSortedArrayFun(int[] nums) {

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j+1;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Number of unique elements in array are:" + RemoveDuplicateSortedArrayFun(nums));
    }
}
