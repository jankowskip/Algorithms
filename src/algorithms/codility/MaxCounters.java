package algorithms.codility;

public class MaxCounters { // Codility result: 88% corectness: 100% performance: 80%
							

	public int[] solution(int N, int[] A) {
		int[] result = new int[N];
		int maxValue = 0;
		int numberToAdd = 0;
		int lastNumberToAdd = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < N + 1) {
				result[A[i] - 1]++;
				if (result[A[i] - 1] > maxValue) {
					maxValue = result[A[i] - 1];
				}
			} else {
				lastNumberToAdd = numberToAdd;
				numberToAdd = maxValue + lastNumberToAdd;
				result = new int[N];
				maxValue = 0;
			}
		}
		for (int j = 0; j < N; j++) {
			result[j] += numberToAdd;
		}
		return result;
	}

}
