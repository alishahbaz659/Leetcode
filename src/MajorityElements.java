import java.util.HashMap;

public class MajorityElements {


    public static int majorityElementsFun(int[] nums) {

        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int candidate : nums) {
            map.put(candidate, map.getOrDefault(candidate, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) > len / 2) {
                return num;
            }
        }
        return -1;
    }

    /* using Moore voting algorithm*/

    public static int majorityElementMooreFun(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }else {
                count--;
            }
        }

        return candidate;
    }


    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        System.out.println("Majority occurred element in the array: " + majorityElementsFun(nums));
        System.out.println("Majority occurred element in the array using Moore Voting Algorithm: " + majorityElementMooreFun(nums));

    }
}
