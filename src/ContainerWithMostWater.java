/*
*  Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0)
* and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 * */

/*Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
*/


public class ContainerWithMostWater {

    private int ContainerWithMostWater(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);

            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxArea;

        //brute force

//        int Area = 0;
//
//        for(int i = 0; i < a.length; i++)
//        {
//            for(int j = i + 1; j < a.length; j++)
//            {
//                Area = Math.max(
//                        Area, Math.min(a[i], a[j]) *
//                                (j - i));
//            }
//        }
//        return Area;

    }


    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] containerHeight = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxHeight=obj.ContainerWithMostWater(containerHeight);
        System.out.println(maxHeight);
    }
}
