package algorithms.codility;

public class OddOccurrencesInArray { // Codility result: 100%

	public int solution(int[] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}
}
