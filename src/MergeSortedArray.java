/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
        Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

*/


import java.util.Arrays;

public class MergeSortedArray {

    private static void MergeSortedArrayFun(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1 and nums2, and for the position in the merged array
        int i = m - 1;  // Pointer for the last valid element in nums1
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in the merged nums1 array

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            // Compare elements from the end of both arrays and place the larger one in the correct position
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];  // Place nums2[j] in the current position of nums1
                j--;  // Move pointer in nums2 leftwards
            } else {
                nums1[k] = nums1[i];  // Place nums1[i] in the current position of nums1
                i--;  // Move pointer in nums1 leftwards
            }
            k--;  // Move the pointer in the merged array leftwards
        }

        // If there are remaining elements in nums1, they are already in the correct position
        // No action is needed for them since nums1 already contains them in place

        // If there are remaining elements in nums2, place them into nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];  // Place the remaining elements of nums2 into nums1
        }
    }




    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};


        MergeSortedArrayFun(nums1, 3, nums2, 3);  // m = 3, n = 3
        System.out.println(Arrays.toString(nums1));  // Output should be [1, 2, 2, 3, 5, 6]
    }

}


