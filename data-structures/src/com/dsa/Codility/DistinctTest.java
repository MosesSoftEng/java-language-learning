package com.dsa.Codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctTest {
    private Distinct d = new Distinct();

    @Test
    public void solution() {
        assertEquals(0, d.solution(new int[] {}));
        assertEquals(3, d.solution(new int[] {2, 2, 1, 3, 1, 1, 1}));

        assertEquals(1, d.solution(new int[] {1}));
        assertEquals(1, d.solution(new int[] {1, 1, 1, 1}));
    }
}