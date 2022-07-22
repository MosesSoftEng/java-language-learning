package Codility;

import static help.Helper.Out;

public class CodilityCountDiv {
    /**
     * Class constructor
     */
    CodilityCountDiv() {
        /*Tests*/
        Out("Empty range test [0, 0] 11, 1 expected: " + solution(0,0,11));
        Out("Empty range test [1, 1] 11, 1 expected: " + solution(1,1,11));
        Out("Empty range test [10, 10] 5, 0 expected: " + solution(10,10,5));
        Out("Empty range test [10, 10] 20, 0 expected: " + solution(10,10,20));
        Out("[0, 20] 1, 21 expected: " + solution(0,20,1));
    }

    /**
     * A method that returns the number of integers divisible by an integer within a range.
     * @param A Start of range
     * @param B End of range
     * @param K Divisor to check
     * @return number of integers divisible by K
     */
    public int solution(int A, int B, int K) {
        int divisibleCount = 0, firstDivisibleInteger = 0, lastDivisibleInteger = 0;

        if(K == 0) return 0;

        if(K > B)
            if(A == 0)
                return 1;

        // Skip number integers between A and K
        if(K > A)
            A = K;

        // Get first divisible integer
        for (int i = A; i < B+1; i++) {
            if(i % K == 0){
                firstDivisibleInteger = i;
                break;
            }
        }

        Out("firstDivisibleInteger: " + firstDivisibleInteger);

        // Get last divisible integer
        for (int i = B; i > A-1; i--) {
            if(i % K == 0){
                lastDivisibleInteger = i;
                break;
            }
        }

        Out("lastDivisibleInteger: " + lastDivisibleInteger);

        int diff = (lastDivisibleInteger - firstDivisibleInteger);

        if(diff == 0)
            return 0;

        divisibleCount = (lastDivisibleInteger - firstDivisibleInteger)/K + 1;

        if(A == 0)
            divisibleCount++;


        return divisibleCount;
    }

    /**
     * Program entry point
     * @param args - passed arguments to the program
     */
    public static void main(String args[]) {
        new CodilityCountDiv(); // Instantiate class, create new object
    }
}
