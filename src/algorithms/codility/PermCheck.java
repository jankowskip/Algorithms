package algorithms.codility;

import java.util.HashSet;
import java.util.Set;

public class PermCheck { // Codility result: 100%
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		int lenght = A.length;
		for (int i = 0; i < lenght; i++) {
			if (A[i] > lenght) {
				return 0;
			}
			set.add(A[i]);
		}
		if (set.size() == lenght) {
			return 1;
		}
		return 0;
	}
}
