package algorithms.codility;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MissingInteger { // Codility result: 100%
	public int solution(int[] A) {
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				set.add(A[i]);
			}
		}
		int result = 1;
		for (int i : set) {
			if (i > result) {
				return result;
			}
			result++;
		}
		return result;
	}
}
