package Codility;

import java.util.HashSet;

/**
 * Codility lesson 4: MissingInteger
 *
 * https://app.codility.com/demo/results/training7YCJVZ-77E/ 100%
 *
 * NOTES: HashSet takes unique values only. Use HashSet contains method to check if value exists
 *
 * PseudoCode
 * 1. Add A array elements to the set hashSet ignore element below value of 1
 * 2. Loop from 1 to hashSet.size() check if hashSet contains element, if not return index
 * 3. If hashSet.size() > 1, return hashSet.size() + 1
 * 3. Return 1 by default
 */
public class CodilityMissingInteger {
    CodilityMissingInteger() {
        System.out.println("Single integer 2\n1 expected: " + solution(new int[]{2}));
        System.out.println("Single integer 1\n2 expected: " + solution(new int[]{1}));
        System.out.println("Missing int element\n5 expected: " + solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println("Negative values only\n1 expected: " + solution(new int[]{-2, -1, 0}));
        System.out.println("No missing int\n5 expected: " + solution(new int[]{4, 1, 3, 2}));
    }

    public int solution(int[] A) {
        int hashSetSize, arrLen = A.length;
        HashSet<Integer> hashSet = new HashSet();

        // Remove duplicates
        for (int i = 0; i < arrLen; i++)
            if(A[i] > 0)
                hashSet.add(A[i]);

        hashSetSize = hashSet.size();

        // Check for skipped element in sequence
        for (int i = 1; i < arrLen + 1; i++)
            if(!hashSet.contains(i))
                return i;

        // Return next element if no missing element
        if(hashSetSize > 0)
            return hashSetSize + 1;

        return 1;
    }

    public static void main(String args[]) {
        new CodilityMissingInteger();
    }
}
