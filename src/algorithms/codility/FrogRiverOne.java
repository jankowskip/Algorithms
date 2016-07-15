package algorithms.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne { // Codility result: 100%

	public int solution(int X, int[] A) {
		int seconds = -1;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
			if (set.size() == X) {
				seconds = i;
				break;
			}
		}
		return seconds;
	}
}
