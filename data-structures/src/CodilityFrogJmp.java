/**
 * Number of times of a value you can get from another value. Frog Jumps
 * Find by using division, equals to number of Quotient.
 */
public class CodilityFrogJmp {
    public CodilityFrogJmp() {
        System.out.println(solution(10, 85, 30));
    }

    /**
     * Count the minimal number of jumps that the small frog must perform to reach its target.
     * @param X Start position
     * @param Y End position
     * @param D Jump distance
     * @return No of jumps
     */
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int jumps = distance / D;

        // If there is a remaining small distance
        if(distance % D != 0)
            jumps++;

        return jumps;
    }

    public static void main(String args[]) {
        new CodilityFrogJmp();
    }
}
