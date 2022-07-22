package Codility;

import java.util.HashMap;

public class CodilityOddOccurrencesInArray {
    public CodilityOddOccurrencesInArray() {
        System.out.println(solution(new int[]{1, 1, 1, 2, 2, 3, 3, 4, 1, 4, 7}));
    }

    public int solution(int[] A) {
        HashMap<Integer, Integer> intHashmap = new HashMap<>();

        // Count the number of occurrence
        for (int i:A) {
            Integer elm = intHashmap.get(i);

            // First occurrence
            if(elm == null)
                intHashmap.put(i, 1);
            else // Increment count
                intHashmap.replace(i, elm+1);
        }

        // Get key with count of 1
        for (HashMap.Entry<Integer, Integer> entry : intHashmap.entrySet()) {
            if(entry.getValue() % 2 == 1)
                return entry.getKey();
        }

        return -1;
    }

    public static void main(String args[]) {
        new CodilityOddOccurrencesInArray();
    }
}
