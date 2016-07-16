package algorithms.codility;

public class MaxCounters { // Codility result: 100%
							

	public int[] solution(int N, int[] A) {
		int[] result = new int[N];
		int maxValue = 0;
		int minValue = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < N + 1) {
				if (result[A[i] - 1] >= minValue) {
					result[A[i] - 1]++;
				} else {
					result[A[i] - 1] = minValue + 1;
				}
				if (result[A[i] - 1] > maxValue) {
					maxValue = result[A[i] - 1];
				}
			} else {
				minValue = maxValue;
			}
		}
		for (int j = 0; j < N; j++) {
			if (result[j] < minValue) {
				result[j] = minValue;
			}
		}
		return result;
	}

}
