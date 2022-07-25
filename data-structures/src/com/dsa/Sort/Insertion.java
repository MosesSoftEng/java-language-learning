package com.dsa.Sort;

import java.util.Arrays;

/**
 * Sorting algorithm: Insertion sort.
 *
 * Sort array of integers using insertion sort in ascending order.
 *
 * Pseudocode
 * 1. Loop each element in array
 * 2.   Loop backwards, from previous element from current
 * 3.       if previous element > current element, swap
 */
public class Insertion {
    public static void main (String args[]) {
        Insertion i = new Insertion();

        int[] sortedArr = i.insertionSort(new int[]{0, 1, 2, 4, 3, 5});

        System.out.println(Arrays.toString(sortedArr));
    }

    public int[] insertionSort(int[] arr) {

        // Loop each element
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            // System.out.println(currentElement);

            // Loop backwards
            for (int j = i - 1; j > -1 ; j--) {
                int previousElement = arr[j];

                if(previousElement > currentElement) {
                    arr[j + 1] = previousElement;
                    arr[j] = currentElement;
                }

                // System.out.print(arr[j] + ", ");
            }

            System.out.println();
        }

        return arr;
    }
}
