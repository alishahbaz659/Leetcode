/*
* Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper,
* return the researcher's h-index.
According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h
* such that the given researcher has published at least h papers that have each been cited at least h times.*/

import java.util.Arrays;

public class HIndex {

    // O(nlogn)
    public static int hIndex(int[] citations) {
        int h = citations.length;
        int maximum = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= h - i) {
                maximum = Math.max(maximum, h - i);

            }
        }
        return maximum;
    }

    // using counting approach
    /* The idea is to check the citations for each index, and increase the count of the index accordingly
    let say in this example {3,0,6,1,5} at index 0 we can see that paper 0 is cited 3 times, we can create another array
    and at index 3 we will increase the count to 1. And then at index 0 increase count to 1. Then at index 6 increase count to 1 (But there is no index
    6 then we will increase the count at index n-1 because there are maximum of five papers citations can be any number)
    * */
    public static int hIndexCountApproach(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n + 1];
        int count = 0;

        for (int c : citations) {
            if (c > n) {
                arr[n] = arr[n] + 1;
            } else {
                arr[c] = arr[c] + 1;
            }
        }

        for (int i = n; i >= 0; i--) {
            count = count + arr[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
//        System.out.println("H-index of the researcher: " + hIndex(citations));
        System.out.println("H-index of the researcher using count approach: " + hIndexCountApproach(citations));

    }
}
