package algorithms.codility;

public class PermMissingElem { //Codility result: 100%

    public int solution(int[] A) {

        int N = A.length + 1;
        int total = N * (N + 1) / 2;

        for (int i : A) {

            total -= i;
        }

        return total;
    }
}
