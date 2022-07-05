/**
 * Topic:
 * Codility Lesson 5: Prefix Sums
 *
 * Task:
 * PassingCars
 * Count number of passes between cars moving in opposite direction.
 *
 * NOTES:
 * Prefix and Suffix sums, running total, continuous summation as you loop.
 *
 * Solution Link
 * https://app.codility.com/demo/results/trainingMREUX8-8R8/ 100%
 *
 * PseudoCode naive approach, Complexity O(N^2) Quadratic time
 * ------------------------------------------------------------------------
 * DECLARE passesCount
 * LOOP array
 *  IF item at index is 0
 *      LOOP array from this index
 *          if item_ at index_ is 1 increment passesCount
 *      ENDLOOP
 *  ENDIF
 * ENDLOOP
 * RETURN passCount
 * ------------------------------------------------------------------------
 *
 * PseudoCode Complexity O(n) Linear time
 * ------------------------------------------------------------------------
 * DECLARE passesCount = 0, incrementValue = 0;
 * LOOP array
 *  IF passesCount > 1000000000
 *      SET passesCount to -1
 *      BREAK loop
 *  IF item at index is 0
 *      INCREMENT incrementValue by 1
 *  ELSE
 *      INCREMENT passesCount by incrementValue
 *  ENDIF
 * ENDLOOP
 * RETURN passCount
 * ------------------------------------------------------------------------
 */
public class CodilityPassingCars {
    CodilityPassingCars() {
        /*Tests*/

        // Test empty array
        Out("Empty array, 0 expected value: " + solution(new int[]{}));
        Out("Empty array, 5 expected value: " + solution(new int[]{0, 1, 0, 1, 1}));
    }

    public int solution(int[] A) {
        int passesCount = 0, incrementValue = 0;

        // Loop array
        for (int i: A) {
            // If a billion passes is exceeded
            if(passesCount > 1000000000) {
                passesCount = -1;
                break;
            }

            if(i == 0)
                incrementValue++;
            else
                passesCount+=incrementValue;
        }

        return passesCount;
    }

    public static void main(String args[]) {
        new CodilityPassingCars();
    }

    public void Out(String str) {
        System.out.println(str);
    }
}
