package algorithms.codility;

public class PermMissingElem { //Codility result: 80% Corectness: 100%, Performance: 60% Im gonna try to fix this soon.

    public int solution(int[] A) {

        int n = A.length + 1;
        int total = n * (n + 1) / 2;

        for (int i=0; i<A.length; i++) {

            total -= A[i];
        }

        return total;
    }
}
