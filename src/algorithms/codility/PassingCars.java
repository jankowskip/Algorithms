package algorithms.codility;

public class PassingCars {

	public int solution(int A[]) {
		int result = 0;
		int multiply = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				multiply++;
			} else {
				result += 1 * multiply;
			}
			if (result > 1000000000) {
				return -1;
			}

		}
		return result;
	}

}
