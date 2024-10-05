/*
* Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper,
* return the researcher's h-index.
According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h
* such that the given researcher has published at least h papers that have each been cited at least h times.*/

import java.util.Arrays;

public class HIndex {

    // O (nlogn)
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

    public static void main(String[] args) {
        int[] citations = {5,5,5,5,5};
        System.out.println("H-index of the researcher: " + hIndex(citations));
    }
}
