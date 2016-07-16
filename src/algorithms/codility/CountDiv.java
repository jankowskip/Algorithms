package algorithms.codility;

public class CountDiv {
	 public int solution(int A, int B, int K) {
	       int result =B/K;
	       int numbersToA = (A-1)/K;
	       result = result - numbersToA;
	       return result;
	    }
}
