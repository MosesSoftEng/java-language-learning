package Codility;

import java.math.BigInteger;

/**
 * Codility lesson 3: Time Complexity
 *
 * https://app.codility.com/demo/results/trainingVCJXHA-ETS/
 *
 * 1. Get array sum as arrSum
 * 2. Loop from index 0, getting
 * 3.   Get sum of first part of array as arrSumFirstPart
 * 4.   Get sum of second part of array by difference of arrSum and arrSumFirstPart as arrSumSecondPart
 * 5.   Get absolute difference as absDifference
 * 6.   Get minimum of absDifference and minAbsDifference save to minAbsDifference
 * 7. Return minAbsDifference
 */
public class CodilityTapeEquilibrium {
    public CodilityTapeEquilibrium() {
        System.out.println(solution(new int[]{-3, 1, 2, -4, 3}));
    }

    public int solution(int[] A) {
        int absDifference,
                minAbsDifference = Integer.MAX_VALUE;

        BigInteger arrSumFirstPart = new BigInteger("0"),
                arrSumSecondPart = new BigInteger("0"),
                arrSum = new BigInteger("0");

        for(int i=0; i<A.length; i++)
            arrSum = arrSum.add(BigInteger.valueOf(A[i]));

        for (int i = 0; i < A.length; i++) {
            arrSumFirstPart = arrSumFirstPart.add(BigInteger.valueOf(A[i]));
            arrSumSecondPart = arrSum.subtract(arrSumFirstPart);

            absDifference = arrSumFirstPart.subtract(arrSumSecondPart).abs().intValue();

            minAbsDifference = Math.min(minAbsDifference, absDifference);
        }

        return minAbsDifference;
    }

    public static void main (String args[]) {
        new CodilityTapeEquilibrium();
    }
}
