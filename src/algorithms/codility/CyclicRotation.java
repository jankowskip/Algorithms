package algorithms.codility;

public class CyclicRotation { // Codility result: 100%
	public int[] solution(int[] A, int K) {
		if(A==null || A.length==0){
			return A;
		}
		int lenght = A.length;
		int przesuneicie = K % lenght;
		if (przesuneicie == 0) { 
			return A;
		}

		int newA[] = new int[lenght];
	

		for (int i = 0; i < lenght; i++) {
		 newA[(i+przesuneicie)%lenght] = A[i];
		}
		return newA;
	}

}
