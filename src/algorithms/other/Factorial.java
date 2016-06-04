package algorithms.other;

public class Factorial {

	public int factorialRecursion(int a) {
		int result = 0;
		if (a < 2) {
			return 1;
		}
		result = factorialRecursion(a - 1) * a;
		return result;
	}

	public int factorialIteration(int a) {
		int result = 1;
		for (int i = a; i > 0; i--) {
			result *= i;

		}
		return result;
	}
}
