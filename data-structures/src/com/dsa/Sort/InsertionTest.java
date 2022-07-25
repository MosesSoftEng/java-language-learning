package com.dsa.Sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionTest {
    Insertion i = new Insertion();

    @Test
    public void insertionSort() {
        // Empty array
        assertArrayEquals(new int[]{}, i.insertionSort(new int[]{}));

        // single element array
        assertArrayEquals(new int[]{0}, i.insertionSort(new int[]{0}));

        // Multiple elements test
        assertArrayEquals(
                new int[]{1, 3, 4, 5, 9},
                i.insertionSort(new int[]{9, 5, 1, 4, 3})
        );
    }
}