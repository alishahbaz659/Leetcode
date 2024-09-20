import java.util.Arrays;

public class RemoveDuplicatesSortedArrayII {

    public static int removeDuplicateSortedArrayIIFun(int[] nums) {

        int index = 0;

        for (int i = 0; i<nums.length;i++){

            if (index < 2 || nums[i] != nums[index - 2]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }


    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println("Length of the array after removing the duplicates with unique elements at most twice: " + removeDuplicateSortedArrayIIFun(arr));
    }
}
