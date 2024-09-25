import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArrayFun(int[] nums, int k){
        
        k = k%nums.length;      
        RevereArray(nums,0,nums.length-1); 
        RevereArray(nums,0,k-1);
        RevereArray(nums, k, nums.length-1);
 
        return nums;
    }
    public static void RevereArray(int[] nums, int start, int end){

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("Reverse of the array is: "+ Arrays.toString(rotateArrayFun(nums,3)));
    }
}
