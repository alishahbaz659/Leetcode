/*
* Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper,
* return the researcher's h-index.
According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h
* such that the given researcher has published at least h papers that have each been cited at least h times.*/

import java.util.Arrays;

public class HIndex {

    public static int hIndex(int[] citations) {
        int index = 0;
        Arrays.sort(citations);
        int len = citations.length;

        if (citations.length == 1) {
            index = citations[0];
        }


        if (len % 2 == 0) {
            index = citations[len / 2 - 1];
        } else {
            index = citations[len / 2];
        }

        return index;
    }

    public static void main(String[] args) {
        int[] citations = {100};
        System.out.println("H-index of the researcher: " + hIndex(citations));
    }
}
