package algorithms.basic;

import java.util.ArrayList;
import java.util.List;

public class Factorial { // We return 0 for negative numbers and for numbers higher than Integer range.
	List<Integer> facList;

	public Factorial() {
		facList = new ArrayList<Integer>();
		facList.add(1);
		facList.add(1);

	}

	public int factorialRecursion(int a) {
		if (a > 12 || a<0) {
			return 0;
		}
		if (a < 2) {
			return 1;
		}
		return factorialRecursion(a - 1) * a;

	}

	public int factorialIteration(int a) {
		if (a > 12 || a<0) {
	
			return 0;
		}
		if (a < 2) {
			return 1;
		}
	
		int result = 1;
		for (int i = a; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	public int dynamicFactorial(int a) {
		if (a > 12 || a<0) {
			return 0;
		}
		if (a < 2) {
			return 1;
		}
		try {
			facList.get(a);
		} catch (Exception e) {
			for (int i = facList.size(); i <= a; i++) {
				facList.add(facList.get(i - 1) * i);
			}
		}
		return facList.get(a);

	}

}
