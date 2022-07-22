package Codility;

import java.util.*;

/**
 *
 */

public class CodilityPermMissingElem {
    public CodilityPermMissingElem() {
        System.out.println("Codility.CodilityPermMissingElem: " + solution(new int[]{}));
    }
    /**
     *  Find the missing integer in Array range [1..(N + 1)]
     * @param A Array of integer
     * @return missing integer
     */
    public int solution(int[] A) {
        // Convert array to hashset
        // HashSet methods are faster than array's, and data are unique
        HashSet<Integer> numHashSet = new HashSet<>();

        // Add int elements to hashset
        // Cannot use casting coz HashSet does not use primitive values like int
        for (int i = 0; i < A.length; i++)
            numHashSet.add(A[i]);

        // Check if hashset does not contain an element
        int rangeCheck = A.length + 2; // Add 2 to cater for last element and for first element

        for (int i = 1; i < rangeCheck; i++) {
            if(!numHashSet.contains(i))
                return i;
        }

        return 1;
    }

    public static void main (String args[]) {
        new CodilityPermMissingElem();
    }
}
