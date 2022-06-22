import java.util.Arrays;
public class CodilityCyclicRotation {
    public CodilityCyclicRotation() {
        int[] num = {};
        System.out.println(Arrays.toString(solution(num, 0)));
        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 3)));
    }

    public int[] solution(int[] A, int K) {
        int arrLen = A.length;

        if(arrLen == 0)
            return A;

        // Reduce the number of loops needed
        int noOfShifts = K % A.length;

        for (int i = 0; i < noOfShifts; i++)
            A = rightShiftArray(A);

        return A;
    }

    /**
     * Right shift array by one index.
     * @param arr array to right shift
     * @return right shifted array
     */
    public int[] rightShiftArray(int[] arr) {
        int arrLen = arr.length;
        int temp = arr[arrLen-1];

        for (int i = 0; i < arrLen; i++) {
            int elm = arr[i];

            arr[i] = temp;

            temp = elm;
        }

        return arr;
    }

    public static void main(String args[]) {
        new CodilityCyclicRotation();
    }
}