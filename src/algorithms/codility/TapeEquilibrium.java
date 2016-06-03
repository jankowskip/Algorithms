package algorithms.codility;

import java.util.stream.IntStream; 
public class TapeEquilibrium { // Codility: result 100%
	
	public int solution(int[] A) {
		int sum1 = A[0];
		int sum2 = IntStream.of(A).sum() - sum1;
		int diffrenceOfSums = Math.abs(sum1 - sum2);
		int minValue = diffrenceOfSums;

		for (int i = 1; i < A.length - 1; i++) {
			sum1 += A[i];
			sum2 -= A[i];
			diffrenceOfSums = Math.abs(sum1 - sum2);
			if (diffrenceOfSums < minValue) {
				minValue = diffrenceOfSums;
			}
		}
		return (int) minValue;

	}
}
