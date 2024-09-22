import java.util.HashMap;

public class MajorityElements {

    public static int majorityElementsFun(int[] nums) {

        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int candidate : nums) {
            map.put(candidate, map.getOrDefault(candidate, 0) + 1);
        }

        for (int num : nums){
            if(map.get(num) > len/2){
                return num;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        System.out.println("Majority occurred element in the array: " + majorityElementsFun(nums));

    }
}
