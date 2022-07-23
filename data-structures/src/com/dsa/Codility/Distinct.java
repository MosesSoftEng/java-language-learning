package com.dsa.Codility;

import java.util.Arrays;

/**
 * Codility lesson 6 Sorting.
 * Task Distinct.
 * Compute number of distinct values in an array
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 *
 *  Pseudocode: Applying sorting function
 *  1. Sort array in ascending order.
 *  2. Count unique elements while looping.
 *
 *  Submission
 *  https://app.codility.com/demo/results/trainingGMYTKS-5K6/
 */
public class Distinct {
    /**
     * Method to compute number of distinct values in an array.
     * @param A
     * @return number of distinct values if any, otherwise 0
     */
    public int solution(final int[] A) {
        int count = 0;
        int arrayLength = A.length;

        if (arrayLength > 0)
            count++;

        /* Sort Array */
        Arrays.sort(A);

        //  Skip first element as it is unique
        for (int i = 1; i < A.length; i++) {
            // Compare current element with previous, if different increment count
            if(A[i] != A[i-1])
                count++;
        }

        return count;
    }
}
