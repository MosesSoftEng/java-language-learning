package Codility;

/**
 * Codility lesson 5: GenomicRangeQuery
 *
 */

public class GenomicRangeQuery {
    /**
     * Program entry point
     * @param args - passed arguments to the program
     */
    public static void main(String args[]) {
        new GenomicRangeQuery() {    // Instantiate class, create new object
        };
    }

    /**
     * Function that returns the minimal impact factor of nucleotides contained in a DNA sequence.
     * @param S The DNA sequence
     * @param P Start point of DNA sequence to check from
     * @param Q End  point of DNA sequence to check to
     * @return
     */
    public int[] solution(String S, int[] P, int[] Q) {
        int [] answers = new int[P.length];

        int dnaLength = S.length();
        /*
         * Get nucleotide running occurrence in full DNA sequence
         */

        /*  for S = CAGCCTA

                A C G T
               {0,1,0,0}    C
               {1,0,0,0}    A
               {0,0,1,0}    G
               {0,1,0,0}    C
               {0,1,0,0}    C
               {0,0,0,1}    T
               {1,0,0,0}    A
         */
        int[][] nucleotideRunningOccurrence = new int[dnaLength][4];

        // Loop each row
        for (int i = 0; i < nucleotideRunningOccurrence.length; i++) {
            char c = S.charAt(i);

            switch (c) {
                case 'A':
                    nucleotideRunningOccurrence[i][0] = 1;
                    break;
                case 'C':
                    nucleotideRunningOccurrence[i][1] = 1;
                    break;
                case 'G':
                    nucleotideRunningOccurrence[i][2] = 1;
                    break;
                case 'T':
                    nucleotideRunningOccurrence[i][3] = 1;
                    break;
            }
        }

        // Get running total of each DNA nucleotide skip first row
        for (int i = 1; i < dnaLength; i++) {
            // Sum current row values with previous row values

            for (int j = 0; j < 4; j++)
                nucleotideRunningOccurrence[i][j] +=
                        nucleotideRunningOccurrence[i-1][j];
        }

        /* Expected output for S = CAGCCTA

                A C G T
               {0,1,0,0}    C
               {1,1,0,0}    A
               {1,1,1,0}    G
               {1,2,1,0}    C
               {1,3,1,0}    C
               {1,3,1,1}    T
               {2,3,1,1}    A
         */

        for(int i=0; i<P.length; i++) {
            int index1 = P[i];
            int index2 = Q[i];

            for(int j=0; j<4; j++) {
                int lowerIndexCount;
                lowerIndexCount = nucleotideRunningOccurrence[index1 - 1][j];

                if (nucleotideRunningOccurrence[index2][j] - lowerIndexCount > 0) {
                    answers[i] = j + 1;
                    break;
                }
            }
        }

        return answers;
    }
}
