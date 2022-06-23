import java.util.HashSet;

/**
 * Codility lesson 4: PermCheck
 *
 * https://app.codility.com/demo/results/training7YCJVZ-77E/ 100%
 *
 * NOTES: HashSet takes unique values only. Use HashSet contains method to check if value exists
 *
 * PseudoCode
 * 1. Add A array elements to the set hashSetPerm, if there is duplicate entry return 0
 * 2. Loop from 1 to N check if hashSetPerm contains element, if not return 0
 * 3. Return 1
 */
public class CodilityPermCheck {
    CodilityPermCheck() {
        System.out.println("Correct perm\n1 expected: " + solution(new int[]{4, 1, 3, 2}));
        System.out.println("Duplicate element\n0 expected: " + solution(new int[]{4, 1, 1, 2}));
        System.out.println("Skipped element\n0 expected: " + solution(new int[]{4, 1, 5, 2}));
        System.out.println("Skipped element\n0 expected: " + solution(new int[]{4, 3, 5, 2}));
        System.out.println("Skipped element\n0 expected: " + solution(new int[]{1, 2, 3, 4, 4}));
    }

    public int solution(int[] A) {
        int arrLen = A.length;
        HashSet<Integer> hashSetPerm = new HashSet();

        // Check for duplicate
        for (int i = 0; i < arrLen; i++)
            if(!hashSetPerm.add(A[i]))  // Returns false if element exist.
                return 0;

        // Check for skipped element in sequence
        for (int i = 1; i < arrLen + 1; i++) // Start from 1 to N (arrLen + 1)
            if(!hashSetPerm.contains(i))
                return 0;

        return 1;
    }


    public static void main(String args[]) {
        new CodilityPermCheck();
    }
}
