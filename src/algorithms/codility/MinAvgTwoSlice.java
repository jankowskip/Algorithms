package algorithms.codility;

public class MinAvgTwoSlice {
	public int solution(int[] A) {
		double min = (A[0] + A[1]) / 2;
		int result = 0;
		int lenght = A.length;
		if (lenght <= 2) {
			return 0;
		}
		for (int i = 2; i < lenght; i++) {
			double avgOfTwo = (A[i - 1] + A[i]) / 2.0;
			double avgOfThree = (A[i - 2] + A[i - 1] + A[i]) / 3.0;
			if (avgOfTwo < min) {
				min = avgOfTwo;
				result = i - 1;
			}
			if (avgOfThree < min) {
				min = avgOfThree;
				result = i - 2;
			}
		}
		return result;

	}
}
