package algorithms.basic;

public class Factorial {

	public int factorialRecursion(int a) {
		if (a < 2) {
			return 1;
		}
		return  factorialRecursion(a - 1) * a;
		
	}

	public int factorialIteration(int a) {
		int result = 1;
		for (int i = a; i > 0; i--) {
			result *= i;
		}
		return result;
	}
}
