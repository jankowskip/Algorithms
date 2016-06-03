package algorithms.codility;

public class FrogJmp { // Codility result : 100%
	public int solution(int X, int Y, int D) {
		int distance = Y - X;
		int division = distance / D;
		int restOfDivision = distance % D;
		if (restOfDivision == 0) {
			return division;
		} else {
			return division + 1;
		}

	}
}
