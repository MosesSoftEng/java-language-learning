package Codility;

import static org.junit.Assert.*;

public class GenomicRangeQueryTest {
    GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @org.junit.Test
    public void solution() {
        assertArrayEquals(
                new int[] {},
                new GenomicRangeQuery().solution("", new int[] {}, new int[] {})
        );
    }
}